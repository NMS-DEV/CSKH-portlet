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

import com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil;
import com.liferay.docs.customercare.service.ClpSerializer;

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
public class CallDataEntryClp extends BaseModelImpl<CallDataEntry>
	implements CallDataEntry {
	public CallDataEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CallDataEntry.class;
	}

	@Override
	public String getModelClassName() {
		return CallDataEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _callDataEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCallDataEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _callDataEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("callDataEntryId", getCallDataEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("callId", getCallId());
		attributes.put("startCallDate", getStartCallDate());
		attributes.put("endCallDate", getEndCallDate());
		attributes.put("queueName", getQueueName());
		attributes.put("callNumber", getCallNumber());
		attributes.put("channel", getChannel());
		attributes.put("waitTime", getWaitTime());
		attributes.put("durationTime", getDurationTime());
		attributes.put("extension", getExtension());
		attributes.put("status", getStatus());
		attributes.put("channelOld", getChannelOld());
		attributes.put("channelTo", getChannelTo());
		attributes.put("extOfMonitor", getExtOfMonitor());
		attributes.put("causeCode", getCauseCode());
		attributes.put("sipCause", getSipCause());
		attributes.put("staffName", getStaffName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long callDataEntryId = (Long)attributes.get("callDataEntryId");

		if (callDataEntryId != null) {
			setCallDataEntryId(callDataEntryId);
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

		String callId = (String)attributes.get("callId");

		if (callId != null) {
			setCallId(callId);
		}

		Date startCallDate = (Date)attributes.get("startCallDate");

		if (startCallDate != null) {
			setStartCallDate(startCallDate);
		}

		Date endCallDate = (Date)attributes.get("endCallDate");

		if (endCallDate != null) {
			setEndCallDate(endCallDate);
		}

		String queueName = (String)attributes.get("queueName");

		if (queueName != null) {
			setQueueName(queueName);
		}

		String callNumber = (String)attributes.get("callNumber");

		if (callNumber != null) {
			setCallNumber(callNumber);
		}

		String channel = (String)attributes.get("channel");

		if (channel != null) {
			setChannel(channel);
		}

		String waitTime = (String)attributes.get("waitTime");

		if (waitTime != null) {
			setWaitTime(waitTime);
		}

		String durationTime = (String)attributes.get("durationTime");

		if (durationTime != null) {
			setDurationTime(durationTime);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String channelOld = (String)attributes.get("channelOld");

		if (channelOld != null) {
			setChannelOld(channelOld);
		}

		String channelTo = (String)attributes.get("channelTo");

		if (channelTo != null) {
			setChannelTo(channelTo);
		}

		String extOfMonitor = (String)attributes.get("extOfMonitor");

		if (extOfMonitor != null) {
			setExtOfMonitor(extOfMonitor);
		}

		String causeCode = (String)attributes.get("causeCode");

		if (causeCode != null) {
			setCauseCode(causeCode);
		}

		String sipCause = (String)attributes.get("sipCause");

		if (sipCause != null) {
			setSipCause(sipCause);
		}

		String staffName = (String)attributes.get("staffName");

		if (staffName != null) {
			setStaffName(staffName);
		}
	}

	@Override
	public long getCallDataEntryId() {
		return _callDataEntryId;
	}

	@Override
	public void setCallDataEntryId(long callDataEntryId) {
		_callDataEntryId = callDataEntryId;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCallDataEntryId", long.class);

				method.invoke(_callDataEntryRemoteModel, callDataEntryId);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_callDataEntryRemoteModel, groupId);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_callDataEntryRemoteModel, companyId);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_callDataEntryRemoteModel, userId);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_callDataEntryRemoteModel, userName);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_callDataEntryRemoteModel, createDate);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_callDataEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallId() {
		return _callId;
	}

	@Override
	public void setCallId(String callId) {
		_callId = callId;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCallId", String.class);

				method.invoke(_callDataEntryRemoteModel, callId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStartCallDate() {
		return _startCallDate;
	}

	@Override
	public void setStartCallDate(Date startCallDate) {
		_startCallDate = startCallDate;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStartCallDate", Date.class);

				method.invoke(_callDataEntryRemoteModel, startCallDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getEndCallDate() {
		return _endCallDate;
	}

	@Override
	public void setEndCallDate(Date endCallDate) {
		_endCallDate = endCallDate;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setEndCallDate", Date.class);

				method.invoke(_callDataEntryRemoteModel, endCallDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQueueName() {
		return _queueName;
	}

	@Override
	public void setQueueName(String queueName) {
		_queueName = queueName;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQueueName", String.class);

				method.invoke(_callDataEntryRemoteModel, queueName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCallNumber() {
		return _callNumber;
	}

	@Override
	public void setCallNumber(String callNumber) {
		_callNumber = callNumber;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCallNumber", String.class);

				method.invoke(_callDataEntryRemoteModel, callNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChannel() {
		return _channel;
	}

	@Override
	public void setChannel(String channel) {
		_channel = channel;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setChannel", String.class);

				method.invoke(_callDataEntryRemoteModel, channel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWaitTime() {
		return _waitTime;
	}

	@Override
	public void setWaitTime(String waitTime) {
		_waitTime = waitTime;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setWaitTime", String.class);

				method.invoke(_callDataEntryRemoteModel, waitTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDurationTime() {
		return _durationTime;
	}

	@Override
	public void setDurationTime(String durationTime) {
		_durationTime = durationTime;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setDurationTime", String.class);

				method.invoke(_callDataEntryRemoteModel, durationTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtension() {
		return _extension;
	}

	@Override
	public void setExtension(String extension) {
		_extension = extension;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setExtension", String.class);

				method.invoke(_callDataEntryRemoteModel, extension);
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

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_callDataEntryRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChannelOld() {
		return _channelOld;
	}

	@Override
	public void setChannelOld(String channelOld) {
		_channelOld = channelOld;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setChannelOld", String.class);

				method.invoke(_callDataEntryRemoteModel, channelOld);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChannelTo() {
		return _channelTo;
	}

	@Override
	public void setChannelTo(String channelTo) {
		_channelTo = channelTo;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setChannelTo", String.class);

				method.invoke(_callDataEntryRemoteModel, channelTo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExtOfMonitor() {
		return _extOfMonitor;
	}

	@Override
	public void setExtOfMonitor(String extOfMonitor) {
		_extOfMonitor = extOfMonitor;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setExtOfMonitor", String.class);

				method.invoke(_callDataEntryRemoteModel, extOfMonitor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCauseCode() {
		return _causeCode;
	}

	@Override
	public void setCauseCode(String causeCode) {
		_causeCode = causeCode;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCauseCode", String.class);

				method.invoke(_callDataEntryRemoteModel, causeCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSipCause() {
		return _sipCause;
	}

	@Override
	public void setSipCause(String sipCause) {
		_sipCause = sipCause;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setSipCause", String.class);

				method.invoke(_callDataEntryRemoteModel, sipCause);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStaffName() {
		return _staffName;
	}

	@Override
	public void setStaffName(String staffName) {
		_staffName = staffName;

		if (_callDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _callDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setStaffName", String.class);

				method.invoke(_callDataEntryRemoteModel, staffName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCallDataEntryRemoteModel() {
		return _callDataEntryRemoteModel;
	}

	public void setCallDataEntryRemoteModel(
		BaseModel<?> callDataEntryRemoteModel) {
		_callDataEntryRemoteModel = callDataEntryRemoteModel;
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

		Class<?> remoteModelClass = _callDataEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_callDataEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CallDataEntryLocalServiceUtil.addCallDataEntry(this);
		}
		else {
			CallDataEntryLocalServiceUtil.updateCallDataEntry(this);
		}
	}

	@Override
	public CallDataEntry toEscapedModel() {
		return (CallDataEntry)ProxyUtil.newProxyInstance(CallDataEntry.class.getClassLoader(),
			new Class[] { CallDataEntry.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CallDataEntryClp clone = new CallDataEntryClp();

		clone.setCallDataEntryId(getCallDataEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCallId(getCallId());
		clone.setStartCallDate(getStartCallDate());
		clone.setEndCallDate(getEndCallDate());
		clone.setQueueName(getQueueName());
		clone.setCallNumber(getCallNumber());
		clone.setChannel(getChannel());
		clone.setWaitTime(getWaitTime());
		clone.setDurationTime(getDurationTime());
		clone.setExtension(getExtension());
		clone.setStatus(getStatus());
		clone.setChannelOld(getChannelOld());
		clone.setChannelTo(getChannelTo());
		clone.setExtOfMonitor(getExtOfMonitor());
		clone.setCauseCode(getCauseCode());
		clone.setSipCause(getSipCause());
		clone.setStaffName(getStaffName());

		return clone;
	}

	@Override
	public int compareTo(CallDataEntry callDataEntry) {
		long primaryKey = callDataEntry.getPrimaryKey();

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

		if (!(obj instanceof CallDataEntryClp)) {
			return false;
		}

		CallDataEntryClp callDataEntry = (CallDataEntryClp)obj;

		long primaryKey = callDataEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{callDataEntryId=");
		sb.append(getCallDataEntryId());
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
		sb.append(", callId=");
		sb.append(getCallId());
		sb.append(", startCallDate=");
		sb.append(getStartCallDate());
		sb.append(", endCallDate=");
		sb.append(getEndCallDate());
		sb.append(", queueName=");
		sb.append(getQueueName());
		sb.append(", callNumber=");
		sb.append(getCallNumber());
		sb.append(", channel=");
		sb.append(getChannel());
		sb.append(", waitTime=");
		sb.append(getWaitTime());
		sb.append(", durationTime=");
		sb.append(getDurationTime());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", channelOld=");
		sb.append(getChannelOld());
		sb.append(", channelTo=");
		sb.append(getChannelTo());
		sb.append(", extOfMonitor=");
		sb.append(getExtOfMonitor());
		sb.append(", causeCode=");
		sb.append(getCauseCode());
		sb.append(", sipCause=");
		sb.append(getSipCause());
		sb.append(", staffName=");
		sb.append(getStaffName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.customercare.model.CallDataEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>callDataEntryId</column-name><column-value><![CDATA[");
		sb.append(getCallDataEntryId());
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
			"<column><column-name>callId</column-name><column-value><![CDATA[");
		sb.append(getCallId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startCallDate</column-name><column-value><![CDATA[");
		sb.append(getStartCallDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endCallDate</column-name><column-value><![CDATA[");
		sb.append(getEndCallDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>queueName</column-name><column-value><![CDATA[");
		sb.append(getQueueName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>callNumber</column-name><column-value><![CDATA[");
		sb.append(getCallNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>channel</column-name><column-value><![CDATA[");
		sb.append(getChannel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>waitTime</column-name><column-value><![CDATA[");
		sb.append(getWaitTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>durationTime</column-name><column-value><![CDATA[");
		sb.append(getDurationTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>channelOld</column-name><column-value><![CDATA[");
		sb.append(getChannelOld());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>channelTo</column-name><column-value><![CDATA[");
		sb.append(getChannelTo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extOfMonitor</column-name><column-value><![CDATA[");
		sb.append(getExtOfMonitor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>causeCode</column-name><column-value><![CDATA[");
		sb.append(getCauseCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sipCause</column-name><column-value><![CDATA[");
		sb.append(getSipCause());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>staffName</column-name><column-value><![CDATA[");
		sb.append(getStaffName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _callDataEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _callId;
	private Date _startCallDate;
	private Date _endCallDate;
	private String _queueName;
	private String _callNumber;
	private String _channel;
	private String _waitTime;
	private String _durationTime;
	private String _extension;
	private String _status;
	private String _channelOld;
	private String _channelTo;
	private String _extOfMonitor;
	private String _causeCode;
	private String _sipCause;
	private String _staffName;
	private BaseModel<?> _callDataEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.docs.customercare.service.ClpSerializer.class;
}