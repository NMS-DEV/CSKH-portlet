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

package com.liferay.docs.customercare.service.persistence;

import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.service.CallDataEntryLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author DuyMB
 * @generated
 */
public abstract class CallDataEntryActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public CallDataEntryActionableDynamicQuery() throws SystemException {
		setBaseLocalService(CallDataEntryLocalServiceUtil.getService());
		setClass(CallDataEntry.class);

		setClassLoader(com.liferay.docs.customercare.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("callDataEntryId");
	}
}