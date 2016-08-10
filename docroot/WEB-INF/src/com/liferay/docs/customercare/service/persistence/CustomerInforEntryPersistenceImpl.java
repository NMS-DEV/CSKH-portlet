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

import com.liferay.docs.customercare.NoSuchCustomerInforEntryException;
import com.liferay.docs.customercare.model.CustomerInforEntry;
import com.liferay.docs.customercare.model.impl.CustomerInforEntryImpl;
import com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the customer infor entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author DuyMB
 * @see CustomerInforEntryPersistence
 * @see CustomerInforEntryUtil
 * @generated
 */
public class CustomerInforEntryPersistenceImpl extends BasePersistenceImpl<CustomerInforEntry>
	implements CustomerInforEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CustomerInforEntryUtil} to access the customer infor entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CustomerInforEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryModelImpl.FINDER_CACHE_ENABLED,
			CustomerInforEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryModelImpl.FINDER_CACHE_ENABLED,
			CustomerInforEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public CustomerInforEntryPersistenceImpl() {
		setModelClass(CustomerInforEntry.class);
	}

	/**
	 * Caches the customer infor entry in the entity cache if it is enabled.
	 *
	 * @param customerInforEntry the customer infor entry
	 */
	@Override
	public void cacheResult(CustomerInforEntry customerInforEntry) {
		EntityCacheUtil.putResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryImpl.class, customerInforEntry.getPrimaryKey(),
			customerInforEntry);

		customerInforEntry.resetOriginalValues();
	}

	/**
	 * Caches the customer infor entries in the entity cache if it is enabled.
	 *
	 * @param customerInforEntries the customer infor entries
	 */
	@Override
	public void cacheResult(List<CustomerInforEntry> customerInforEntries) {
		for (CustomerInforEntry customerInforEntry : customerInforEntries) {
			if (EntityCacheUtil.getResult(
						CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
						CustomerInforEntryImpl.class,
						customerInforEntry.getPrimaryKey()) == null) {
				cacheResult(customerInforEntry);
			}
			else {
				customerInforEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all customer infor entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CustomerInforEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CustomerInforEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the customer infor entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CustomerInforEntry customerInforEntry) {
		EntityCacheUtil.removeResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryImpl.class, customerInforEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CustomerInforEntry> customerInforEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CustomerInforEntry customerInforEntry : customerInforEntries) {
			EntityCacheUtil.removeResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
				CustomerInforEntryImpl.class, customerInforEntry.getPrimaryKey());
		}
	}

	/**
	 * Creates a new customer infor entry with the primary key. Does not add the customer infor entry to the database.
	 *
	 * @param customerInforEntryId the primary key for the new customer infor entry
	 * @return the new customer infor entry
	 */
	@Override
	public CustomerInforEntry create(long customerInforEntryId) {
		CustomerInforEntry customerInforEntry = new CustomerInforEntryImpl();

		customerInforEntry.setNew(true);
		customerInforEntry.setPrimaryKey(customerInforEntryId);

		return customerInforEntry;
	}

	/**
	 * Removes the customer infor entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customerInforEntryId the primary key of the customer infor entry
	 * @return the customer infor entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry remove(long customerInforEntryId)
		throws NoSuchCustomerInforEntryException, SystemException {
		return remove((Serializable)customerInforEntryId);
	}

	/**
	 * Removes the customer infor entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the customer infor entry
	 * @return the customer infor entry that was removed
	 * @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry remove(Serializable primaryKey)
		throws NoSuchCustomerInforEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CustomerInforEntry customerInforEntry = (CustomerInforEntry)session.get(CustomerInforEntryImpl.class,
					primaryKey);

			if (customerInforEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCustomerInforEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customerInforEntry);
		}
		catch (NoSuchCustomerInforEntryException nsee) {
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
	protected CustomerInforEntry removeImpl(
		CustomerInforEntry customerInforEntry) throws SystemException {
		customerInforEntry = toUnwrappedModel(customerInforEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customerInforEntry)) {
				customerInforEntry = (CustomerInforEntry)session.get(CustomerInforEntryImpl.class,
						customerInforEntry.getPrimaryKeyObj());
			}

			if (customerInforEntry != null) {
				session.delete(customerInforEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customerInforEntry != null) {
			clearCache(customerInforEntry);
		}

		return customerInforEntry;
	}

	@Override
	public CustomerInforEntry updateImpl(
		com.liferay.docs.customercare.model.CustomerInforEntry customerInforEntry)
		throws SystemException {
		customerInforEntry = toUnwrappedModel(customerInforEntry);

		boolean isNew = customerInforEntry.isNew();

		Session session = null;

		try {
			session = openSession();

			if (customerInforEntry.isNew()) {
				session.save(customerInforEntry);

				customerInforEntry.setNew(false);
			}
			else {
				session.merge(customerInforEntry);
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

		EntityCacheUtil.putResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
			CustomerInforEntryImpl.class, customerInforEntry.getPrimaryKey(),
			customerInforEntry);

		return customerInforEntry;
	}

	protected CustomerInforEntry toUnwrappedModel(
		CustomerInforEntry customerInforEntry) {
		if (customerInforEntry instanceof CustomerInforEntryImpl) {
			return customerInforEntry;
		}

		CustomerInforEntryImpl customerInforEntryImpl = new CustomerInforEntryImpl();

		customerInforEntryImpl.setNew(customerInforEntry.isNew());
		customerInforEntryImpl.setPrimaryKey(customerInforEntry.getPrimaryKey());

		customerInforEntryImpl.setCustomerInforEntryId(customerInforEntry.getCustomerInforEntryId());
		customerInforEntryImpl.setGroupId(customerInforEntry.getGroupId());
		customerInforEntryImpl.setCompanyId(customerInforEntry.getCompanyId());
		customerInforEntryImpl.setUserId(customerInforEntry.getUserId());
		customerInforEntryImpl.setUserName(customerInforEntry.getUserName());
		customerInforEntryImpl.setCreateDate(customerInforEntry.getCreateDate());
		customerInforEntryImpl.setModifiedDate(customerInforEntry.getModifiedDate());
		customerInforEntryImpl.setCustName(customerInforEntry.getCustName());
		customerInforEntryImpl.setCustIdentiication(customerInforEntry.getCustIdentiication());
		customerInforEntryImpl.setPhoneNumber(customerInforEntry.getPhoneNumber());
		customerInforEntryImpl.setAddress(customerInforEntry.getAddress());
		customerInforEntryImpl.setService(customerInforEntry.getService());
		customerInforEntryImpl.setComment(customerInforEntry.getComment());
		customerInforEntryImpl.setStatus(customerInforEntry.getStatus());
		customerInforEntryImpl.setReason(customerInforEntry.getReason());

		return customerInforEntryImpl;
	}

	/**
	 * Returns the customer infor entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer infor entry
	 * @return the customer infor entry
	 * @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCustomerInforEntryException, SystemException {
		CustomerInforEntry customerInforEntry = fetchByPrimaryKey(primaryKey);

		if (customerInforEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCustomerInforEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customerInforEntry;
	}

	/**
	 * Returns the customer infor entry with the primary key or throws a {@link com.liferay.docs.customercare.NoSuchCustomerInforEntryException} if it could not be found.
	 *
	 * @param customerInforEntryId the primary key of the customer infor entry
	 * @return the customer infor entry
	 * @throws com.liferay.docs.customercare.NoSuchCustomerInforEntryException if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry findByPrimaryKey(long customerInforEntryId)
		throws NoSuchCustomerInforEntryException, SystemException {
		return findByPrimaryKey((Serializable)customerInforEntryId);
	}

	/**
	 * Returns the customer infor entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the customer infor entry
	 * @return the customer infor entry, or <code>null</code> if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CustomerInforEntry customerInforEntry = (CustomerInforEntry)EntityCacheUtil.getResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
				CustomerInforEntryImpl.class, primaryKey);

		if (customerInforEntry == _nullCustomerInforEntry) {
			return null;
		}

		if (customerInforEntry == null) {
			Session session = null;

			try {
				session = openSession();

				customerInforEntry = (CustomerInforEntry)session.get(CustomerInforEntryImpl.class,
						primaryKey);

				if (customerInforEntry != null) {
					cacheResult(customerInforEntry);
				}
				else {
					EntityCacheUtil.putResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
						CustomerInforEntryImpl.class, primaryKey,
						_nullCustomerInforEntry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CustomerInforEntryModelImpl.ENTITY_CACHE_ENABLED,
					CustomerInforEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customerInforEntry;
	}

	/**
	 * Returns the customer infor entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customerInforEntryId the primary key of the customer infor entry
	 * @return the customer infor entry, or <code>null</code> if a customer infor entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CustomerInforEntry fetchByPrimaryKey(long customerInforEntryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)customerInforEntryId);
	}

	/**
	 * Returns all the customer infor entries.
	 *
	 * @return the customer infor entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerInforEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the customer infor entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer infor entries
	 * @param end the upper bound of the range of customer infor entries (not inclusive)
	 * @return the range of customer infor entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerInforEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the customer infor entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.docs.customercare.model.impl.CustomerInforEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of customer infor entries
	 * @param end the upper bound of the range of customer infor entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of customer infor entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CustomerInforEntry> findAll(int start, int end,
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

		List<CustomerInforEntry> list = (List<CustomerInforEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUSTOMERINFORENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMERINFORENTRY;

				if (pagination) {
					sql = sql.concat(CustomerInforEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CustomerInforEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CustomerInforEntry>(list);
				}
				else {
					list = (List<CustomerInforEntry>)QueryUtil.list(q,
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
	 * Removes all the customer infor entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CustomerInforEntry customerInforEntry : findAll()) {
			remove(customerInforEntry);
		}
	}

	/**
	 * Returns the number of customer infor entries.
	 *
	 * @return the number of customer infor entries
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

				Query q = session.createQuery(_SQL_COUNT_CUSTOMERINFORENTRY);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the customer infor entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.docs.customercare.model.CustomerInforEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CustomerInforEntry>> listenersList = new ArrayList<ModelListener<CustomerInforEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CustomerInforEntry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CustomerInforEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUSTOMERINFORENTRY = "SELECT customerInforEntry FROM CustomerInforEntry customerInforEntry";
	private static final String _SQL_COUNT_CUSTOMERINFORENTRY = "SELECT COUNT(customerInforEntry) FROM CustomerInforEntry customerInforEntry";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customerInforEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerInforEntry exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CustomerInforEntryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"comment"
			});
	private static CustomerInforEntry _nullCustomerInforEntry = new CustomerInforEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CustomerInforEntry> toCacheModel() {
				return _nullCustomerInforEntryCacheModel;
			}
		};

	private static CacheModel<CustomerInforEntry> _nullCustomerInforEntryCacheModel =
		new CacheModel<CustomerInforEntry>() {
			@Override
			public CustomerInforEntry toEntityModel() {
				return _nullCustomerInforEntry;
			}
		};
}