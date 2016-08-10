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
 * This class is a wrapper for {@link AgentDataEntry}.
 * </p>
 *
 * @author DuyMB
 * @see AgentDataEntry
 * @generated
 */
public class AgentDataEntryWrapper implements AgentDataEntry,
	ModelWrapper<AgentDataEntry> {
	public AgentDataEntryWrapper(AgentDataEntry agentDataEntry) {
		_agentDataEntry = agentDataEntry;
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

	/**
	* Returns the primary key of this agent data entry.
	*
	* @return the primary key of this agent data entry
	*/
	@Override
	public long getPrimaryKey() {
		return _agentDataEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this agent data entry.
	*
	* @param primaryKey the primary key of this agent data entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_agentDataEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the agent data entry ID of this agent data entry.
	*
	* @return the agent data entry ID of this agent data entry
	*/
	@Override
	public long getAgentDataEntryId() {
		return _agentDataEntry.getAgentDataEntryId();
	}

	/**
	* Sets the agent data entry ID of this agent data entry.
	*
	* @param agentDataEntryId the agent data entry ID of this agent data entry
	*/
	@Override
	public void setAgentDataEntryId(long agentDataEntryId) {
		_agentDataEntry.setAgentDataEntryId(agentDataEntryId);
	}

	/**
	* Returns the group ID of this agent data entry.
	*
	* @return the group ID of this agent data entry
	*/
	@Override
	public long getGroupId() {
		return _agentDataEntry.getGroupId();
	}

	/**
	* Sets the group ID of this agent data entry.
	*
	* @param groupId the group ID of this agent data entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_agentDataEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this agent data entry.
	*
	* @return the company ID of this agent data entry
	*/
	@Override
	public long getCompanyId() {
		return _agentDataEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this agent data entry.
	*
	* @param companyId the company ID of this agent data entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_agentDataEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this agent data entry.
	*
	* @return the user ID of this agent data entry
	*/
	@Override
	public long getUserId() {
		return _agentDataEntry.getUserId();
	}

	/**
	* Sets the user ID of this agent data entry.
	*
	* @param userId the user ID of this agent data entry
	*/
	@Override
	public void setUserId(long userId) {
		_agentDataEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this agent data entry.
	*
	* @return the user uuid of this agent data entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _agentDataEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this agent data entry.
	*
	* @param userUuid the user uuid of this agent data entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_agentDataEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this agent data entry.
	*
	* @return the user name of this agent data entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _agentDataEntry.getUserName();
	}

	/**
	* Sets the user name of this agent data entry.
	*
	* @param userName the user name of this agent data entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_agentDataEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this agent data entry.
	*
	* @return the create date of this agent data entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _agentDataEntry.getCreateDate();
	}

	/**
	* Sets the create date of this agent data entry.
	*
	* @param createDate the create date of this agent data entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_agentDataEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this agent data entry.
	*
	* @return the modified date of this agent data entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _agentDataEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this agent data entry.
	*
	* @param modifiedDate the modified date of this agent data entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_agentDataEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the agent ID of this agent data entry.
	*
	* @return the agent ID of this agent data entry
	*/
	@Override
	public long getAgentId() {
		return _agentDataEntry.getAgentId();
	}

	/**
	* Sets the agent ID of this agent data entry.
	*
	* @param agentId the agent ID of this agent data entry
	*/
	@Override
	public void setAgentId(long agentId) {
		_agentDataEntry.setAgentId(agentId);
	}

	/**
	* Returns the queue list of this agent data entry.
	*
	* @return the queue list of this agent data entry
	*/
	@Override
	public java.lang.String getQueueList() {
		return _agentDataEntry.getQueueList();
	}

	/**
	* Sets the queue list of this agent data entry.
	*
	* @param queueList the queue list of this agent data entry
	*/
	@Override
	public void setQueueList(java.lang.String queueList) {
		_agentDataEntry.setQueueList(queueList);
	}

	/**
	* Returns the extension of this agent data entry.
	*
	* @return the extension of this agent data entry
	*/
	@Override
	public java.lang.String getExtension() {
		return _agentDataEntry.getExtension();
	}

	/**
	* Sets the extension of this agent data entry.
	*
	* @param extension the extension of this agent data entry
	*/
	@Override
	public void setExtension(java.lang.String extension) {
		_agentDataEntry.setExtension(extension);
	}

	@Override
	public boolean isNew() {
		return _agentDataEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_agentDataEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _agentDataEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_agentDataEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _agentDataEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _agentDataEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_agentDataEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _agentDataEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_agentDataEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_agentDataEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_agentDataEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AgentDataEntryWrapper((AgentDataEntry)_agentDataEntry.clone());
	}

	@Override
	public int compareTo(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry) {
		return _agentDataEntry.compareTo(agentDataEntry);
	}

	@Override
	public int hashCode() {
		return _agentDataEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.customercare.model.AgentDataEntry> toCacheModel() {
		return _agentDataEntry.toCacheModel();
	}

	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry toEscapedModel() {
		return new AgentDataEntryWrapper(_agentDataEntry.toEscapedModel());
	}

	@Override
	public com.liferay.docs.customercare.model.AgentDataEntry toUnescapedModel() {
		return new AgentDataEntryWrapper(_agentDataEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _agentDataEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _agentDataEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_agentDataEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AgentDataEntryWrapper)) {
			return false;
		}

		AgentDataEntryWrapper agentDataEntryWrapper = (AgentDataEntryWrapper)obj;

		if (Validator.equals(_agentDataEntry,
					agentDataEntryWrapper._agentDataEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public AgentDataEntry getWrappedAgentDataEntry() {
		return _agentDataEntry;
	}

	@Override
	public AgentDataEntry getWrappedModel() {
		return _agentDataEntry;
	}

	@Override
	public void resetOriginalValues() {
		_agentDataEntry.resetOriginalValues();
	}

	private AgentDataEntry _agentDataEntry;
}