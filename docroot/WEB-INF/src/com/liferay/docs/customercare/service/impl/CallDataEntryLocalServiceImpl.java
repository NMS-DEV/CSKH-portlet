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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.config.FileUtils;
import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.service.base.CallDataEntryLocalServiceBaseImpl;
import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.QueryConfig;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.User;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * The implementation of the call data entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.customercare.service.CallDataEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.base.CallDataEntryLocalServiceBaseImpl
 * @see com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil
 */
public class CallDataEntryLocalServiceImpl
	extends CallDataEntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil} to access the call data entry local service.
	 */
	public CallDataEntry addCallDataEntry(long userId, String callId,
			String queueName, String callNumber, String channel,
			String waitTime, String durationTime, String extension,
			String status, String channelOld, String channelTo,
			String extOfMonitor, String causeCode, String sipCause)
			throws SystemException, PortalException 
	{
		
		User userCallAPI = UserLocalServiceUtil.getUserById(Long.valueOf(FileUtils.getValue("UserCallAPIId", "")));
		User userFormPBX = null;
		try {
			userFormPBX = userPersistence.findByPrimaryKey(userId);
		} catch (NoSuchUserException ex) {

		} catch (SystemException ex) {

		}

		long groupId = userCallAPI.getGroupId();
		long companyId = userCallAPI.getCompanyId();
		String screenName = userCallAPI.getScreenName();
		String staffName = "";
		if (userFormPBX != null) {
			staffName = userFormPBX.getScreenName();

		}
		long callDataEntryId = counterLocalService.increment();
		CallDataEntry callDataEntry = callDataEntryPersistence
				.create(callDataEntryId);
		// Add value of each entry
		callDataEntry.setUserId(userId);
		callDataEntry.setUserName(screenName);
		callDataEntry.setCreateDate(new Date());
		callDataEntry.setGroupId(groupId);
		callDataEntry.setCompanyId(companyId);

		callDataEntry.setCallId(callId);
		callDataEntry.setStaffName(staffName);
		callDataEntry.setQueueName(queueName);
		callDataEntry.setCallNumber(callNumber);
		callDataEntry.setChannel(channel);
		callDataEntry.setWaitTime(waitTime);
		callDataEntry.setDurationTime(durationTime);
		callDataEntry.setExtension(extension);
		callDataEntry.setStatus(status);
		callDataEntry.setChannelOld(channelOld);
		callDataEntry.setChannelTo(channelTo);
		callDataEntry.setExtOfMonitor(extOfMonitor);
		callDataEntry.setCauseCode(causeCode);
		callDataEntry.setSipCause(sipCause);

		callDataEntryPersistence.update(callDataEntry);

		// Update Index
		Indexer index = IndexerRegistryUtil
				.nullSafeGetIndexer(CallDataEntry.class);
		index.reindex(callDataEntry);

		return callDataEntry;
	}

	public CallDataEntry updateCallDataEntry(long userId, String causeCode,
			String sipCause, String status, long callDataEntryId)
			throws SystemException, PortalException {
		User user = null;
		try {
			user = userPersistence.findByPrimaryKey(userId);
		} catch (NoSuchUserException ex) {

		} catch (SystemException ex) {

		}
		CallDataEntry callDataEntry = callDataEntryPersistence
				.findByPrimaryKey(callDataEntryId);
		callDataEntry.setStatus(status);
		callDataEntry.setCauseCode(causeCode);
		callDataEntry.setSipCause(sipCause);
		if (user != null) {
			callDataEntry.setUserName(user.getScreenName());
			callDataEntry.setStaffName(user.getScreenName());
			callDataEntry.setUserId(userId);
			callDataEntry.setGroupId(user.getGroupId());
			callDataEntry.setCompanyId(user.getCompanyId());
		}

		callDataEntryPersistence.update(callDataEntry);
		// Update Index

		Indexer index = IndexerRegistryUtil
				.nullSafeGetIndexer(CallDataEntry.class);
		index.reindex(callDataEntry);

		return callDataEntry;
	}
	// Implement search mechanism
	protected SearchContext buildSearchContext(long groupId,String keywords, int start, int end) throws PortalException, SystemException
	{
		SearchContext searchContext = new SearchContext();
		Group  group = GroupLocalServiceUtil.getGroup(groupId);
		searchContext.setCompanyId(group.getCompanyId());
		searchContext.setStart(start);
		searchContext.setEnd(end);
		searchContext.setKeywords(keywords);
		searchContext.setGroupIds(new long[]{groupId});
		return searchContext;
	}
	public Hits getHits(long groupId, int start,int end,String keywords) throws PortalException, SystemException
	{
		Indexer index = IndexerRegistryUtil.getIndexer(CallDataEntry.class);
		SearchContext searchContext = buildSearchContext(groupId, keywords, start, end);
		return index.search(searchContext);	
	}

	public Hits search(long companyId, String userId, String description,
					   boolean andSearch, int start,
					   int end, Sort sort) throws SystemException 
	{
		try 
		{
			SearchContext searchContext = new SearchContext();
			searchContext.setAndSearch(andSearch);
			Map<String, Serializable> attributes = new HashMap<String, Serializable>();
			attributes.put("title", userId);
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
					.nullSafeGetIndexer(CallDataEntry.class);
			return indexer.search(searchContext);

		} catch (Exception e) {
			throw new SystemException();
		}
	}
}