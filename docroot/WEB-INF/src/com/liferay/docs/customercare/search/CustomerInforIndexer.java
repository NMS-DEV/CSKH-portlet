package com.liferay.docs.customercare.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import javax.portlet.PortletURL;

import com.liferay.docs.customercare.model.CustomerInforEntry;
import com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.persistence.CustomerInforEntryActionableDynamicQuery;
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

public class CustomerInforIndexer extends BaseIndexer
{
	public static final String[] CLASS_NAMES = {CustomerInforEntry.class.getName()};
	public static final String PORTLET_ID = "customer-care"; 
	@Override
	public String[] getClassNames() {
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		// TODO Auto-generated method stub
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
		CustomerInforEntry customerInforEntry = (CustomerInforEntry) obj;
		deleteDocument(customerInforEntry.getCompanyId(), customerInforEntry.getCustomerInforEntryId());
		
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception 
	{
		CustomerInforEntry customerInforEntry = (CustomerInforEntry) obj;
		Document document = getBaseModelDocument(PORTLET_ID,customerInforEntry);
		
		document.addDate(Field.MODIFIED_DATE, customerInforEntry.getModifiedDate());
		document.addText(Field.TITLE,customerInforEntry.getPhoneNumber());
		document.addText("custIdentiication",customerInforEntry.getCustIdentiication());
		document.addText("customerInforEntryId",String.valueOf(customerInforEntry.getCustomerInforEntryId()));
		document.addKeyword(Field.GROUP_ID, getSiteGroupId(customerInforEntry.getGroupId()));
		document.addKeyword(Field.SCOPE_GROUP_ID, customerInforEntry.getGroupId());
		
		return document;		
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locate, String snippet,
			PortletURL portletURL) throws Exception {
		Summary summary = createSummary(document);
		summary.setMaxContentLength(200);
		return summary;
	}

	@Override
	protected void doReindex(Object obj) throws Exception 
	{
		CustomerInforEntry customerInforEntry = (CustomerInforEntry) obj;
		Collection<Document> documents = new ArrayList<Document>();
		
		documents.add(getDocument(customerInforEntry));
		
		SearchEngineUtil.updateDocuments(getSearchEngineId(), customerInforEntry.getCompanyId(), documents, true);
		
	}

	@Override
	protected void doReindex(String[] ids) throws Exception 
	{
		long companyId = GetterUtil.getLong(ids[0]);
		reindex(companyId);
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		CustomerInforEntry customerInforEntry = CustomerInforEntryLocalServiceUtil.getCustomerInforEntry(classPK);
		doReindex(customerInforEntry);
	}

	@Override
	protected String getPortletId(SearchContext searchContext) 
	{
		return PORTLET_ID;
	}
	protected void reindexEntries(long companyId) throws PortalException, SystemException
	{
		final Collection<Document> documents = new ArrayList<Document>();
		
		ActionableDynamicQuery actionableDynamicQuery = new CustomerInforEntryActionableDynamicQuery() {
			
			@Override
			protected void  addCriteria( DynamicQuery dynamicQuery)
			{
				
			}
			@Override
			protected void performAction(Object object) throws PortalException,
					SystemException 
			{
				CustomerInforEntry  customerInforEntry = (CustomerInforEntry) object;
				Document document = getDocument(customerInforEntry);
				documents.add(document);
			} 
		}; 
		actionableDynamicQuery.setCompanyId(companyId);
		actionableDynamicQuery.performActions();
		SearchEngineUtil.updateDocuments(getSearchEngineId(), companyId, documents, true);
	}	

}
