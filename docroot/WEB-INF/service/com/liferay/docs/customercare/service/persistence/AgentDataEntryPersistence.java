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

package com.liferay.docs.customercare.service.persistence;

import com.liferay.docs.customercare.model.AgentDataEntry;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the agent data entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see AgentDataEntryPersistenceImpl
 * @see AgentDataEntryUtil
 * @generated
 */
public interface AgentDataEntryPersistence extends BasePersistence<AgentDataEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgentDataEntryUtil} to access the agent data entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the agent data entry in the entity cache if it is enabled.
	*
	* @param agentDataEntry the agent data entry
	*/
	public void cacheResult(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry);

	/**
	* Caches the agent data entries in the entity cache if it is enabled.
	*
	* @param agentDataEntries the agent data entries
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> agentDataEntries);

	/**
	* Creates a new agent data entry with the primary key. Does not add the agent data entry to the database.
	*
	* @param agentDataEntryId the primary key for the new agent data entry
	* @return the new agent data entry
	*/
	public com.liferay.docs.customercare.model.AgentDataEntry create(
		long agentDataEntryId);

	/**
	* Removes the agent data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param agentDataEntryId the primary key of the agent data entry
	* @return the agent data entry that was removed
	* @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.AgentDataEntry remove(
		long agentDataEntryId)
		throws com.liferay.docs.customercare.NoSuchAgentDataEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.customercare.model.AgentDataEntry updateImpl(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the agent data entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchAgentDataEntryException} if it could not be found.
	*
	* @param agentDataEntryId the primary key of the agent data entry
	* @return the agent data entry
	* @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.AgentDataEntry findByPrimaryKey(
		long agentDataEntryId)
		throws com.liferay.docs.customercare.NoSuchAgentDataEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the agent data entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param agentDataEntryId the primary key of the agent data entry
	* @return the agent data entry, or <code>null</code> if a agent data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.AgentDataEntry fetchByPrimaryKey(
		long agentDataEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the agent data entries.
	*
	* @return the agent data entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the agent data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of agent data entries
	* @param end the upper bound of the range of agent data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of agent data entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.AgentDataEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the agent data entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of agent data entries.
	*
	* @return the number of agent data entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}