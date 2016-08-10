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

import com.liferay.docs.customercare.service.ClpSerializer;
import com.liferay.docs.customercare.service.CustomerInforEntryLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DuyMB
 */
public class CustomerInforEntryClp extends BaseModelImpl<CustomerInforEntry>
	implements CustomerInforEntry {
	public CustomerInforEntryClp() {
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
	public long getPrimaryKey() {
		return _customerInforEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomerInforEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customerInforEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCustomerInforEntryId() {
		return _customerInforEntryId;
	}

	@Override
	public void setCustomerInforEntryId(long customerInforEntryId) {
		_customerInforEntryId = customerInforEntryId;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerInforEntryId",
						long.class);

				method.invoke(_customerInforEntryRemoteModel,
					customerInforEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_customerInforEntryRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_customerInforEntryRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_customerInforEntryRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_customerInforEntryRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_customerInforEntryRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_customerInforEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustName() {
		return _custName;
	}

	@Override
	public void setCustName(String custName) {
		_custName = custName;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCustName", String.class);

				method.invoke(_customerInforEntryRemoteModel, custName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustIdentiication() {
		return _custIdentiication;
	}

	@Override
	public void setCustIdentiication(String custIdentiication) {
		_custIdentiication = custIdentiication;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCustIdentiication",
						String.class);

				method.invoke(_customerInforEntryRemoteModel, custIdentiication);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPhoneNumber() {
		return _phoneNumber;
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setPhoneNumber", String.class);

				method.invoke(_customerInforEntryRemoteModel, phoneNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAddress() {
		return _address;
	}

	@Override
	public void setAddress(String address) {
		_address = address;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAddress", String.class);

				method.invoke(_customerInforEntryRemoteModel, address);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getService() {
		return _service;
	}

	@Override
	public void setService(String service) {
		_service = service;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setService", String.class);

				method.invoke(_customerInforEntryRemoteModel, service);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComment() {
		return _comment;
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setComment", String.class);

				method.invoke(_customerInforEntryRemoteModel, comment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_customerInforEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReason() {
		return _reason;
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;

		if (_customerInforEntryRemoteModel != null) {
			try {
				Class<?> clazz = _customerInforEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setReason", String.class);

				method.invoke(_customerInforEntryRemoteModel, reason);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCustomerInforEntryRemoteModel() {
		return _customerInforEntryRemoteModel;
	}

	public void setCustomerInforEntryRemoteModel(
		BaseModel<?> customerInforEntryRemoteModel) {
		_customerInforEntryRemoteModel = customerInforEntryRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _customerInforEntryRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_customerInforEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CustomerInforEntryLocalServiceUtil.addCustomerInforEntry(this);
		}
		else {
			CustomerInforEntryLocalServiceUtil.updateCustomerInforEntry(this);
		}
	}

	@Override
	public CustomerInforEntry toEscapedModel() {
		return (CustomerInforEntry)ProxyUtil.newProxyInstance(CustomerInforEntry.class.getClassLoader(),
			new Class[] { CustomerInforEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CustomerInforEntryClp clone = new CustomerInforEntryClp();

		clone.setCustomerInforEntryId(getCustomerInforEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCustName(getCustName());
		clone.setCustIdentiication(getCustIdentiication());
		clone.setPhoneNumber(getPhoneNumber());
		clone.setAddress(getAddress());
		clone.setService(getService());
		clone.setComment(getComment());
		clone.setStatus(getStatus());
		clone.setReason(getReason());

		return clone;
	}

	@Override
	public int compareTo(CustomerInforEntry customerInforEntry) {
		long primaryKey = customerInforEntry.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerInforEntryClp)) {
			return false;
		}

		CustomerInforEntryClp customerInforEntry = (CustomerInforEntryClp)obj;

		long primaryKey = customerInforEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{customerInforEntryId=");
		sb.append(getCustomerInforEntryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", custName=");
		sb.append(getCustName());
		sb.append(", custIdentiication=");
		sb.append(getCustIdentiication());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", service=");
		sb.append(getService());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", reason=");
		sb.append(getReason());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.customercare.model.CustomerInforEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>customerInforEntryId</column-name><column-value><![CDATA[");
		sb.append(getCustomerInforEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>custName</column-name><column-value><![CDATA[");
		sb.append(getCustName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>custIdentiication</column-name><column-value><![CDATA[");
		sb.append(getCustIdentiication());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>service</column-name><column-value><![CDATA[");
		sb.append(getService());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason</column-name><column-value><![CDATA[");
		sb.append(getReason());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _customerInforEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _customerInforEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.docs.customercare.service.ClpSerializer.class;
}