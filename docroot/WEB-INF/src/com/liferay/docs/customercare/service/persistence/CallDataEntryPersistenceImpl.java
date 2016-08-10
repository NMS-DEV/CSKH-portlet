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

import com.liferay.docs.customercare.NoSuchCallDataEntryException;
import com.liferay.docs.customercare.model.CallDataEntry;
import com.liferay.docs.customercare.model.impl.CallDataEntryImpl;
import com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the call data entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see CallDataEntryPersistence
 * @see CallDataEntryUtil
 * @generated
 */
public class CallDataEntryPersistenceImpl extends BasePersistenceImpl<CallDataEntry>
	implements CallDataEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CallDataEntryUtil} to access the call data entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CallDataEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryModelImpl.FINDER_CACHE_ENABLED,
			CallDataEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryModelImpl.FINDER_CACHE_ENABLED,
			CallDataEntryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CallDataEntryPersistenceImpl() {
		setModelClass(CallDataEntry.class);
	}

	/**
	 * Caches the call data entry in the entity cache if it is enabled.
	 *
	 * @param callDataEntry the call data entry
	 */
	@Override
	public void cacheResult(CallDataEntry callDataEntry) {
		EntityCacheUtil.putResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryImpl.class, callDataEntry.getPrimaryKey(),
			callDataEntry);

		callDataEntry.resetOriginalValues();
	}

	/**
	 * Caches the call data entries in the entity cache if it is enabled.
	 *
	 * @param callDataEntries the call data entries
	 */
	@Override
	public void cacheResult(List<CallDataEntry> callDataEntries) {
		for (CallDataEntry callDataEntry : callDataEntries) {
			if (EntityCacheUtil.getResult(
						CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
						CallDataEntryImpl.class, callDataEntry.getPrimaryKey()) == null) {
				cacheResult(callDataEntry);
			}
			else {
				callDataEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all call data entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CallDataEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CallDataEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the call data entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CallDataEntry callDataEntry) {
		EntityCacheUtil.removeResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryImpl.class, callDataEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CallDataEntry> callDataEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CallDataEntry callDataEntry : callDataEntries) {
			EntityCacheUtil.removeResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
				CallDataEntryImpl.class, callDataEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new call data entry with the primary key. Does not add the call data entry to the database.
	 *
	 * @param callDataEntryId the primary key for the new call data entry
	 * @return the new call data entry
	 */
	@Override
	public CallDataEntry create(long callDataEntryId) {
		CallDataEntry callDataEntry = new CallDataEntryImpl();

		callDataEntry.setNew(true);
		callDataEntry.setPrimaryKey(callDataEntryId);

		return callDataEntry;
	}

	/**
	 * Removes the call data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param callDataEntryId the primary key of the call data entry
	 * @return the call data entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry remove(long callDataEntryId)
		throws NoSuchCallDataEntryException, SystemException {
		return remove((Serializable)callDataEntryId);
	}

	/**
	 * Removes the call data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the call data entry
	 * @return the call data entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry remove(Serializable primaryKey)
		throws NoSuchCallDataEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CallDataEntry callDataEntry = (CallDataEntry)session.get(CallDataEntryImpl.class,
					primaryKey);

			if (callDataEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCallDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(callDataEntry);
		}
		catch (NoSuchCallDataEntryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CallDataEntry removeImpl(CallDataEntry callDataEntry)
		throws SystemException {
		callDataEntry = toUnwrappedModel(callDataEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(callDataEntry)) {
				callDataEntry = (CallDataEntry)session.get(CallDataEntryImpl.class,
						callDataEntry.getPrimaryKeyObj());
			}

			if (callDataEntry != null) {
				session.delete(callDataEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (callDataEntry != null) {
			clearCache(callDataEntry);
		}

		return callDataEntry;
	}

	@Override
	public CallDataEntry updateImpl(
		com.liferay.docs.customercare.model.CallDataEntry callDataEntry)
		throws SystemException {
		callDataEntry = toUnwrappedModel(callDataEntry);

		boolean isNew = callDataEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (callDataEntry.isNew()) {
				session.save(callDataEntry);

				callDataEntry.setNew(false);
			}
			else {
				session.merge(callDataEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			CallDataEntryImpl.class, callDataEntry.getPrimaryKey(),
			callDataEntry);

		return callDataEntry;
	}

	protected CallDataEntry toUnwrappedModel(CallDataEntry callDataEntry) {
		if (callDataEntry instanceof CallDataEntryImpl) {
			return callDataEntry;
		}

		CallDataEntryImpl callDataEntryImpl = new CallDataEntryImpl();

		callDataEntryImpl.setNew(callDataEntry.isNew());
		callDataEntryImpl.setPrimaryKey(callDataEntry.getPrimaryKey());

		callDataEntryImpl.setCallDataEntryId(callDataEntry.getCallDataEntryId());
		callDataEntryImpl.setGroupId(callDataEntry.getGroupId());
		callDataEntryImpl.setCompanyId(callDataEntry.getCompanyId());
		callDataEntryImpl.setUserId(callDataEntry.getUserId());
		callDataEntryImpl.setUserName(callDataEntry.getUserName());
		callDataEntryImpl.setCreateDate(callDataEntry.getCreateDate());
		callDataEntryImpl.setModifiedDate(callDataEntry.getModifiedDate());
		callDataEntryImpl.setCallId(callDataEntry.getCallId());
		callDataEntryImpl.setStartCallDate(callDataEntry.getStartCallDate());
		callDataEntryImpl.setEndCallDate(callDataEntry.getEndCallDate());
		callDataEntryImpl.setQueueName(callDataEntry.getQueueName());
		callDataEntryImpl.setCallNumber(callDataEntry.getCallNumber());
		callDataEntryImpl.setChannel(callDataEntry.getChannel());
		callDataEntryImpl.setWaitTime(callDataEntry.getWaitTime());
		callDataEntryImpl.setDurationTime(callDataEntry.getDurationTime());
		callDataEntryImpl.setExtension(callDataEntry.getExtension());
		callDataEntryImpl.setStatus(callDataEntry.getStatus());
		callDataEntryImpl.setChannelOld(callDataEntry.getChannelOld());
		callDataEntryImpl.setChannelTo(callDataEntry.getChannelTo());
		callDataEntryImpl.setExtOfMonitor(callDataEntry.getExtOfMonitor());
		callDataEntryImpl.setCauseCode(callDataEntry.getCauseCode());
		callDataEntryImpl.setSipCause(callDataEntry.getSipCause());
		callDataEntryImpl.setStaffName(callDataEntry.getStaffName());

		return callDataEntryImpl;
	}

	/**
	 * Returns the call data entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the call data entry
	 * @return the call data entry
	 * @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCallDataEntryException, SystemException {
		CallDataEntry callDataEntry = fetchByPrimaryKey(primaryKey);

		if (callDataEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCallDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return callDataEntry;
	}

	/**
	 * Returns the call data entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchCallDataEntryException} if it could not be found.
	 *
	 * @param callDataEntryId the primary key of the call data entry
	 * @return the call data entry
	 * @throws com.liferay.docs.customercare.NoSuchCallDataEntryException if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry findByPrimaryKey(long callDataEntryId)
		throws NoSuchCallDataEntryException, SystemException {
		return findByPrimaryKey((Serializable)callDataEntryId);
	}

	/**
	 * Returns the call data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the call data entry
	 * @return the call data entry, or <code>null</code> if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CallDataEntry callDataEntry = (CallDataEntry)EntityCacheUtil.getResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
				CallDataEntryImpl.class, primaryKey);

		if (callDataEntry == _nullCallDataEntry) {
			return null;
		}

		if (callDataEntry == null) {
			Session session = null;

			try {
				session = openSession();

				callDataEntry = (CallDataEntry)session.get(CallDataEntryImpl.class,
						primaryKey);

				if (callDataEntry != null) {
					cacheResult(callDataEntry);
				}
				else {
					EntityCacheUtil.putResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
						CallDataEntryImpl.class, primaryKey, _nullCallDataEntry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CallDataEntryModelImpl.ENTITY_CACHE_ENABLED,
					CallDataEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return callDataEntry;
	}

	/**
	 * Returns the call data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param callDataEntryId the primary key of the call data entry
	 * @return the call data entry, or <code>null</code> if a call data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CallDataEntry fetchByPrimaryKey(long callDataEntryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)callDataEntryId);
	}

	/**
	 * Returns all the call data entries.
	 *
	 * @return the call data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallDataEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the call data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call data entries
	 * @param end the upper bound of the range of call data entries (not inclusive)
	 * @return the range of call data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallDataEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the call data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CallDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of call data entries
	 * @param end the upper bound of the range of call data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of call data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CallDataEntry> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CallDataEntry> list = (List<CallDataEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CALLDATAENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CALLDATAENTRY;

				if (pagination) {
					sql = sql.concat(CallDataEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CallDataEntry>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CallDataEntry>(list);
				}
				else {
					list = (List<CallDataEntry>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the call data entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CallDataEntry callDataEntry : findAll()) {
			remove(callDataEntry);
		}
	}

	/**
	 * Returns the number of call data entries.
	 *
	 * @return the number of call data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CALLDATAENTRY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the call data entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.docs.customercare.model.CallDataEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CallDataEntry>> listenersList = new ArrayList<ModelListener<CallDataEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CallDataEntry>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CallDataEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CALLDATAENTRY = "SELECT callDataEntry FROM CallDataEntry callDataEntry";
	private static final String _SQL_COUNT_CALLDATAENTRY = "SELECT COUNT(callDataEntry) FROM CallDataEntry callDataEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "callDataEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CallDataEntry exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CallDataEntryPersistenceImpl.class);
	private static CallDataEntry _nullCallDataEntry = new CallDataEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CallDataEntry> toCacheModel() {
				return _nullCallDataEntryCacheModel;
			}
		};

	private static CacheModel<CallDataEntry> _nullCallDataEntryCacheModel = new CacheModel<CallDataEntry>() {
			@Override
			public CallDataEntry toEntityModel() {
				return _nullCallDataEntry;
			}
		};
}