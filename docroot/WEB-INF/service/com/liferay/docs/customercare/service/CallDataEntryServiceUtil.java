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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for CallDataEntry. This utility wraps
 * {@link com.liferay.docs.customercare.service.impl.CallDataEntryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author DuyMB
 * @see CallDataEntryService
 * @see com.liferay.docs.customercare.service.base.CallDataEntryServiceBaseImpl
 * @see com.liferay.docs.customercare.service.impl.CallDataEntryServiceImpl
 * @generated
 */
public class CallDataEntryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.docs.customercare.service.impl.CallDataEntryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.docs.customercare.model.CallDataEntry addCallDataEntry(
		long userId, java.lang.String callId, java.lang.String queueName,
		java.lang.String callNumber, java.lang.String channel,
		java.lang.String waitTime, java.lang.String durationTime,
		java.lang.String extension, java.lang.String status,
		java.lang.String channelOld, java.lang.String channelTo,
		java.lang.String extOfMonitor, java.lang.String causeCode,
		java.lang.String sipCause)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCallDataEntry(userId, callId, queueName, callNumber,
			channel, waitTime, durationTime, extension, status, channelOld,
			channelTo, extOfMonitor, causeCode, sipCause);
	}

	public static com.liferay.docs.customercare.model.CallDataEntry updateCallDataEntry(
		long userId, java.lang.String causeCode, java.lang.String sipCause,
		java.lang.String status, long callDataEntryId) {
		return getService()
				   .updateCallDataEntry(userId, causeCode, sipCause, status,
			callDataEntryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CallDataEntryService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CallDataEntryService.class.getName());

			if (invokableService instanceof CallDataEntryService) {
				_service = (CallDataEntryService)invokableService;
			}
			else {
				_service = new CallDataEntryServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(CallDataEntryServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CallDataEntryService service) {
	}

	private static CallDataEntryService _service;
}