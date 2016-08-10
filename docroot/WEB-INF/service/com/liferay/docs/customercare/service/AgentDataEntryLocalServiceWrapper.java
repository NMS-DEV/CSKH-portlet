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
 * Provides a wrapper for {@link AgentDataEntryLocalService}.
 *
 * @author DuyMB
 * @see AgentDataEntryLocalService
 * @generated
 */
public class AgentDataEntryLocalServiceWrapper
	implements AgentDataEntryLocalService,
		ServiceWrapper<AgentDataEntryLocalService> {
	public AgentDataEntryLocalServiceWrapper(
		AgentDataEntryLocalService agentDataEntryLocalService) {
		_agentDataEntryLocalService = agentDataEntryLocalService;
	}

	/**
	* Adds the agent data entry to the database. Also notifies the appropriate model listeners.
	*
	* @param agentDataEntry the agent data entry
	* @return the agent data entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry addAgentDataEntry(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.addAgentDataEntry(agentDataEntry);
	}

	/**
	* Creates a new agent data entry with the primary key. Does not add the agent data entry to the database.
	*
	* @param agentDataEntryId the primary key for the new agent data entry
	* @return the new agent data entry
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry createAgentDataEntry(
		long agentDataEntryId) {
		return _agentDataEntryLocalService.createAgentDataEntry(agentDataEntryId);
	}

	/**
	* Deletes the agent data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param agentDataEntryId the primary key of the agent data entry
	* @return the agent data entry that was removed
	* @throws PortalException if a agent data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry deleteAgentDataEntry(
		long agentDataEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.deleteAgentDataEntry(agentDataEntryId);
	}

	/**
	* Deletes the agent data entry from the database. Also notifies the appropriate model listeners.
	*
	* @param agentDataEntry the agent data entry
	* @return the agent data entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry deleteAgentDataEntry(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.deleteAgentDataEntry(agentDataEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agentDataEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry fetchAgentDataEntry(
		long agentDataEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.fetchAgentDataEntry(agentDataEntryId);
	}

	/**
	* Returns the agent data entry with the primary key.
	*
	* @param agentDataEntryId the primary key of the agent data entry
	* @return the agent data entry
	* @throws PortalException if a agent data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry getAgentDataEntry(
		long agentDataEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.getAgentDataEntry(agentDataEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the agent data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of agent data entries
	* @param end the upper bound of the range of agent data entries (not inclusive)
	* @return the range of agent data entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> getAgentDataEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.getAgentDataEntries(start, end);
	}

	/**
	* Returns the number of agent data entries.
	*
	* @return the number of agent data entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAgentDataEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.getAgentDataEntriesCount();
	}

	/**
	* Updates the agent data entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param agentDataEntry the agent data entry
	* @return the agent data entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry updateAgentDataEntry(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.updateAgentDataEntry(agentDataEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _agentDataEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_agentDataEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _agentDataEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry insertAgentData(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.insertAgentData(agentDataEntry);
	}

	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry getAgentDataEntryByAgentId(
		long companyId, long agentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntryLocalService.getAgentDataEntryByAgentId(companyId,
			agentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDynamicQuery(
		long agentId, java.lang.String fullName, java.lang.String userName,
		java.lang.String emailAddr, java.lang.String queueName,
		java.lang.String extension, java.lang.Class<?> clazz, boolean andSearch) {
		return _agentDataEntryLocalService.buildDynamicQuery(agentId, fullName,
			userName, emailAddr, queueName, extension, clazz, andSearch);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> removeDefaultUserFromList(
		java.util.List<com.liferay.portal.model.User> listOfUsers,
		long companyId) {
		return _agentDataEntryLocalService.removeDefaultUserFromList(listOfUsers,
			companyId);
	}

	@Override
	public java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> removeAgentOfOtherFromList(
		java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> listOfAgents,
		long companyId) {
		return _agentDataEntryLocalService.removeAgentOfOtherFromList(listOfAgents,
			companyId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> agentAdvanceSearch(
		long companyId, java.lang.String fullName, java.lang.String userName,
		java.lang.String emailAddr, java.lang.String queueName,
		java.lang.String extension, boolean andSearch) {
		return _agentDataEntryLocalService.agentAdvanceSearch(companyId,
			fullName, userName, emailAddr, queueName, extension, andSearch);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AgentDataEntryLocalService getWrappedAgentDataEntryLocalService() {
		return _agentDataEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAgentDataEntryLocalService(
		AgentDataEntryLocalService agentDataEntryLocalService) {
		_agentDataEntryLocalService = agentDataEntryLocalService;
	}

	@Override
	public AgentDataEntryLocalService getWrappedService() {
		return _agentDataEntryLocalService;
	}

	@Override
	public void setWrappedService(
		AgentDataEntryLocalService agentDataEntryLocalService) {
		_agentDataEntryLocalService = agentDataEntryLocalService;
	}

	private AgentDataEntryLocalService _agentDataEntryLocalService;
}