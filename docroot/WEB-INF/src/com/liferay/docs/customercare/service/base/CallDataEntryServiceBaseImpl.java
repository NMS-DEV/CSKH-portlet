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

package com.liferay.docs.customercare.service.base;

import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.service.CallDataEntryService;
import com.liferay.docs.customercare.service.persistence.AgentDataEntryPersistence;
import com.liferay.docs.customercare.service.persistence.CallDataEntryPersistence;
import com.liferay.docs.customercare.service.persistence.CustomerInforEntryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the call data entry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.docs.customercare.service.impl.CallDataEntryServiceImpl}.
 * </p>
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.impl.CallDataEntryServiceImpl
 * @see com.liferay.docs.customercare.service.CallDataEntryServiceUtil
 * @generated
 */
public abstract class CallDataEntryServiceBaseImpl extends BaseServiceImpl
	implements CallDataEntryService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.docs.customercare.service.CallDataEntryServiceUtil} to access the call data entry remote service.
	 */

	/**
	 * Returns the agent data entry local service.
	 *
	 * @return the agent data entry local service
	 */
	public com.liferay.docs.customercare.service.AgentDataEntryLocalService getAgentDataEntryLocalService() {
		return agentDataEntryLocalService;
	}

	/**
	 * Sets the agent data entry local service.
	 *
	 * @param agentDataEntryLocalService the agent data entry local service
	 */
	public void setAgentDataEntryLocalService(
		com.liferay.docs.customercare.service.AgentDataEntryLocalService agentDataEntryLocalService) {
		this.agentDataEntryLocalService = agentDataEntryLocalService;
	}

	/**
	 * Returns the agent data entry remote service.
	 *
	 * @return the agent data entry remote service
	 */
	public com.liferay.docs.customercare.service.AgentDataEntryService getAgentDataEntryService() {
		return agentDataEntryService;
	}

	/**
	 * Sets the agent data entry remote service.
	 *
	 * @param agentDataEntryService the agent data entry remote service
	 */
	public void setAgentDataEntryService(
		com.liferay.docs.customercare.service.AgentDataEntryService agentDataEntryService) {
		this.agentDataEntryService = agentDataEntryService;
	}

	/**
	 * Returns the agent data entry persistence.
	 *
	 * @return the agent data entry persistence
	 */
	public AgentDataEntryPersistence getAgentDataEntryPersistence() {
		return agentDataEntryPersistence;
	}

	/**
	 * Sets the agent data entry persistence.
	 *
	 * @param agentDataEntryPersistence the agent data entry persistence
	 */
	public void setAgentDataEntryPersistence(
		AgentDataEntryPersistence agentDataEntryPersistence) {
		this.agentDataEntryPersistence = agentDataEntryPersistence;
	}

	/**
	 * Returns the call data entry local service.
	 *
	 * @return the call data entry local service
	 */
	public com.liferay.docs.customercare.service.CallDataEntryLocalService getCallDataEntryLocalService() {
		return callDataEntryLocalService;
	}

	/**
	 * Sets the call data entry local service.
	 *
	 * @param callDataEntryLocalService the call data entry local service
	 */
	public void setCallDataEntryLocalService(
		com.liferay.docs.customercare.service.CallDataEntryLocalService callDataEntryLocalService) {
		this.callDataEntryLocalService = callDataEntryLocalService;
	}

	/**
	 * Returns the call data entry remote service.
	 *
	 * @return the call data entry remote service
	 */
	public com.liferay.docs.customercare.service.CallDataEntryService getCallDataEntryService() {
		return callDataEntryService;
	}

	/**
	 * Sets the call data entry remote service.
	 *
	 * @param callDataEntryService the call data entry remote service
	 */
	public void setCallDataEntryService(
		com.liferay.docs.customercare.service.CallDataEntryService callDataEntryService) {
		this.callDataEntryService = callDataEntryService;
	}

	/**
	 * Returns the call data entry persistence.
	 *
	 * @return the call data entry persistence
	 */
	public CallDataEntryPersistence getCallDataEntryPersistence() {
		return callDataEntryPersistence;
	}

	/**
	 * Sets the call data entry persistence.
	 *
	 * @param callDataEntryPersistence the call data entry persistence
	 */
	public void setCallDataEntryPersistence(
		CallDataEntryPersistence callDataEntryPersistence) {
		this.callDataEntryPersistence = callDataEntryPersistence;
	}

	/**
	 * Returns the customer infor entry local service.
	 *
	 * @return the customer infor entry local service
	 */
	public com.liferay.docs.customercare.service.CustomerInforEntryLocalService getCustomerInforEntryLocalService() {
		return customerInforEntryLocalService;
	}

	/**
	 * Sets the customer infor entry local service.
	 *
	 * @param customerInforEntryLocalService the customer infor entry local service
	 */
	public void setCustomerInforEntryLocalService(
		com.liferay.docs.customercare.service.CustomerInforEntryLocalService customerInforEntryLocalService) {
		this.customerInforEntryLocalService = customerInforEntryLocalService;
	}

	/**
	 * Returns the customer infor entry remote service.
	 *
	 * @return the customer infor entry remote service
	 */
	public com.liferay.docs.customercare.service.CustomerInforEntryService getCustomerInforEntryService() {
		return customerInforEntryService;
	}

	/**
	 * Sets the customer infor entry remote service.
	 *
	 * @param customerInforEntryService the customer infor entry remote service
	 */
	public void setCustomerInforEntryService(
		com.liferay.docs.customercare.service.CustomerInforEntryService customerInforEntryService) {
		this.customerInforEntryService = customerInforEntryService;
	}

	/**
	 * Returns the customer infor entry persistence.
	 *
	 * @return the customer infor entry persistence
	 */
	public CustomerInforEntryPersistence getCustomerInforEntryPersistence() {
		return customerInforEntryPersistence;
	}

	/**
	 * Sets the customer infor entry persistence.
	 *
	 * @param customerInforEntryPersistence the customer infor entry persistence
	 */
	public void setCustomerInforEntryPersistence(
		CustomerInforEntryPersistence customerInforEntryPersistence) {
		this.customerInforEntryPersistence = customerInforEntryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return CallDataEntry.class;
	}

	protected String getModelClassName() {
		return CallDataEntry.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = callDataEntryPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.docs.customercare.service.AgentDataEntryLocalService.class)
	protected com.liferay.docs.customercare.service.AgentDataEntryLocalService agentDataEntryLocalService;
	@BeanReference(type = com.liferay.docs.customercare.service.AgentDataEntryService.class)
	protected com.liferay.docs.customercare.service.AgentDataEntryService agentDataEntryService;
	@BeanReference(type = AgentDataEntryPersistence.class)
	protected AgentDataEntryPersistence agentDataEntryPersistence;
	@BeanReference(type = com.liferay.docs.customercare.service.CallDataEntryLocalService.class)
	protected com.liferay.docs.customercare.service.CallDataEntryLocalService callDataEntryLocalService;
	@BeanReference(type = com.liferay.docs.customercare.service.CallDataEntryService.class)
	protected com.liferay.docs.customercare.service.CallDataEntryService callDataEntryService;
	@BeanReference(type = CallDataEntryPersistence.class)
	protected CallDataEntryPersistence callDataEntryPersistence;
	@BeanReference(type = com.liferay.docs.customercare.service.CustomerInforEntryLocalService.class)
	protected com.liferay.docs.customercare.service.CustomerInforEntryLocalService customerInforEntryLocalService;
	@BeanReference(type = com.liferay.docs.customercare.service.CustomerInforEntryService.class)
	protected com.liferay.docs.customercare.service.CustomerInforEntryService customerInforEntryService;
	@BeanReference(type = CustomerInforEntryPersistence.class)
	protected CustomerInforEntryPersistence customerInforEntryPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private CallDataEntryServiceClpInvoker _clpInvoker = new CallDataEntryServiceClpInvoker();
}