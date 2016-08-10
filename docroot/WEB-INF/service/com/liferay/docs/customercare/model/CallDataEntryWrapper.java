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
 * This class is a wrapper for {@link CallDataEntry}.
 * </p>
 *
 * @author DuyMB
 * @see CallDataEntry
 * @generated
 */
public class CallDataEntryWrapper implements CallDataEntry,
	ModelWrapper<CallDataEntry> {
	public CallDataEntryWrapper(CallDataEntry callDataEntry) {
		_callDataEntry = callDataEntry;
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

	/**
	* Returns the primary key of this call data entry.
	*
	* @return the primary key of this call data entry
	*/
	@Override
	public long getPrimaryKey() {
		return _callDataEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this call data entry.
	*
	* @param primaryKey the primary key of this call data entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_callDataEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the call data entry ID of this call data entry.
	*
	* @return the call data entry ID of this call data entry
	*/
	@Override
	public long getCallDataEntryId() {
		return _callDataEntry.getCallDataEntryId();
	}

	/**
	* Sets the call data entry ID of this call data entry.
	*
	* @param callDataEntryId the call data entry ID of this call data entry
	*/
	@Override
	public void setCallDataEntryId(long callDataEntryId) {
		_callDataEntry.setCallDataEntryId(callDataEntryId);
	}

	/**
	* Returns the group ID of this call data entry.
	*
	* @return the group ID of this call data entry
	*/
	@Override
	public long getGroupId() {
		return _callDataEntry.getGroupId();
	}

	/**
	* Sets the group ID of this call data entry.
	*
	* @param groupId the group ID of this call data entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_callDataEntry.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this call data entry.
	*
	* @return the company ID of this call data entry
	*/
	@Override
	public long getCompanyId() {
		return _callDataEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this call data entry.
	*
	* @param companyId the company ID of this call data entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_callDataEntry.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this call data entry.
	*
	* @return the user ID of this call data entry
	*/
	@Override
	public long getUserId() {
		return _callDataEntry.getUserId();
	}

	/**
	* Sets the user ID of this call data entry.
	*
	* @param userId the user ID of this call data entry
	*/
	@Override
	public void setUserId(long userId) {
		_callDataEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this call data entry.
	*
	* @return the user uuid of this call data entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _callDataEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this call data entry.
	*
	* @param userUuid the user uuid of this call data entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_callDataEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this call data entry.
	*
	* @return the user name of this call data entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _callDataEntry.getUserName();
	}

	/**
	* Sets the user name of this call data entry.
	*
	* @param userName the user name of this call data entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_callDataEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this call data entry.
	*
	* @return the create date of this call data entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _callDataEntry.getCreateDate();
	}

	/**
	* Sets the create date of this call data entry.
	*
	* @param createDate the create date of this call data entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_callDataEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this call data entry.
	*
	* @return the modified date of this call data entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _callDataEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this call data entry.
	*
	* @param modifiedDate the modified date of this call data entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_callDataEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the call ID of this call data entry.
	*
	* @return the call ID of this call data entry
	*/
	@Override
	public java.lang.String getCallId() {
		return _callDataEntry.getCallId();
	}

	/**
	* Sets the call ID of this call data entry.
	*
	* @param callId the call ID of this call data entry
	*/
	@Override
	public void setCallId(java.lang.String callId) {
		_callDataEntry.setCallId(callId);
	}

	/**
	* Returns the start call date of this call data entry.
	*
	* @return the start call date of this call data entry
	*/
	@Override
	public java.util.Date getStartCallDate() {
		return _callDataEntry.getStartCallDate();
	}

	/**
	* Sets the start call date of this call data entry.
	*
	* @param startCallDate the start call date of this call data entry
	*/
	@Override
	public void setStartCallDate(java.util.Date startCallDate) {
		_callDataEntry.setStartCallDate(startCallDate);
	}

	/**
	* Returns the end call date of this call data entry.
	*
	* @return the end call date of this call data entry
	*/
	@Override
	public java.util.Date getEndCallDate() {
		return _callDataEntry.getEndCallDate();
	}

	/**
	* Sets the end call date of this call data entry.
	*
	* @param endCallDate the end call date of this call data entry
	*/
	@Override
	public void setEndCallDate(java.util.Date endCallDate) {
		_callDataEntry.setEndCallDate(endCallDate);
	}

	/**
	* Returns the queue name of this call data entry.
	*
	* @return the queue name of this call data entry
	*/
	@Override
	public java.lang.String getQueueName() {
		return _callDataEntry.getQueueName();
	}

	/**
	* Sets the queue name of this call data entry.
	*
	* @param queueName the queue name of this call data entry
	*/
	@Override
	public void setQueueName(java.lang.String queueName) {
		_callDataEntry.setQueueName(queueName);
	}

	/**
	* Returns the call number of this call data entry.
	*
	* @return the call number of this call data entry
	*/
	@Override
	public java.lang.String getCallNumber() {
		return _callDataEntry.getCallNumber();
	}

	/**
	* Sets the call number of this call data entry.
	*
	* @param callNumber the call number of this call data entry
	*/
	@Override
	public void setCallNumber(java.lang.String callNumber) {
		_callDataEntry.setCallNumber(callNumber);
	}

	/**
	* Returns the channel of this call data entry.
	*
	* @return the channel of this call data entry
	*/
	@Override
	public java.lang.String getChannel() {
		return _callDataEntry.getChannel();
	}

	/**
	* Sets the channel of this call data entry.
	*
	* @param channel the channel of this call data entry
	*/
	@Override
	public void setChannel(java.lang.String channel) {
		_callDataEntry.setChannel(channel);
	}

	/**
	* Returns the wait time of this call data entry.
	*
	* @return the wait time of this call data entry
	*/
	@Override
	public java.lang.String getWaitTime() {
		return _callDataEntry.getWaitTime();
	}

	/**
	* Sets the wait time of this call data entry.
	*
	* @param waitTime the wait time of this call data entry
	*/
	@Override
	public void setWaitTime(java.lang.String waitTime) {
		_callDataEntry.setWaitTime(waitTime);
	}

	/**
	* Returns the duration time of this call data entry.
	*
	* @return the duration time of this call data entry
	*/
	@Override
	public java.lang.String getDurationTime() {
		return _callDataEntry.getDurationTime();
	}

	/**
	* Sets the duration time of this call data entry.
	*
	* @param durationTime the duration time of this call data entry
	*/
	@Override
	public void setDurationTime(java.lang.String durationTime) {
		_callDataEntry.setDurationTime(durationTime);
	}

	/**
	* Returns the extension of this call data entry.
	*
	* @return the extension of this call data entry
	*/
	@Override
	public java.lang.String getExtension() {
		return _callDataEntry.getExtension();
	}

	/**
	* Sets the extension of this call data entry.
	*
	* @param extension the extension of this call data entry
	*/
	@Override
	public void setExtension(java.lang.String extension) {
		_callDataEntry.setExtension(extension);
	}

	/**
	* Returns the status of this call data entry.
	*
	* @return the status of this call data entry
	*/
	@Override
	public java.lang.String getStatus() {
		return _callDataEntry.getStatus();
	}

	/**
	* Sets the status of this call data entry.
	*
	* @param status the status of this call data entry
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_callDataEntry.setStatus(status);
	}

	/**
	* Returns the channel old of this call data entry.
	*
	* @return the channel old of this call data entry
	*/
	@Override
	public java.lang.String getChannelOld() {
		return _callDataEntry.getChannelOld();
	}

	/**
	* Sets the channel old of this call data entry.
	*
	* @param channelOld the channel old of this call data entry
	*/
	@Override
	public void setChannelOld(java.lang.String channelOld) {
		_callDataEntry.setChannelOld(channelOld);
	}

	/**
	* Returns the channel to of this call data entry.
	*
	* @return the channel to of this call data entry
	*/
	@Override
	public java.lang.String getChannelTo() {
		return _callDataEntry.getChannelTo();
	}

	/**
	* Sets the channel to of this call data entry.
	*
	* @param channelTo the channel to of this call data entry
	*/
	@Override
	public void setChannelTo(java.lang.String channelTo) {
		_callDataEntry.setChannelTo(channelTo);
	}

	/**
	* Returns the ext of monitor of this call data entry.
	*
	* @return the ext of monitor of this call data entry
	*/
	@Override
	public java.lang.String getExtOfMonitor() {
		return _callDataEntry.getExtOfMonitor();
	}

	/**
	* Sets the ext of monitor of this call data entry.
	*
	* @param extOfMonitor the ext of monitor of this call data entry
	*/
	@Override
	public void setExtOfMonitor(java.lang.String extOfMonitor) {
		_callDataEntry.setExtOfMonitor(extOfMonitor);
	}

	/**
	* Returns the cause code of this call data entry.
	*
	* @return the cause code of this call data entry
	*/
	@Override
	public java.lang.String getCauseCode() {
		return _callDataEntry.getCauseCode();
	}

	/**
	* Sets the cause code of this call data entry.
	*
	* @param causeCode the cause code of this call data entry
	*/
	@Override
	public void setCauseCode(java.lang.String causeCode) {
		_callDataEntry.setCauseCode(causeCode);
	}

	/**
	* Returns the sip cause of this call data entry.
	*
	* @return the sip cause of this call data entry
	*/
	@Override
	public java.lang.String getSipCause() {
		return _callDataEntry.getSipCause();
	}

	/**
	* Sets the sip cause of this call data entry.
	*
	* @param sipCause the sip cause of this call data entry
	*/
	@Override
	public void setSipCause(java.lang.String sipCause) {
		_callDataEntry.setSipCause(sipCause);
	}

	/**
	* Returns the staff name of this call data entry.
	*
	* @return the staff name of this call data entry
	*/
	@Override
	public java.lang.String getStaffName() {
		return _callDataEntry.getStaffName();
	}

	/**
	* Sets the staff name of this call data entry.
	*
	* @param staffName the staff name of this call data entry
	*/
	@Override
	public void setStaffName(java.lang.String staffName) {
		_callDataEntry.setStaffName(staffName);
	}

	@Override
	public boolean isNew() {
		return _callDataEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_callDataEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _callDataEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_callDataEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _callDataEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _callDataEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_callDataEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _callDataEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_callDataEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_callDataEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_callDataEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CallDataEntryWrapper((CallDataEntry)_callDataEntry.clone());
	}

	@Override
	public int compareTo(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry) {
		return _callDataEntry.compareTo(callDataEntry);
	}

	@Override
	public int hashCode() {
		return _callDataEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.customercare.model.CallDataEntry> toCacheModel() {
		return _callDataEntry.toCacheModel();
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry toEscapedModel() {
		return new CallDataEntryWrapper(_callDataEntry.toEscapedModel());
	}

	@Override
	public com.liferay.docs.customercare.model.CallDataEntry toUnescapedModel() {
		return new CallDataEntryWrapper(_callDataEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _callDataEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _callDataEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_callDataEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CallDataEntryWrapper)) {
			return false;
		}

		CallDataEntryWrapper callDataEntryWrapper = (CallDataEntryWrapper)obj;

		if (Validator.equals(_callDataEntry, callDataEntryWrapper._callDataEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CallDataEntry getWrappedCallDataEntry() {
		return _callDataEntry;
	}

	@Override
	public CallDataEntry getWrappedModel() {
		return _callDataEntry;
	}

	@Override
	public void resetOriginalValues() {
		_callDataEntry.resetOriginalValues();
	}

	private CallDataEntry _callDataEntry;
}