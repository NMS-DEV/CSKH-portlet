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

import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.base.CallDataEntryServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the call data entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.docs.customercare.service.CallDataEntryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.base.CallDataEntryServiceBaseImpl
 * @see com.liferay.docs.customercare.service.CallDataEntryServiceUtil
 */
public class CallDataEntryServiceImpl extends CallDataEntryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.docs.customercare.service.CallDataEntryServiceUtil} to access the call data entry remote service.
	 */
	 public CallDataEntry addCallDataEntry(long userId, String callId, String queueName, String callNumber,
			  String channel, String waitTime, String durationTime, String extension,
			  String status, String channelOld, String channelTo, String extOfMonitor,
			  String causeCode, String sipCause) throws SystemException, PortalException
	 {
		CallDataEntry callDataEntry = CallDataEntryLocalServiceUtil.addCallDataEntry(userId, callId, queueName, callNumber, channel, waitTime, durationTime, extension, status, channelOld, channelTo, extOfMonitor, causeCode, sipCause);
		return callDataEntry;
	 }
	 public CallDataEntry updateCallDataEntry(long userId, String causeCode, String sipCause, String status, long callDataEntryId)
	 {
		CallDataEntry callDataEntry = null;
		try 
		{
			callDataEntry = CallDataEntryLocalServiceUtil.updateCallDataEntry(userId,causeCode,sipCause, status, callDataEntryId);
		} 
		catch (PortalException e) 
		{
			e.printStackTrace();
		} 
		catch (SystemException e) 
		{
			e.printStackTrace();
		}
		return callDataEntry;		 
	 }	
}