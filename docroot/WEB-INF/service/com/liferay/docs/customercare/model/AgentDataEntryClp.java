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

import com.liferay.docs.customercare.service.AgentDataEntryLocalServiceUtil;
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
public class AgentDataEntryClp extends BaseModelImpl<AgentDataEntry>
	implements AgentDataEntry {
	public AgentDataEntryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return AgentDataEntry.class;
	}

	@Override
	public String getModelClassName() {
		return AgentDataEntry.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _agentDataEntryId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAgentDataEntryId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _agentDataEntryId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("agentDataEntryId", getAgentDataEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("agentId", getAgentId());
		attributes.put("queueList", getQueueList());
		attributes.put("extension", getExtension());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long agentDataEntryId = (Long)attributes.get("agentDataEntryId");

		if (agentDataEntryId != null) {
			setAgentDataEntryId(agentDataEntryId);
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

		Long agentId = (Long)attributes.get("agentId");

		if (agentId != null) {
			setAgentId(agentId);
		}

		String queueList = (String)attributes.get("queueList");

		if (queueList != null) {
			setQueueList(queueList);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}
	}

	@Override
	public long getAgentDataEntryId() {
		return _agentDataEntryId;
	}

	@Override
	public void setAgentDataEntryId(long agentDataEntryId) {
		_agentDataEntryId = agentDataEntryId;

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentDataEntryId",
						long.class);

				method.invoke(_agentDataEntryRemoteModel, agentDataEntryId);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_agentDataEntryRemoteModel, groupId);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_agentDataEntryRemoteModel, companyId);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_agentDataEntryRemoteModel, userId);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_agentDataEntryRemoteModel, userName);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_agentDataEntryRemoteModel, createDate);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_agentDataEntryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAgentId() {
		return _agentId;
	}

	@Override
	public void setAgentId(long agentId) {
		_agentId = agentId;

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setAgentId", long.class);

				method.invoke(_agentDataEntryRemoteModel, agentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getQueueList() {
		return _queueList;
	}

	@Override
	public void setQueueList(String queueList) {
		_queueList = queueList;

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setQueueList", String.class);

				method.invoke(_agentDataEntryRemoteModel, queueList);
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

		if (_agentDataEntryRemoteModel != null) {
			try {
				Class<?> clazz = _agentDataEntryRemoteModel.getClass();

				Method method = clazz.getMethod("setExtension", String.class);

				method.invoke(_agentDataEntryRemoteModel, extension);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAgentDataEntryRemoteModel() {
		return _agentDataEntryRemoteModel;
	}

	public void setAgentDataEntryRemoteModel(
		BaseModel<?> agentDataEntryRemoteModel) {
		_agentDataEntryRemoteModel = agentDataEntryRemoteModel;
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

		Class<?> remoteModelClass = _agentDataEntryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_agentDataEntryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AgentDataEntryLocalServiceUtil.addAgentDataEntry(this);
		}
		else {
			AgentDataEntryLocalServiceUtil.updateAgentDataEntry(this);
		}
	}

	@Override
	public AgentDataEntry toEscapedModel() {
		return (AgentDataEntry)ProxyUtil.newProxyInstance(AgentDataEntry.class.getClassLoader(),
			new Class[] { AgentDataEntry.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AgentDataEntryClp clone = new AgentDataEntryClp();

		clone.setAgentDataEntryId(getAgentDataEntryId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setAgentId(getAgentId());
		clone.setQueueList(getQueueList());
		clone.setExtension(getExtension());

		return clone;
	}

	@Override
	public int compareTo(AgentDataEntry agentDataEntry) {
		long primaryKey = agentDataEntry.getPrimaryKey();

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

		if (!(obj instanceof AgentDataEntryClp)) {
			return false;
		}

		AgentDataEntryClp agentDataEntry = (AgentDataEntryClp)obj;

		long primaryKey = agentDataEntry.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{agentDataEntryId=");
		sb.append(getAgentDataEntryId());
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
		sb.append(", agentId=");
		sb.append(getAgentId());
		sb.append(", queueList=");
		sb.append(getQueueList());
		sb.append(", extension=");
		sb.append(getExtension());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.customercare.model.AgentDataEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>agentDataEntryId</column-name><column-value><![CDATA[");
		sb.append(getAgentDataEntryId());
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
			"<column><column-name>agentId</column-name><column-value><![CDATA[");
		sb.append(getAgentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>queueList</column-name><column-value><![CDATA[");
		sb.append(getQueueList());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>extension</column-name><column-value><![CDATA[");
		sb.append(getExtension());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _agentDataEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _agentId;
	private String _queueList;
	private String _extension;
	private BaseModel<?> _agentDataEntryRemoteModel;
	private Class<?> _clpSerializerClass = com.liferay.docs.customercare.service.ClpSerializer.class;
}