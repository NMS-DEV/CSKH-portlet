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

import com.liferay.docs.customercare.model.CallDataEntry;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the call data entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see CallDataEntryPersistenceImpl
 * @see CallDataEntryUtil
 * @generated
 */
public interface CallDataEntryPersistence extends BasePersistence<CallDataEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CallDataEntryUtil} to access the call data entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the call data entry in the entity cache if it is enabled.
	*
	* @param callDataEntry the call data entry
	*/
	public void cacheResult(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry);

	/**
	* Caches the call data entries in the entity cache if it is enabled.
	*
	* @param callDataEntries the call data entries
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.customercare.model.CallDataEntry> callDataEntries);

	/**
	* Creates a new call data entry with the primary key. Does not add the call data entry to the database.
	*
	* @param callDataEntryId the primary key for the new call data entry
	* @return the new call data entry
	*/
	public com.liferay.docs.customercare.model.CallDataEntry create(
		long callDataEntryId);

	/**
	* Removes the call data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry that was removed
	* @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CallDataEntry remove(
		long callDataEntryId)
		throws com.liferay.docs.customercare.NoSuchCallDataEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.customercare.model.CallDataEntry updateImpl(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the call data entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchCallDataEntryException} if it could not be found.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry
	* @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CallDataEntry findByPrimaryKey(
		long callDataEntryId)
		throws com.liferay.docs.customercare.NoSuchCallDataEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the call data entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry, or <code>null</code> if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CallDataEntry fetchByPrimaryKey(
		long callDataEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the call data entries.
	*
	* @return the call data entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the call data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of call data entries
	* @param end the upper bound of the range of call data entries (not inclusive)
	* @return the range of call data entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the call data entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of call data entries
	* @param end the upper bound of the range of call data entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of call data entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the call data entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of call data entries.
	*
	* @return the number of call data entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}