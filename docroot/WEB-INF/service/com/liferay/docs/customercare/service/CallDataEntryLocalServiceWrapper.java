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
 * Provides a wrapper for {@link CallDataEntryLocalService}.
 *
 * @author DuyMB
 * @see CallDataEntryLocalService
 * @generated
 */
public class CallDataEntryLocalServiceWrapper
	implements CallDataEntryLocalService,
		ServiceWrapper<CallDataEntryLocalService> {
	public CallDataEntryLocalServiceWrapper(
		CallDataEntryLocalService callDataEntryLocalService) {
		_callDataEntryLocalService = callDataEntryLocalService;
	}

	/**
	* Adds the call data entry to the database. Also notifies the appropriate model listeners.
	*
	* @param callDataEntry the call data entry
	* @return the call data entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry addCallDataEntry(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.addCallDataEntry(callDataEntry);
	}

	/**
	* Creates a new call data entry with the primary key. Does not add the call data entry to the database.
	*
	* @param callDataEntryId the primary key for the new call data entry
	* @return the new call data entry
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry createCallDataEntry(
		long callDataEntryId) {
		return _callDataEntryLocalService.createCallDataEntry(callDataEntryId);
	}

	/**
	* Deletes the call data entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry that was removed
	* @throws PortalException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry deleteCallDataEntry(
		long callDataEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.deleteCallDataEntry(callDataEntryId);
	}

	/**
	* Deletes the call data entry from the database. Also notifies the appropriate model listeners.
	*
	* @param callDataEntry the call data entry
	* @return the call data entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry deleteCallDataEntry(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.deleteCallDataEntry(callDataEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _callDataEntryLocalService.dynamicQuery();
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
		return _callDataEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _callDataEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _callDataEntryLocalService.dynamicQuery(dynamicQuery, start,
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
		return _callDataEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _callDataEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry fetchCallDataEntry(
		long callDataEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.fetchCallDataEntry(callDataEntryId);
	}

	/**
	* Returns the call data entry with the primary key.
	*
	* @param callDataEntryId the primary key of the call data entry
	* @return the call data entry
	* @throws PortalException if a call data entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry getCallDataEntry(
		long callDataEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.getCallDataEntry(callDataEntryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.liferay.docs.customercare.model.CallDataEntry> getCallDataEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.getCallDataEntries(start, end);
	}

	/**
	* Returns the number of call data entries.
	*
	* @return the number of call data entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCallDataEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.getCallDataEntriesCount();
	}

	/**
	* Updates the call data entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param callDataEntry the call data entry
	* @return the call data entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.docs.customercare.model.CallDataEntry updateCallDataEntry(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.updateCallDataEntry(callDataEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _callDataEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_callDataEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _callDataEntryLocalService.invokeMethod(name, parameterTypes,
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
		return _callDataEntryLocalService.addCallDataEntry(userId, callId,
			queueName, callNumber, channel, waitTime, durationTime, extension,
			status, channelOld, channelTo, extOfMonitor, causeCode, sipCause);
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry updateCallDataEntry(
		long userId, java.lang.String causeCode, java.lang.String sipCause,
		java.lang.String status, long callDataEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.updateCallDataEntry(userId,
			causeCode, sipCause, status, callDataEntryId);
	}

	@Override
	public com.liferay.portal.kernel.search.Hits getHits(long groupId,
		int start, int end, java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.getHits(groupId, start, end, keywords);
	}

	@Override
	public com.liferay.portal.kernel.search.Hits search(long companyId,
		java.lang.String userId, java.lang.String description,
		boolean andSearch, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntryLocalService.search(companyId, userId,
			description, andSearch, start, end, sort);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CallDataEntryLocalService getWrappedCallDataEntryLocalService() {
		return _callDataEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCallDataEntryLocalService(
		CallDataEntryLocalService callDataEntryLocalService) {
		_callDataEntryLocalService = callDataEntryLocalService;
	}

	@Override
	public CallDataEntryLocalService getWrappedService() {
		return _callDataEntryLocalService;
	}

	@Override
	public void setWrappedService(
		CallDataEntryLocalService callDataEntryLocalService) {
		_callDataEntryLocalService = callDataEntryLocalService;
	}

	private CallDataEntryLocalService _callDataEntryLocalService;
}