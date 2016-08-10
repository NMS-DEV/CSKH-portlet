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
 * This class is used by SOAP remote services, specifically {@link com.liferay.docs.customercare.service.http.CallDataEntryServiceSoap}.
 *
 * @author DuyMB
 * @see com.liferay.docs.customercare.service.http.CallDataEntryServiceSoap
 * @generated
 */
public class CallDataEntrySoap implements Serializable {
	public static CallDataEntrySoap toSoapModel(CallDataEntry model) {
		CallDataEntrySoap soapModel = new CallDataEntrySoap();

		soapModel.setCallDataEntryId(model.getCallDataEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCallId(model.getCallId());
		soapModel.setStartCallDate(model.getStartCallDate());
		soapModel.setEndCallDate(model.getEndCallDate());
		soapModel.setQueueName(model.getQueueName());
		soapModel.setCallNumber(model.getCallNumber());
		soapModel.setChannel(model.getChannel());
		soapModel.setWaitTime(model.getWaitTime());
		soapModel.setDurationTime(model.getDurationTime());
		soapModel.setExtension(model.getExtension());
		soapModel.setStatus(model.getStatus());
		soapModel.setChannelOld(model.getChannelOld());
		soapModel.setChannelTo(model.getChannelTo());
		soapModel.setExtOfMonitor(model.getExtOfMonitor());
		soapModel.setCauseCode(model.getCauseCode());
		soapModel.setSipCause(model.getSipCause());
		soapModel.setStaffName(model.getStaffName());

		return soapModel;
	}

	public static CallDataEntrySoap[] toSoapModels(CallDataEntry[] models) {
		CallDataEntrySoap[] soapModels = new CallDataEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CallDataEntrySoap[][] toSoapModels(CallDataEntry[][] models) {
		CallDataEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CallDataEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CallDataEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CallDataEntrySoap[] toSoapModels(List<CallDataEntry> models) {
		List<CallDataEntrySoap> soapModels = new ArrayList<CallDataEntrySoap>(models.size());

		for (CallDataEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CallDataEntrySoap[soapModels.size()]);
	}

	public CallDataEntrySoap() {
	}

	public long getPrimaryKey() {
		return _callDataEntryId;
	}

	public void setPrimaryKey(long pk) {
		setCallDataEntryId(pk);
	}

	public long getCallDataEntryId() {
		return _callDataEntryId;
	}

	public void setCallDataEntryId(long callDataEntryId) {
		_callDataEntryId = callDataEntryId;
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

	public String getCallId() {
		return _callId;
	}

	public void setCallId(String callId) {
		_callId = callId;
	}

	public Date getStartCallDate() {
		return _startCallDate;
	}

	public void setStartCallDate(Date startCallDate) {
		_startCallDate = startCallDate;
	}

	public Date getEndCallDate() {
		return _endCallDate;
	}

	public void setEndCallDate(Date endCallDate) {
		_endCallDate = endCallDate;
	}

	public String getQueueName() {
		return _queueName;
	}

	public void setQueueName(String queueName) {
		_queueName = queueName;
	}

	public String getCallNumber() {
		return _callNumber;
	}

	public void setCallNumber(String callNumber) {
		_callNumber = callNumber;
	}

	public String getChannel() {
		return _channel;
	}

	public void setChannel(String channel) {
		_channel = channel;
	}

	public String getWaitTime() {
		return _waitTime;
	}

	public void setWaitTime(String waitTime) {
		_waitTime = waitTime;
	}

	public String getDurationTime() {
		return _durationTime;
	}

	public void setDurationTime(String durationTime) {
		_durationTime = durationTime;
	}

	public String getExtension() {
		return _extension;
	}

	public void setExtension(String extension) {
		_extension = extension;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getChannelOld() {
		return _channelOld;
	}

	public void setChannelOld(String channelOld) {
		_channelOld = channelOld;
	}

	public String getChannelTo() {
		return _channelTo;
	}

	public void setChannelTo(String channelTo) {
		_channelTo = channelTo;
	}

	public String getExtOfMonitor() {
		return _extOfMonitor;
	}

	public void setExtOfMonitor(String extOfMonitor) {
		_extOfMonitor = extOfMonitor;
	}

	public String getCauseCode() {
		return _causeCode;
	}

	public void setCauseCode(String causeCode) {
		_causeCode = causeCode;
	}

	public String getSipCause() {
		return _sipCause;
	}

	public void setSipCause(String sipCause) {
		_sipCause = sipCause;
	}

	public String getStaffName() {
		return _staffName;
	}

	public void setStaffName(String staffName) {
		_staffName = staffName;
	}

	private long _callDataEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
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
}