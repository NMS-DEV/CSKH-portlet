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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.customercare.service.http.CustomerInforEntryServiceSoap}.
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.http.CustomerInforEntryServiceSoap
 * @generated
 */
public class CustomerInforEntrySoap implements Serializable {
	public static CustomerInforEntrySoap toSoapModel(CustomerInforEntry model) {
		CustomerInforEntrySoap soapModel = new CustomerInforEntrySoap();

		soapModel.setCustomerInforEntryId(model.getCustomerInforEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCustName(model.getCustName());
		soapModel.setCustIdentiication(model.getCustIdentiication());
		soapModel.setPhoneNumber(model.getPhoneNumber());
		soapModel.setAddress(model.getAddress());
		soapModel.setService(model.getService());
		soapModel.setComment(model.getComment());
		soapModel.setStatus(model.getStatus());
		soapModel.setReason(model.getReason());

		return soapModel;
	}

	public static CustomerInforEntrySoap[] toSoapModels(
		CustomerInforEntry[] models) {
		CustomerInforEntrySoap[] soapModels = new CustomerInforEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CustomerInforEntrySoap[][] toSoapModels(
		CustomerInforEntry[][] models) {
		CustomerInforEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CustomerInforEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CustomerInforEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CustomerInforEntrySoap[] toSoapModels(
		List<CustomerInforEntry> models) {
		List<CustomerInforEntrySoap> soapModels = new ArrayList<CustomerInforEntrySoap>(models.size());

		for (CustomerInforEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CustomerInforEntrySoap[soapModels.size()]);
	}

	public CustomerInforEntrySoap() {
	}

	public long getPrimaryKey() {
		return _customerInforEntryId;
	}

	public void setPrimaryKey(long pk) {
		setCustomerInforEntryId(pk);
	}

	public long getCustomerInforEntryId() {
		return _customerInforEntryId;
	}

	public void setCustomerInforEntryId(long customerInforEntryId) {
		_customerInforEntryId = customerInforEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCustName() {
		return _custName;
	}

	public void setCustName(String custName) {
		_custName = custName;
	}

	public String getCustIdentiication() {
		return _custIdentiication;
	}

	public void setCustIdentiication(String custIdentiication) {
		_custIdentiication = custIdentiication;
	}

	public String getPhoneNumber() {
		return _phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getService() {
		return _service;
	}

	public void setService(String service) {
		_service = service;
	}

	public String getComment() {
		return _comment;
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getReason() {
		return _reason;
	}

	public void setReason(String reason) {
		_reason = reason;
	}

	private long _customerInforEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _custName;
	private String _custIdentiication;
	private String _phoneNumber;
	private String _address;
	private String _service;
	private String _comment;
	private String _status;
	private String _reason;
}