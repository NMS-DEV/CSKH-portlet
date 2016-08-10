package com.liferay.docs.customercare.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.persistence.CallDataEntryActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.security.permission.PermissionChecker;

public class CallDataIndexer extends BaseIndexer 
{

	public static final String[] CLASS_NAMES = {CallDataEntry.class.getName()};
	public static final String PORTLET_ID = "customer-care"; 
	@Override
	public String[] getClassNames() 
	{
		
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() 
	{			
		return PORTLET_ID;
	}

	@Override
	public boolean hasPermission(PermissionChecker permissionChecker,
					String callDataClassName, long callDataClassPK, String actionId)
					throws Exception
	{
		return true;
	}
	@Override
	protected void doDelete(Object obj) throws Exception 
	{
		CallDataEntry callDataEntry = (CallDataEntry) obj;
		deleteDocument(callDataEntry.getCompanyId(), callDataEntry.getCallDataEntryId());
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception 
	{
		CallDataEntry callDataEntry = (CallDataEntry) obj;
		Document document = getBaseModelDocument(PORTLET_ID,callDataEntry);
		
		document.addDate(Field.MODIFIED_DATE, callDataEntry.getModifiedDate());
		document.addText(Field.TITLE, String.valueOf(callDataEntry.getUserId()));
		document.addText("callDataEntryId", String.valueOf(callDataEntry.getCallDataEntryId()));
		document.addKeyword(Field.GROUP_ID, getSiteGroupId(callDataEntry.getGroupId()));
		document.addKeyword(Field.SCOPE_GROUP_ID, callDataEntry.getGroupId());
		
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locate, String snippet,
			PortletURL portletURL) throws Exception 
	{
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		return summary;
	}

	@Override
	protected void doReindex(Object obj) throws Exception 
	{
		CallDataEntry callDataEntry = (CallDataEntry) obj;
		Collection<Document> documents = new ArrayList<Document>();
		
		documents.add(getDocument(callDataEntry));
		
		SearchEngineUtil.updateDocuments(getSearchEngineId(), callDataEntry.getCompanyId(), documents, true);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception 
	{
		long companyId = GetterUtil.getLong(ids[0]);
		reindex(companyId);
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception 
	{
		CallDataEntry callDataEntry = CallDataEntryLocalServiceUtil.getCallDataEntry(classPK);
		doReindex(callDataEntry);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) 
	{
		return PORTLET_ID;
	}
	protected void reindexEntries(long companyId) throws PortalException, SystemException
	{
		final Collection<Document> documents = new ArrayList<Document>();
		ActionableDynamicQuery actionableDynamicQuery = new CallDataEntryActionableDynamicQuery() {
			
			@Override
			protected void  addCriteria( DynamicQuery dynamicQuery)
			{
				
			}
			@Override
			protected void performAction(Object object) throws PortalException,
					SystemException 
			{
				CallDataEntry  callDataEntry = (CallDataEntry) object;
				Document document = getDocument(callDataEntry);
				documents.add(document);
			}
		};
		actionableDynamicQuery.setCompanyId(companyId);
		actionableDynamicQuery.performActions();
		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId, documents, true);
	}
}
