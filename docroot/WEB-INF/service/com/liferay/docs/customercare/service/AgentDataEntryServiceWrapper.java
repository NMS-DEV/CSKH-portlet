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
 * Provides a wrapper for {@link AgentDataEntryService}.
 *
 * @author DuyMB
 * @see AgentDataEntryService
 * @generated
 */
public class AgentDataEntryServiceWrapper implements AgentDataEntryService,
	ServiceWrapper<AgentDataEntryService> {
	public AgentDataEntryServiceWrapper(
		AgentDataEntryService agentDataEntryService) {
		_agentDataEntryService = agentDataEntryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _agentDataEntryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_agentDataEntryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _agentDataEntryService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AgentDataEntryService getWrappedAgentDataEntryService() {
		return _agentDataEntryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAgentDataEntryService(
		AgentDataEntryService agentDataEntryService) {
		_agentDataEntryService = agentDataEntryService;
	}

	@Override
	public AgentDataEntryService getWrappedService() {
		return _agentDataEntryService;
	}

	@Override
	public void setWrappedService(AgentDataEntryService agentDataEntryService) {
		_agentDataEntryService = agentDataEntryService;
	}

	private AgentDataEntryService _agentDataEntryService;
}