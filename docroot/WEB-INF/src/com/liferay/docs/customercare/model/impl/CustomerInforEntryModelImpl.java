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

package com.liferay.docs.customercare.model.impl;

import com.liferay.docs.customercare.model.CustomerInforEntry;
import com.liferay.docs.customercare.model.CustomerInforEntryModel;
import com.liferay.docs.customercare.model.CustomerInforEntrySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CustomerInforEntry service. Represents a row in the &quot;CC_CustomerInforEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.customercare.model.CustomerInforEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomerInforEntryImpl}.
 * </p>
 *
 * @author DuyMB
 * @see CustomerInforEntryImpl
 * @see com.liferay.docs.customercare.model.CustomerInforEntry
 * @see com.liferay.docs.customercare.model.CustomerInforEntryModel
 * @generated
 */
@JSON(strict = true)
public class CustomerInforEntryModelImpl extends BaseModelImpl<CustomerInforEntry>
	implements CustomerInforEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a customer infor entry model instance should use the {@link com.liferay.docs.customercare.model.CustomerInforEntry} interface instead.
	 */
	public static final String TABLE_NAME = "CC_CustomerInforEntry";
	public static final Object[][] TABLE_COLUMNS = {
			{ "customerInforEntryId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "custName", Types.VARCHAR },
			{ "custIdentiication", Types.VARCHAR },
			{ "phoneNumber", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "service", Types.VARCHAR },
			{ "comment_", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "reason", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table CC_CustomerInforEntry (customerInforEntryId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,custName VARCHAR(75) null,custIdentiication VARCHAR(75) null,phoneNumber VARCHAR(75) null,address VARCHAR(75) null,service VARCHAR(75) null,comment_ VARCHAR(75) null,status VARCHAR(75) null,reason VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table CC_CustomerInforEntry";
	public static final String ORDER_BY_JPQL = " ORDER BY customerInforEntry.customerInforEntryId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CC_CustomerInforEntry.customerInforEntryId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.customercare.model.CustomerInforEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.customercare.model.CustomerInforEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CustomerInforEntry toModel(CustomerInforEntrySoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CustomerInforEntry model = new CustomerInforEntryImpl();

		model.setCustomerInforEntryId(soapModel.getCustomerInforEntryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCustName(soapModel.getCustName());
		model.setCustIdentiication(soapModel.getCustIdentiication());
		model.setPhoneNumber(soapModel.getPhoneNumber());
		model.setAddress(soapModel.getAddress());
		model.setService(soapModel.getService());
		model.setComment(soapModel.getComment());
		model.setStatus(soapModel.getStatus());
		model.setReason(soapModel.getReason());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CustomerInforEntry> toModels(
		CustomerInforEntrySoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CustomerInforEntry> models = new ArrayList<CustomerInforEntry>(soapModels.length);

		for (CustomerInforEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.customercare.model.CustomerInforEntry"));

	public CustomerInforEntryModelImpl() {
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

	@JSON
	@Override
	public long getCustomerInforEntryId() {
		return _customerInforEntryId;
	}

	@Override
	public void setCustomerInforEntryId(long customerInforEntryId) {
		_customerInforEntryId = customerInforEntryId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getCustName() {
		if (_custName == null) {
			return StringPool.BLANK;
		}
		else {
			return _custName;
		}
	}

	@Override
	public void setCustName(String custName) {
		_custName = custName;
	}

	@JSON
	@Override
	public String getCustIdentiication() {
		if (_custIdentiication == null) {
			return StringPool.BLANK;
		}
		else {
			return _custIdentiication;
		}
	}

	@Override
	public void setCustIdentiication(String custIdentiication) {
		_custIdentiication = custIdentiication;
	}

	@JSON
	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@JSON
	@Override
	public String getService() {
		if (_service == null) {
			return StringPool.BLANK;
		}
		else {
			return _service;
		}
	}

	@Override
	public void setService(String service) {
		_service = service;
	}

	@JSON
	@Override
	public String getComment() {
		if (_comment == null) {
			return StringPool.BLANK;
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		_comment = comment;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@JSON
	@Override
	public String getReason() {
		if (_reason == null) {
			return StringPool.BLANK;
		}
		else {
			return _reason;
		}
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CustomerInforEntry.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CustomerInforEntry toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CustomerInforEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CustomerInforEntryImpl customerInforEntryImpl = new CustomerInforEntryImpl();

		customerInforEntryImpl.setCustomerInforEntryId(getCustomerInforEntryId());
		customerInforEntryImpl.setGroupId(getGroupId());
		customerInforEntryImpl.setCompanyId(getCompanyId());
		customerInforEntryImpl.setUserId(getUserId());
		customerInforEntryImpl.setUserName(getUserName());
		customerInforEntryImpl.setCreateDate(getCreateDate());
		customerInforEntryImpl.setModifiedDate(getModifiedDate());
		customerInforEntryImpl.setCustName(getCustName());
		customerInforEntryImpl.setCustIdentiication(getCustIdentiication());
		customerInforEntryImpl.setPhoneNumber(getPhoneNumber());
		customerInforEntryImpl.setAddress(getAddress());
		customerInforEntryImpl.setService(getService());
		customerInforEntryImpl.setComment(getComment());
		customerInforEntryImpl.setStatus(getStatus());
		customerInforEntryImpl.setReason(getReason());

		customerInforEntryImpl.resetOriginalValues();

		return customerInforEntryImpl;
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

		if (!(obj instanceof CustomerInforEntry)) {
			return false;
		}

		CustomerInforEntry customerInforEntry = (CustomerInforEntry)obj;

		long primaryKey = customerInforEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<CustomerInforEntry> toCacheModel() {
		CustomerInforEntryCacheModel customerInforEntryCacheModel = new CustomerInforEntryCacheModel();

		customerInforEntryCacheModel.customerInforEntryId = getCustomerInforEntryId();

		customerInforEntryCacheModel.groupId = getGroupId();

		customerInforEntryCacheModel.companyId = getCompanyId();

		customerInforEntryCacheModel.userId = getUserId();

		customerInforEntryCacheModel.userName = getUserName();

		String userName = customerInforEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			customerInforEntryCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			customerInforEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			customerInforEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			customerInforEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			customerInforEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		customerInforEntryCacheModel.custName = getCustName();

		String custName = customerInforEntryCacheModel.custName;

		if ((custName != null) && (custName.length() == 0)) {
			customerInforEntryCacheModel.custName = null;
		}

		customerInforEntryCacheModel.custIdentiication = getCustIdentiication();

		String custIdentiication = customerInforEntryCacheModel.custIdentiication;

		if ((custIdentiication != null) && (custIdentiication.length() == 0)) {
			customerInforEntryCacheModel.custIdentiication = null;
		}

		customerInforEntryCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = customerInforEntryCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			customerInforEntryCacheModel.phoneNumber = null;
		}

		customerInforEntryCacheModel.address = getAddress();

		String address = customerInforEntryCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			customerInforEntryCacheModel.address = null;
		}

		customerInforEntryCacheModel.service = getService();

		String service = customerInforEntryCacheModel.service;

		if ((service != null) && (service.length() == 0)) {
			customerInforEntryCacheModel.service = null;
		}

		customerInforEntryCacheModel.comment = getComment();

		String comment = customerInforEntryCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			customerInforEntryCacheModel.comment = null;
		}

		customerInforEntryCacheModel.status = getStatus();

		String status = customerInforEntryCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			customerInforEntryCacheModel.status = null;
		}

		customerInforEntryCacheModel.reason = getReason();

		String reason = customerInforEntryCacheModel.reason;

		if ((reason != null) && (reason.length() == 0)) {
			customerInforEntryCacheModel.reason = null;
		}

		return customerInforEntryCacheModel;
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

	private static ClassLoader _classLoader = CustomerInforEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CustomerInforEntry.class
		};
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
	private CustomerInforEntry _escapedModel;
}