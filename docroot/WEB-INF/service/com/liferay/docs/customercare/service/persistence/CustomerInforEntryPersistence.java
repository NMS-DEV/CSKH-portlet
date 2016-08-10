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

import com.liferay.docs.customercare.model.CustomerInforEntry;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the customer infor entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see CustomerInforEntryPersistenceImpl
 * @see CustomerInforEntryUtil
 * @generated
 */
public interface CustomerInforEntryPersistence extends BasePersistence<CustomerInforEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CustomerInforEntryUtil} to access the customer infor entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the customer infor entry in the entity cache if it is enabled.
	*
	* @param customerInforEntry the customer infor entry
	*/
	public void cacheResult(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry);

	/**
	* Caches the customer infor entries in the entity cache if it is enabled.
	*
	* @param customerInforEntries the customer infor entries
	*/
	public void cacheResult(
		java.util.List<com.liferay.docs.customercare.model.CustomerInforEntry> customerInforEntries);

	/**
	* Creates a new customer infor entry with the primary key. Does not add the customer infor entry to the database.
	*
	* @param customerInforEntryId the primary key for the new customer infor entry
	* @return the new customer infor entry
	*/
	public com.liferay.docs.customercare.model.CustomerInforEntry create(
		long customerInforEntryId);

	/**
	* Removes the customer infor entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerInforEntryId the primary key of the customer infor entry
	* @return the customer infor entry that was removed
	* @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CustomerInforEntry remove(
		long customerInforEntryId)
		throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.docs.customercare.model.CustomerInforEntry updateImpl(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer infor entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchCustomerInforEntryException} if it could not be found.
	*
	* @param customerInforEntryId the primary key of the customer infor entry
	* @return the customer infor entry
	* @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CustomerInforEntry findByPrimaryKey(
		long customerInforEntryId)
		throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the customer infor entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param customerInforEntryId the primary key of the customer infor entry
	* @return the customer infor entry, or <code>null</code> if a customer infor entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.docs.customercare.model.CustomerInforEntry fetchByPrimaryKey(
		long customerInforEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the customer infor entries.
	*
	* @return the customer infor entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CustomerInforEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the customer infor entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer infor entries
	* @param end the upper bound of the range of customer infor entries (not inclusive)
	* @return the range of customer infor entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CustomerInforEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the customer infor entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of customer infor entries
	* @param end the upper bound of the range of customer infor entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of customer infor entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.docs.customercare.model.CustomerInforEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the customer infor entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of customer infor entries.
	*
	* @return the number of customer infor entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}