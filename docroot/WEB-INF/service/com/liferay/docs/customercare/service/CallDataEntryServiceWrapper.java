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

package com.liferay.docs.customercare.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CallDataEntryService}.
 *
 * @author DuyMB
 * @see CallDataEntryService
 * @generated
 */
public class CallDataEntryServiceWrapper implements CallDataEntryService,
	ServiceWrapper<CallDataEntryService> {
	public CallDataEntryServiceWrapper(
		CallDataEntryService callDataEntryService) {
		_callDataEntryService = callDataEntryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _callDataEntryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_callDataEntryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _callDataEntryService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry addCallDataEntry(
		long userId, java.lang.String callId, java.lang.String queueName,
		java.lang.String callNumber, java.lang.String channel,
		java.lang.String waitTime, java.lang.String durationTime,
		java.lang.String extension, java.lang.String status,
		java.lang.String channelOld, java.lang.String channelTo,
		java.lang.String extOfMonitor, java.lang.String causeCode,
		java.lang.String sipCause)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryService.addCallDataEntry(userId, callId,
			queueName, callNumber, channel, waitTime, durationTime, extension,
			status, channelOld, channelTo, extOfMonitor, causeCode, sipCause);
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry updateCallDataEntry(
		long userId, java.lang.String causeCode, java.lang.String sipCause,
		java.lang.String status, long callDataEntryId) {
		return _callDataEntryService.updateCallDataEntry(userId, causeCode,
			sipCause, status, callDataEntryId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CallDataEntryService getWrappedCallDataEntryService() {
		return _callDataEntryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCallDataEntryService(
		CallDataEntryService callDataEntryService) {
		_callDataEntryService = callDataEntryService;
	}

	@Override
	public CallDataEntryService getWrappedService() {
		return _callDataEntryService;
	}

	@Override
	public void setWrappedService(CallDataEntryService callDataEntryService) {
		_callDataEntryService = callDataEntryService;
	}

	private CallDataEntryService _callDataEntryService;
}