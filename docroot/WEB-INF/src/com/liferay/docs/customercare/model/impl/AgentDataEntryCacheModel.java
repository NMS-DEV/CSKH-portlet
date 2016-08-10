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

import com.liferay.docs.customercare.model.AgentDataEntry;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgentDataEntry in entity cache.
 *
 * @author DuyMB
 * @see AgentDataEntry
 * @generated
 */
public class AgentDataEntryCacheModel implements CacheModel<AgentDataEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{agentDataEntryId=");
		sb.append(agentDataEntryId);
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
		sb.append(", agentId=");
		sb.append(agentId);
		sb.append(", queueList=");
		sb.append(queueList);
		sb.append(", extension=");
		sb.append(extension);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgentDataEntry toEntityModel() {
		AgentDataEntryImpl agentDataEntryImpl = new AgentDataEntryImpl();

		agentDataEntryImpl.setAgentDataEntryId(agentDataEntryId);
		agentDataEntryImpl.setGroupId(groupId);
		agentDataEntryImpl.setCompanyId(companyId);
		agentDataEntryImpl.setUserId(userId);

		if (userName == null) {
			agentDataEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			agentDataEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agentDataEntryImpl.setCreateDate(null);
		}
		else {
			agentDataEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agentDataEntryImpl.setModifiedDate(null);
		}
		else {
			agentDataEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		agentDataEntryImpl.setAgentId(agentId);

		if (queueList == null) {
			agentDataEntryImpl.setQueueList(StringPool.BLANK);
		}
		else {
			agentDataEntryImpl.setQueueList(queueList);
		}

		if (extension == null) {
			agentDataEntryImpl.setExtension(StringPool.BLANK);
		}
		else {
			agentDataEntryImpl.setExtension(extension);
		}

		agentDataEntryImpl.resetOriginalValues();

		return agentDataEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agentDataEntryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		agentId = objectInput.readLong();
		queueList = objectInput.readUTF();
		extension = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(agentDataEntryId);
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
		objectOutput.writeLong(agentId);

		if (queueList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(queueList);
		}

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}
	}

	public long agentDataEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long agentId;
	public String queueList;
	public String extension;
}