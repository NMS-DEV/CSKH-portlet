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
 * Provides a wrapper for {@link CustomerInforEntryLocalService}.
 *
 * @author DuyMB
 * @see CustomerInforEntryLocalService
 * @generated
 */
public class CustomerInforEntryLocalServiceWrapper
	implements CustomerInforEntryLocalService,
		ServiceWrapper<CustomerInforEntryLocalService> {
	public CustomerInforEntryLocalServiceWrapper(
		CustomerInforEntryLocalService customerInforEntryLocalService) {
		_customerInforEntryLocalService = customerInforEntryLocalService;
	}

	/**
	* Adds the customer infor entry to the database. Also notifies the appropriate model listeners.
	*
	* @param customerInforEntry the customer infor entry
	* @return the customer infor entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry addCustomerInforEntry(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.addCustomerInforEntry(customerInforEntry);
	}

	/**
	* Creates a new customer infor entry with the primary key. Does not add the customer infor entry to the database.
	*
	* @param customerInforEntryId the primary key for the new customer infor entry
	* @return the new customer infor entry
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry createCustomerInforEntry(
		long customerInforEntryId) {
		return _customerInforEntryLocalService.createCustomerInforEntry(customerInforEntryId);
	}

	/**
	* Deletes the customer infor entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param customerInforEntryId the primary key of the customer infor entry
	* @return the customer infor entry that was removed
	* @throws PortalException if a customer infor entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry deleteCustomerInforEntry(
		long customerInforEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.deleteCustomerInforEntry(customerInforEntryId);
	}

	/**
	* Deletes the customer infor entry from the database. Also notifies the appropriate model listeners.
	*
	* @param customerInforEntry the customer infor entry
	* @return the customer infor entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry deleteCustomerInforEntry(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.deleteCustomerInforEntry(customerInforEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customerInforEntryLocalService.dynamicQuery();
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
		return _customerInforEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerInforEntryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customerInforEntryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _customerInforEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _customerInforEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry fetchCustomerInforEntry(
		long customerInforEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.fetchCustomerInforEntry(customerInforEntryId);
	}

	/**
	* Returns the customer infor entry with the primary key.
	*
	* @param customerInforEntryId the primary key of the customer infor entry
	* @return the customer infor entry
	* @throws PortalException if a customer infor entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry getCustomerInforEntry(
		long customerInforEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.getCustomerInforEntry(customerInforEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.liferay.docs.customercare.model.CustomerInforEntry> getCustomerInforEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.getCustomerInforEntries(start,
			end);
	}

	/**
	* Returns the number of customer infor entries.
	*
	* @return the number of customer infor entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCustomerInforEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.getCustomerInforEntriesCount();
	}

	/**
	* Updates the customer infor entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customerInforEntry the customer infor entry
	* @return the customer infor entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry updateCustomerInforEntry(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.updateCustomerInforEntry(customerInforEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _customerInforEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_customerInforEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _customerInforEntryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry findCustomerInforEntry(
		java.lang.String custName, java.lang.String custIdentiication) {
		return _customerInforEntryLocalService.findCustomerInforEntry(custName,
			custIdentiication);
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry addCustomerInfor(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.SearchException {
		return _customerInforEntryLocalService.addCustomerInfor(customerInforEntry);
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry updateCustomerInfor(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.search.SearchException {
		return _customerInforEntryLocalService.updateCustomerInfor(customerInforEntry);
	}

	@Override
	public com.liferay.portal.kernel.search.Hits search(long companyId,
		java.lang.String phoneNumber, java.lang.String description,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntryLocalService.search(companyId, phoneNumber,
			description, andSearch, start, end, sort);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CustomerInforEntryLocalService getWrappedCustomerInforEntryLocalService() {
		return _customerInforEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCustomerInforEntryLocalService(
		CustomerInforEntryLocalService customerInforEntryLocalService) {
		_customerInforEntryLocalService = customerInforEntryLocalService;
	}

	@Override
	public CustomerInforEntryLocalService getWrappedService() {
		return _customerInforEntryLocalService;
	}

	@Override
	public void setWrappedService(
		CustomerInforEntryLocalService customerInforEntryLocalService) {
		_customerInforEntryLocalService = customerInforEntryLocalService;
	}

	private CustomerInforEntryLocalService _customerInforEntryLocalService;
}