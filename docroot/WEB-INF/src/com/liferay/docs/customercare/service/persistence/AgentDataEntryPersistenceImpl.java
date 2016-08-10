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

import com.liferay.docs.customercare.NoSuchAgentDataEntryException;
import com.liferay.docs.customercare.model.AgentDataEntry;
import com.liferay.docs.customercare.model.impl.AgentDataEntryImpl;
import com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl;

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
 * The persistence implementation for the agent data entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see AgentDataEntryPersistence
 * @see AgentDataEntryUtil
 * @generated
 */
public class AgentDataEntryPersistenceImpl extends BasePersistenceImpl<AgentDataEntry>
	implements AgentDataEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AgentDataEntryUtil} to access the agent data entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AgentDataEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryModelImpl.FINDER_CACHE_ENABLED,
			AgentDataEntryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryModelImpl.FINDER_CACHE_ENABLED,
			AgentDataEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AgentDataEntryPersistenceImpl() {
		setModelClass(AgentDataEntry.class);
	}

	/**
	 * Caches the agent data entry in the entity cache if it is enabled.
	 *
	 * @param agentDataEntry the agent data entry
	 */
	@Override
	public void cacheResult(AgentDataEntry agentDataEntry) {
		EntityCacheUtil.putResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryImpl.class, agentDataEntry.getPrimaryKey(),
			agentDataEntry);

		agentDataEntry.resetOriginalValues();
	}

	/**
	 * Caches the agent data entries in the entity cache if it is enabled.
	 *
	 * @param agentDataEntries the agent data entries
	 */
	@Override
	public void cacheResult(List<AgentDataEntry> agentDataEntries) {
		for (AgentDataEntry agentDataEntry : agentDataEntries) {
			if (EntityCacheUtil.getResult(
						AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
						AgentDataEntryImpl.class, agentDataEntry.getPrimaryKey()) == null) {
				cacheResult(agentDataEntry);
			}
			else {
				agentDataEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all agent data entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AgentDataEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AgentDataEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the agent data entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgentDataEntry agentDataEntry) {
		EntityCacheUtil.removeResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryImpl.class, agentDataEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AgentDataEntry> agentDataEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AgentDataEntry agentDataEntry : agentDataEntries) {
			EntityCacheUtil.removeResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
				AgentDataEntryImpl.class, agentDataEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new agent data entry with the primary key. Does not add the agent data entry to the database.
	 *
	 * @param agentDataEntryId the primary key for the new agent data entry
	 * @return the new agent data entry
	 */
	@Override
	public AgentDataEntry create(long agentDataEntryId) {
		AgentDataEntry agentDataEntry = new AgentDataEntryImpl();

		agentDataEntry.setNew(true);
		agentDataEntry.setPrimaryKey(agentDataEntryId);

		return agentDataEntry;
	}

	/**
	 * Removes the agent data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agentDataEntryId the primary key of the agent data entry
	 * @return the agent data entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry remove(long agentDataEntryId)
		throws NoSuchAgentDataEntryException, SystemException {
		return remove((Serializable)agentDataEntryId);
	}

	/**
	 * Removes the agent data entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agent data entry
	 * @return the agent data entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry remove(Serializable primaryKey)
		throws NoSuchAgentDataEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AgentDataEntry agentDataEntry = (AgentDataEntry)session.get(AgentDataEntryImpl.class,
					primaryKey);

			if (agentDataEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgentDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(agentDataEntry);
		}
		catch (NoSuchAgentDataEntryException nsee) {
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
	protected AgentDataEntry removeImpl(AgentDataEntry agentDataEntry)
		throws SystemException {
		agentDataEntry = toUnwrappedModel(agentDataEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agentDataEntry)) {
				agentDataEntry = (AgentDataEntry)session.get(AgentDataEntryImpl.class,
						agentDataEntry.getPrimaryKeyObj());
			}

			if (agentDataEntry != null) {
				session.delete(agentDataEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (agentDataEntry != null) {
			clearCache(agentDataEntry);
		}

		return agentDataEntry;
	}

	@Override
	public AgentDataEntry updateImpl(
		com.liferay.docs.customercare.model.AgentDataEntry agentDataEntry)
		throws SystemException {
		agentDataEntry = toUnwrappedModel(agentDataEntry);

		boolean isNew = agentDataEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (agentDataEntry.isNew()) {
				session.save(agentDataEntry);

				agentDataEntry.setNew(false);
			}
			else {
				session.merge(agentDataEntry);
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

		EntityCacheUtil.putResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
			AgentDataEntryImpl.class, agentDataEntry.getPrimaryKey(),
			agentDataEntry);

		return agentDataEntry;
	}

	protected AgentDataEntry toUnwrappedModel(AgentDataEntry agentDataEntry) {
		if (agentDataEntry instanceof AgentDataEntryImpl) {
			return agentDataEntry;
		}

		AgentDataEntryImpl agentDataEntryImpl = new AgentDataEntryImpl();

		agentDataEntryImpl.setNew(agentDataEntry.isNew());
		agentDataEntryImpl.setPrimaryKey(agentDataEntry.getPrimaryKey());

		agentDataEntryImpl.setAgentDataEntryId(agentDataEntry.getAgentDataEntryId());
		agentDataEntryImpl.setGroupId(agentDataEntry.getGroupId());
		agentDataEntryImpl.setCompanyId(agentDataEntry.getCompanyId());
		agentDataEntryImpl.setUserId(agentDataEntry.getUserId());
		agentDataEntryImpl.setUserName(agentDataEntry.getUserName());
		agentDataEntryImpl.setCreateDate(agentDataEntry.getCreateDate());
		agentDataEntryImpl.setModifiedDate(agentDataEntry.getModifiedDate());
		agentDataEntryImpl.setAgentId(agentDataEntry.getAgentId());
		agentDataEntryImpl.setQueueList(agentDataEntry.getQueueList());
		agentDataEntryImpl.setExtension(agentDataEntry.getExtension());

		return agentDataEntryImpl;
	}

	/**
	 * Returns the agent data entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the agent data entry
	 * @return the agent data entry
	 * @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgentDataEntryException, SystemException {
		AgentDataEntry agentDataEntry = fetchByPrimaryKey(primaryKey);

		if (agentDataEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgentDataEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return agentDataEntry;
	}

	/**
	 * Returns the agent data entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchAgentDataEntryException} if it could not be found.
	 *
	 * @param agentDataEntryId the primary key of the agent data entry
	 * @return the agent data entry
	 * @throws com.liferay.docs.customercare.NoSuchAgentDataEntryException if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry findByPrimaryKey(long agentDataEntryId)
		throws NoSuchAgentDataEntryException, SystemException {
		return findByPrimaryKey((Serializable)agentDataEntryId);
	}

	/**
	 * Returns the agent data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agent data entry
	 * @return the agent data entry, or <code>null</code> if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		AgentDataEntry agentDataEntry = (AgentDataEntry)EntityCacheUtil.getResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
				AgentDataEntryImpl.class, primaryKey);

		if (agentDataEntry == _nullAgentDataEntry) {
			return null;
		}

		if (agentDataEntry == null) {
			Session session = null;

			try {
				session = openSession();

				agentDataEntry = (AgentDataEntry)session.get(AgentDataEntryImpl.class,
						primaryKey);

				if (agentDataEntry != null) {
					cacheResult(agentDataEntry);
				}
				else {
					EntityCacheUtil.putResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
						AgentDataEntryImpl.class, primaryKey,
						_nullAgentDataEntry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AgentDataEntryModelImpl.ENTITY_CACHE_ENABLED,
					AgentDataEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return agentDataEntry;
	}

	/**
	 * Returns the agent data entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agentDataEntryId the primary key of the agent data entry
	 * @return the agent data entry, or <code>null</code> if a agent data entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AgentDataEntry fetchByPrimaryKey(long agentDataEntryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)agentDataEntryId);
	}

	/**
	 * Returns all the agent data entries.
	 *
	 * @return the agent data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AgentDataEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agent data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of agent data entries
	 * @param end the upper bound of the range of agent data entries (not inclusive)
	 * @return the range of agent data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AgentDataEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agent data entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.AgentDataEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of agent data entries
	 * @param end the upper bound of the range of agent data entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agent data entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AgentDataEntry> findAll(int start, int end,
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

		List<AgentDataEntry> list = (List<AgentDataEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_AGENTDATAENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AGENTDATAENTRY;

				if (pagination) {
					sql = sql.concat(AgentDataEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AgentDataEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AgentDataEntry>(list);
				}
				else {
					list = (List<AgentDataEntry>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the agent data entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AgentDataEntry agentDataEntry : findAll()) {
			remove(agentDataEntry);
		}
	}

	/**
	 * Returns the number of agent data entries.
	 *
	 * @return the number of agent data entries
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

				Query q = session.createQuery(_SQL_COUNT_AGENTDATAENTRY);

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
	 * Initializes the agent data entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.docs.customercare.model.AgentDataEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AgentDataEntry>> listenersList = new ArrayList<ModelListener<AgentDataEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AgentDataEntry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AgentDataEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_AGENTDATAENTRY = "SELECT agentDataEntry FROM AgentDataEntry agentDataEntry";
	private static final String _SQL_COUNT_AGENTDATAENTRY = "SELECT COUNT(agentDataEntry) FROM AgentDataEntry agentDataEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "agentDataEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AgentDataEntry exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AgentDataEntryPersistenceImpl.class);
	private static AgentDataEntry _nullAgentDataEntry = new AgentDataEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AgentDataEntry> toCacheModel() {
				return _nullAgentDataEntryCacheModel;
			}
		};

	private static CacheModel<AgentDataEntry> _nullAgentDataEntryCacheModel = new CacheModel<AgentDataEntry>() {
			@Override
			public AgentDataEntry toEntityModel() {
				return _nullAgentDataEntry;
			}
		};
}