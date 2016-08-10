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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerInforEntry in entity cache.
 *
 * @author DuyMB
 * @see CustomerInforEntry
 * @generated
 */
public class CustomerInforEntryCacheModel implements CacheModel<CustomerInforEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{customerInforEntryId=");
		sb.append(customerInforEntryId);
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
		sb.append(", custName=");
		sb.append(custName);
		sb.append(", custIdentiication=");
		sb.append(custIdentiication);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", address=");
		sb.append(address);
		sb.append(", service=");
		sb.append(service);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", status=");
		sb.append(status);
		sb.append(", reason=");
		sb.append(reason);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CustomerInforEntry toEntityModel() {
		CustomerInforEntryImpl customerInforEntryImpl = new CustomerInforEntryImpl();

		customerInforEntryImpl.setCustomerInforEntryId(customerInforEntryId);
		customerInforEntryImpl.setGroupId(groupId);
		customerInforEntryImpl.setCompanyId(companyId);
		customerInforEntryImpl.setUserId(userId);

		if (userName == null) {
			customerInforEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			customerInforEntryImpl.setCreateDate(null);
		}
		else {
			customerInforEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			customerInforEntryImpl.setModifiedDate(null);
		}
		else {
			customerInforEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (custName == null) {
			customerInforEntryImpl.setCustName(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setCustName(custName);
		}

		if (custIdentiication == null) {
			customerInforEntryImpl.setCustIdentiication(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setCustIdentiication(custIdentiication);
		}

		if (phoneNumber == null) {
			customerInforEntryImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setPhoneNumber(phoneNumber);
		}

		if (address == null) {
			customerInforEntryImpl.setAddress(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setAddress(address);
		}

		if (service == null) {
			customerInforEntryImpl.setService(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setService(service);
		}

		if (comment == null) {
			customerInforEntryImpl.setComment(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setComment(comment);
		}

		if (status == null) {
			customerInforEntryImpl.setStatus(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setStatus(status);
		}

		if (reason == null) {
			customerInforEntryImpl.setReason(StringPool.BLANK);
		}
		else {
			customerInforEntryImpl.setReason(reason);
		}

		customerInforEntryImpl.resetOriginalValues();

		return customerInforEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		customerInforEntryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		custName = objectInput.readUTF();
		custIdentiication = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		address = objectInput.readUTF();
		service = objectInput.readUTF();
		comment = objectInput.readUTF();
		status = objectInput.readUTF();
		reason = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(customerInforEntryId);
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

		if (custName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(custName);
		}

		if (custIdentiication == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(custIdentiication);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (service == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(service);
		}

		if (comment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comment);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason);
		}
	}

	public long customerInforEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String custName;
	public String custIdentiication;
	public String phoneNumber;
	public String address;
	public String service;
	public String comment;
	public String status;
	public String reason;
}