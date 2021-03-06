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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the call data entry service. This utility wraps {@link CallDataEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see CallDataEntryPersistence
 * @see CallDataEntryPersistenceImpl
 * @generated
 */
public class CallDataEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(CallDataEntry callDataEntry) {
		getPersistence().clearCache(callDataEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CallDataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CallDataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CallDataEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CallDataEntry update(CallDataEntry callDataEntry)
		throws SystemException {
		return getPersistence().update(callDataEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CallDataEntry update(CallDataEntry callDataEntry,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(callDataEntry, serviceContext);
	}

	/**
	* Caches the call data entry in the entity cache if it is enabled.
	*
	* @param callDataEntry the call data entry
	*/
	public static void cacheResult(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry) {
		getPersistence().cacheResult(callDataEntry);
	}

	/**
	* Caches the call data entries in the entity cache if it is enabled.
	*
	* @param callDataEntries the call data entries
	*/
	public static void cacheResult(
		java.util.List<com.liferay.docs.customercare.model.CallDataEntry> callDataEntries) {
		getPersistence().cacheResult(callDataEntries);
	}

	/**
	* Creates a new call data entry with the primary key. Does not add the call data entry to the database.
	*
	* @param callDataEntryId the primary key for the new call data entry
	* @return the new call data entry
	*/
	public static com.liferay.docs.customercare.model.CallDataEntry create(
		long callDataEntryId) {
		return getPersistence().create(callDataEntryId);
	}

	/**
	* Removes the call data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry that was removed
	* @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.customercare.model.CallDataEntry remove(
		long callDataEntryId)
		throws com.liferay.docs.customercare.NoSuchCallDataEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(callDataEntryId);
	}

	public static com.liferay.docs.customercare.model.CallDataEntry updateImpl(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(callDataEntry);
	}

	/**
	* Returns the call data entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchCallDataEntryException} if it could not be found.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry
	* @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.customercare.model.CallDataEntry findByPrimaryKey(
		long callDataEntryId)
		throws com.liferay.docs.customercare.NoSuchCallDataEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(callDataEntryId);
	}

	/**
	* Returns the call data entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry, or <code>null</code> if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.docs.customercare.model.CallDataEntry fetchByPrimaryKey(
		long callDataEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(callDataEntryId);
	}

	/**
	* Returns all the call data entries.
	*
	* @return the call data entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.docs.customercare.model.CallDataEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the call data entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of call data entries.
	*
	* @return the number of call data entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CallDataEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CallDataEntryPersistence)PortletBeanLocatorUtil.locate(com.liferay.docs.customercare.service.ClpSerializer.getServletContextName(),
					CallDataEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(CallDataEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CallDataEntryPersistence persistence) {
	}

	private static CallDataEntryPersistence _persistence;
}