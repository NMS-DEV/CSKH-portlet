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

package com.liferay.docs.customercare.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CustomerInforEntry}.
 * </p>
 *
 * @author DuyMB
 * @see CustomerInforEntry
 * @generated
 */
public class CustomerInforEntryWrapper implements CustomerInforEntry,
	ModelWrapper<CustomerInforEntry> {
	public CustomerInforEntryWrapper(CustomerInforEntry customerInforEntry) {
		_customerInforEntry = customerInforEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return CustomerInforEntry.class;
	}

	@Override
	public String getModelClassName() {
		return CustomerInforEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customerInforEntryId", getCustomerInforEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("custName", getCustName());
		attributes.put("custIdentiication", getCustIdentiication());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("address", getAddress());
		attributes.put("service", getService());
		attributes.put("comment", getComment());
		attributes.put("status", getStatus());
		attributes.put("reason", getReason());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customerInforEntryId = (Long)attributes.get("customerInforEntryId");

		if (customerInforEntryId != null) {
			setCustomerInforEntryId(customerInforEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String custName = (String)attributes.get("custName");

		if (custName != null) {
			setCustName(custName);
		}

		String custIdentiication = (String)attributes.get("custIdentiication");

		if (custIdentiication != null) {
			setCustIdentiication(custIdentiication);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}

		String comment = (String)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
		}
	}

	/**
	* Returns the primary key of this customer infor entry.
	*
	* @return the primary key of this customer infor entry
	*/
	@Override
	public long getPrimaryKey() {
		return _customerInforEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer infor entry.
	*
	* @param primaryKey the primary key of this customer infor entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customerInforEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the customer infor entry ID of this customer infor entry.
	*
	* @return the customer infor entry ID of this customer infor entry
	*/
	@Override
	public long getCustomerInforEntryId() {
		return _customerInforEntry.getCustomerInforEntryId();
	}

	/**
	* Sets the customer infor entry ID of this customer infor entry.
	*
	* @param customerInforEntryId the customer infor entry ID of this customer infor entry
	*/
	@Override
	public void setCustomerInforEntryId(long customerInforEntryId) {
		_customerInforEntry.setCustomerInforEntryId(customerInforEntryId);
	}

	/**
	* Returns the group ID of this customer infor entry.
	*
	* @return the group ID of this customer infor entry
	*/
	@Override
	public long getGroupId() {
		return _customerInforEntry.getGroupId();
	}

	/**
	* Sets the group ID of this customer infor entry.
	*
	* @param groupId the group ID of this customer infor entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_customerInforEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this customer infor entry.
	*
	* @return the company ID of this customer infor entry
	*/
	@Override
	public long getCompanyId() {
		return _customerInforEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this customer infor entry.
	*
	* @param companyId the company ID of this customer infor entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_customerInforEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this customer infor entry.
	*
	* @return the user ID of this customer infor entry
	*/
	@Override
	public long getUserId() {
		return _customerInforEntry.getUserId();
	}

	/**
	* Sets the user ID of this customer infor entry.
	*
	* @param userId the user ID of this customer infor entry
	*/
	@Override
	public void setUserId(long userId) {
		_customerInforEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this customer infor entry.
	*
	* @return the user uuid of this customer infor entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customerInforEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this customer infor entry.
	*
	* @param userUuid the user uuid of this customer infor entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_customerInforEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this customer infor entry.
	*
	* @return the user name of this customer infor entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _customerInforEntry.getUserName();
	}

	/**
	* Sets the user name of this customer infor entry.
	*
	* @param userName the user name of this customer infor entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_customerInforEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this customer infor entry.
	*
	* @return the create date of this customer infor entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _customerInforEntry.getCreateDate();
	}

	/**
	* Sets the create date of this customer infor entry.
	*
	* @param createDate the create date of this customer infor entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_customerInforEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this customer infor entry.
	*
	* @return the modified date of this customer infor entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _customerInforEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this customer infor entry.
	*
	* @param modifiedDate the modified date of this customer infor entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_customerInforEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the cust name of this customer infor entry.
	*
	* @return the cust name of this customer infor entry
	*/
	@Override
	public java.lang.String getCustName() {
		return _customerInforEntry.getCustName();
	}

	/**
	* Sets the cust name of this customer infor entry.
	*
	* @param custName the cust name of this customer infor entry
	*/
	@Override
	public void setCustName(java.lang.String custName) {
		_customerInforEntry.setCustName(custName);
	}

	/**
	* Returns the cust identiication of this customer infor entry.
	*
	* @return the cust identiication of this customer infor entry
	*/
	@Override
	public java.lang.String getCustIdentiication() {
		return _customerInforEntry.getCustIdentiication();
	}

	/**
	* Sets the cust identiication of this customer infor entry.
	*
	* @param custIdentiication the cust identiication of this customer infor entry
	*/
	@Override
	public void setCustIdentiication(java.lang.String custIdentiication) {
		_customerInforEntry.setCustIdentiication(custIdentiication);
	}

	/**
	* Returns the phone number of this customer infor entry.
	*
	* @return the phone number of this customer infor entry
	*/
	@Override
	public java.lang.String getPhoneNumber() {
		return _customerInforEntry.getPhoneNumber();
	}

	/**
	* Sets the phone number of this customer infor entry.
	*
	* @param phoneNumber the phone number of this customer infor entry
	*/
	@Override
	public void setPhoneNumber(java.lang.String phoneNumber) {
		_customerInforEntry.setPhoneNumber(phoneNumber);
	}

	/**
	* Returns the address of this customer infor entry.
	*
	* @return the address of this customer infor entry
	*/
	@Override
	public java.lang.String getAddress() {
		return _customerInforEntry.getAddress();
	}

	/**
	* Sets the address of this customer infor entry.
	*
	* @param address the address of this customer infor entry
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_customerInforEntry.setAddress(address);
	}

	/**
	* Returns the service of this customer infor entry.
	*
	* @return the service of this customer infor entry
	*/
	@Override
	public java.lang.String getService() {
		return _customerInforEntry.getService();
	}

	/**
	* Sets the service of this customer infor entry.
	*
	* @param service the service of this customer infor entry
	*/
	@Override
	public void setService(java.lang.String service) {
		_customerInforEntry.setService(service);
	}

	/**
	* Returns the comment of this customer infor entry.
	*
	* @return the comment of this customer infor entry
	*/
	@Override
	public java.lang.String getComment() {
		return _customerInforEntry.getComment();
	}

	/**
	* Sets the comment of this customer infor entry.
	*
	* @param comment the comment of this customer infor entry
	*/
	@Override
	public void setComment(java.lang.String comment) {
		_customerInforEntry.setComment(comment);
	}

	/**
	* Returns the status of this customer infor entry.
	*
	* @return the status of this customer infor entry
	*/
	@Override
	public java.lang.String getStatus() {
		return _customerInforEntry.getStatus();
	}

	/**
	* Sets the status of this customer infor entry.
	*
	* @param status the status of this customer infor entry
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_customerInforEntry.setStatus(status);
	}

	/**
	* Returns the reason of this customer infor entry.
	*
	* @return the reason of this customer infor entry
	*/
	@Override
	public java.lang.String getReason() {
		return _customerInforEntry.getReason();
	}

	/**
	* Sets the reason of this customer infor entry.
	*
	* @param reason the reason of this customer infor entry
	*/
	@Override
	public void setReason(java.lang.String reason) {
		_customerInforEntry.setReason(reason);
	}

	@Override
	public boolean isNew() {
		return _customerInforEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customerInforEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customerInforEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customerInforEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customerInforEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customerInforEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customerInforEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customerInforEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customerInforEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customerInforEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customerInforEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerInforEntryWrapper((CustomerInforEntry)_customerInforEntry.clone());
	}

	@Override
	public int compareTo(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry) {
		return _customerInforEntry.compareTo(customerInforEntry);
	}

	@Override
	public int hashCode() {
		return _customerInforEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.customercare.model.CustomerInforEntry> toCacheModel() {
		return _customerInforEntry.toCacheModel();
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry toEscapedModel() {
		return new CustomerInforEntryWrapper(_customerInforEntry.toEscapedModel());
	}

	@Override
	public com.liferay.docs.customercare.model.CustomerInforEntry toUnescapedModel() {
		return new CustomerInforEntryWrapper(_customerInforEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customerInforEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customerInforEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customerInforEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerInforEntryWrapper)) {
			return false;
		}

		CustomerInforEntryWrapper customerInforEntryWrapper = (CustomerInforEntryWrapper)obj;

		if (Validator.equals(_customerInforEntry,
					customerInforEntryWrapper._customerInforEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CustomerInforEntry getWrappedCustomerInforEntry() {
		return _customerInforEntry;
	}

	@Override
	public CustomerInforEntry getWrappedModel() {
		return _customerInforEntry;
	}

	@Override
	public void resetOriginalValues() {
		_customerInforEntry.resetOriginalValues();
	}

	private CustomerInforEntry _customerInforEntry;
}