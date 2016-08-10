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

import com.liferay.docs.customercare.model.CallDataEntry;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CallDataEntry in entity cache.
 *
 * @author DuyMB
 * @see CallDataEntry
 * @generated
 */
public class CallDataEntryCacheModel implements CacheModel<CallDataEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{callDataEntryId=");
		sb.append(callDataEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", callId=");
		sb.append(callId);
		sb.append(", startCallDate=");
		sb.append(startCallDate);
		sb.append(", endCallDate=");
		sb.append(endCallDate);
		sb.append(", queueName=");
		sb.append(queueName);
		sb.append(", callNumber=");
		sb.append(callNumber);
		sb.append(", channel=");
		sb.append(channel);
		sb.append(", waitTime=");
		sb.append(waitTime);
		sb.append(", durationTime=");
		sb.append(durationTime);
		sb.append(", extension=");
		sb.append(extension);
		sb.append(", status=");
		sb.append(status);
		sb.append(", channelOld=");
		sb.append(channelOld);
		sb.append(", channelTo=");
		sb.append(channelTo);
		sb.append(", extOfMonitor=");
		sb.append(extOfMonitor);
		sb.append(", causeCode=");
		sb.append(causeCode);
		sb.append(", sipCause=");
		sb.append(sipCause);
		sb.append(", staffName=");
		sb.append(staffName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CallDataEntry toEntityModel() {
		CallDataEntryImpl callDataEntryImpl = new CallDataEntryImpl();

		callDataEntryImpl.setCallDataEntryId(callDataEntryId);
		callDataEntryImpl.setGroupId(groupId);
		callDataEntryImpl.setCompanyId(companyId);
		callDataEntryImpl.setUserId(userId);

		if (userName == null) {
			callDataEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			callDataEntryImpl.setCreateDate(null);
		}
		else {
			callDataEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			callDataEntryImpl.setModifiedDate(null);
		}
		else {
			callDataEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (callId == null) {
			callDataEntryImpl.setCallId(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setCallId(callId);
		}

		if (startCallDate == Long.MIN_VALUE) {
			callDataEntryImpl.setStartCallDate(null);
		}
		else {
			callDataEntryImpl.setStartCallDate(new Date(startCallDate));
		}

		if (endCallDate == Long.MIN_VALUE) {
			callDataEntryImpl.setEndCallDate(null);
		}
		else {
			callDataEntryImpl.setEndCallDate(new Date(endCallDate));
		}

		if (queueName == null) {
			callDataEntryImpl.setQueueName(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setQueueName(queueName);
		}

		if (callNumber == null) {
			callDataEntryImpl.setCallNumber(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setCallNumber(callNumber);
		}

		if (channel == null) {
			callDataEntryImpl.setChannel(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setChannel(channel);
		}

		if (waitTime == null) {
			callDataEntryImpl.setWaitTime(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setWaitTime(waitTime);
		}

		if (durationTime == null) {
			callDataEntryImpl.setDurationTime(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setDurationTime(durationTime);
		}

		if (extension == null) {
			callDataEntryImpl.setExtension(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setExtension(extension);
		}

		if (status == null) {
			callDataEntryImpl.setStatus(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setStatus(status);
		}

		if (channelOld == null) {
			callDataEntryImpl.setChannelOld(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setChannelOld(channelOld);
		}

		if (channelTo == null) {
			callDataEntryImpl.setChannelTo(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setChannelTo(channelTo);
		}

		if (extOfMonitor == null) {
			callDataEntryImpl.setExtOfMonitor(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setExtOfMonitor(extOfMonitor);
		}

		if (causeCode == null) {
			callDataEntryImpl.setCauseCode(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setCauseCode(causeCode);
		}

		if (sipCause == null) {
			callDataEntryImpl.setSipCause(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setSipCause(sipCause);
		}

		if (staffName == null) {
			callDataEntryImpl.setStaffName(StringPool.BLANK);
		}
		else {
			callDataEntryImpl.setStaffName(staffName);
		}

		callDataEntryImpl.resetOriginalValues();

		return callDataEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		callDataEntryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		callId = objectInput.readUTF();
		startCallDate = objectInput.readLong();
		endCallDate = objectInput.readLong();
		queueName = objectInput.readUTF();
		callNumber = objectInput.readUTF();
		channel = objectInput.readUTF();
		waitTime = objectInput.readUTF();
		durationTime = objectInput.readUTF();
		extension = objectInput.readUTF();
		status = objectInput.readUTF();
		channelOld = objectInput.readUTF();
		channelTo = objectInput.readUTF();
		extOfMonitor = objectInput.readUTF();
		causeCode = objectInput.readUTF();
		sipCause = objectInput.readUTF();
		staffName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(callDataEntryId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (callId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callId);
		}

		objectOutput.writeLong(startCallDate);
		objectOutput.writeLong(endCallDate);

		if (queueName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(queueName);
		}

		if (callNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(callNumber);
		}

		if (channel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(channel);
		}

		if (waitTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(waitTime);
		}

		if (durationTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(durationTime);
		}

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (channelOld == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(channelOld);
		}

		if (channelTo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(channelTo);
		}

		if (extOfMonitor == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extOfMonitor);
		}

		if (causeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(causeCode);
		}

		if (sipCause == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sipCause);
		}

		if (staffName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(staffName);
		}
	}

	public long callDataEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String callId;
	public long startCallDate;
	public long endCallDate;
	public String queueName;
	public String callNumber;
	public String channel;
	public String waitTime;
	public String durationTime;
	public String extension;
	public String status;
	public String channelOld;
	public String channelTo;
	public String extOfMonitor;
	public String causeCode;
	public String sipCause;
	public String staffName;
}