/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.customercare.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.liferay.docs.customercare.model.CustomerInforEntry;
import com.liferay.docs.customercare.service.base.CustomerInforEntryLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.QueryConfig;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;

/**
 * The implementation of the customer infor entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.customercare.service.CustomerInforEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.base.CustomerInforEntryLocalServiceBaseImpl
 * @see com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil
 */
public class CustomerInforEntryLocalServiceImpl
	extends CustomerInforEntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil} to access the customer infor entry local service.
	 */
	public CustomerInforEntry findCustomerInforEntry(String custName, String custIdentiication)
	{
		CustomerInforEntry custInforEntry = null;
		
		return custInforEntry;
	}
	public CustomerInforEntry addCustomerInfor(CustomerInforEntry customerInforEntry) throws SystemException, SearchException
	{
		customerInforEntryPersistence.update(customerInforEntry);
		// Update Index 
		Indexer index = IndexerRegistryUtil.nullSafeGetIndexer(CustomerInforEntry.class);
		index.reindex(customerInforEntry);
		return customerInforEntry;
	}
	public CustomerInforEntry updateCustomerInfor(CustomerInforEntry customerInforEntry) throws SystemException, SearchException
	{
		customerInforEntryPersistence.update(customerInforEntry);
		// Update Index 
		Indexer index = IndexerRegistryUtil.nullSafeGetIndexer(CustomerInforEntry.class);
		index.reindex(customerInforEntry);
		return customerInforEntry;
	}

	public Hits search(long companyId, String phoneNumber, String description,
			boolean andSearch, int start, int end, Sort sort)
			throws SystemException 
	{
		try 
		{
			SearchContext searchContext = new SearchContext();
			searchContext.setAndSearch(andSearch);
			Map<String, Serializable> attributes = new HashMap<String, Serializable>();
			attributes.put("title", phoneNumber);
			attributes.put("description", description);
			searchContext.setAttributes(attributes);
			searchContext.setCompanyId(companyId);
			searchContext.setEnd(end);

			QueryConfig queryConfig = new QueryConfig();
			queryConfig.setHighlightEnabled(false);
			queryConfig.setScoreEnabled(false);
			searchContext.setQueryConfig(queryConfig);

			if (sort != null) {
				searchContext.setSorts(sort);
			}
			searchContext.setStart(start);
			Indexer indexer = IndexerRegistryUtil
					.nullSafeGetIndexer(CustomerInforEntry.class);
			return indexer.search(searchContext);

		} 
		catch (Exception e) 
		{
			throw new SystemException();
		}
}	
}