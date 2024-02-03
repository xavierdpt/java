package com.github.xavierdpt.java.apollo.demo1;

import jakarta.persistence.CacheRetrieveMode;
import jakarta.persistence.CacheStoreMode;
import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.FlushModeType;
import jakarta.persistence.LockModeType;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.metamodel.Metamodel;
import org.hibernate.CacheMode;
import org.hibernate.Filter;
import org.hibernate.FlushMode;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.LobHelper;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.NaturalIdLoadAccess;
import org.hibernate.NaturalIdMultiLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionEventListener;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionBuilder;
import org.hibernate.SimpleNaturalIdLoadAccess;
import org.hibernate.Transaction;
import org.hibernate.graph.RootGraph;
import org.hibernate.jdbc.ReturningWork;
import org.hibernate.jdbc.Work;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.SelectionQuery;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaInsertSelect;
import org.hibernate.stat.SessionStatistics;

import java.util.List;
import java.util.Map;

public class Foo {
    public static void foo(Session session) {
        if (session != null) {
            return;
        }

        {
            SessionEventListener[] listeners = new SessionEventListener[0];
            session.addEventListeners(listeners);
        }
        {
            Transaction transaction = session.beginTransaction();
        }
        {
            LockOptions lockOptions = null;
            Session.LockRequest lockRequest = session.buildLockRequest(lockOptions);
        }
        {
            String entityName = null;
            IdentifierLoadAccess<Object> objectIdentifierLoadAccess = session.byId(entityName);
        }
        {
            Class<? extends Object> entityClass = null;
            IdentifierLoadAccess<?> identifierLoadAccess = session.byId(entityClass);
        }
        {
            String entityName = null;
            MultiIdentifierLoadAccess<Object> objectMultiIdentifierLoadAccess = session.byMultipleIds(entityName);
        }
        {
            Class<? extends Object> entityClass = null;
            MultiIdentifierLoadAccess<?> multiIdentifierLoadAccess = session.byMultipleIds(entityClass);
        }
        {
            String entityName = null;
            NaturalIdMultiLoadAccess<Object> objectNaturalIdMultiLoadAccess = session.byMultipleNaturalId(entityName);
        }
        {
            Class<? extends Object> entityClass = null;
            NaturalIdMultiLoadAccess<?> naturalIdMultiLoadAccess = session.byMultipleNaturalId(entityClass);
        }
        {
            String entityName = null;
            NaturalIdLoadAccess<Object> objectNaturalIdLoadAccess = session.byNaturalId(entityName);
        }
        {
            Class<? extends Object> entityClass = null;
            NaturalIdLoadAccess<?> naturalIdLoadAccess = session.byNaturalId(entityClass);
        }
        {
            String entityName = null;
            SimpleNaturalIdLoadAccess<Object> objectSimpleNaturalIdLoadAccess = session.bySimpleNaturalId(entityName);
        }
        {
            Class<? extends Object> entityClass = null;
            SimpleNaturalIdLoadAccess<?> simpleNaturalIdLoadAccess = session.bySimpleNaturalId(entityClass);
        }
        {
            session.cancelQuery();
        }
        {
            session.clear();
        }
        {
            session.close();
        }
        {
            Object object = null;
            boolean contains = session.contains(object);
        }
        {
            String entityName = null;
            Object object = null;
            boolean contains = session.contains(entityName, object);
        }
        {
            Class<? extends Object> rootType = null;
            RootGraph<?> entityGraph = session.createEntityGraph(rootType);
        }
        {
            String graphName = null;

            RootGraph<?> entityGraph = session.createEntityGraph(graphName);
        }
        {
            Class<? extends Object> rootType = null;
            String graphName = null;
            RootGraph<?> entityGraph = session.createEntityGraph(rootType, graphName);
        }
        {
            String hqlString = null;
            MutationQuery mutationQuery = session.createMutationQuery(hqlString);
        }
        {
            CriteriaUpdate updateQuery = null;
            MutationQuery mutationQuery = session.createMutationQuery(updateQuery);
        }
        {
            CriteriaDelete deleteQuery = null;
            MutationQuery mutationQuery = session.createMutationQuery(deleteQuery);
        }
        {
            JpaCriteriaInsertSelect inserSelect = null;
            MutationQuery mutationQuery = session.createMutationQuery(inserSelect);
        }
        {
            String name = null;
            MutationQuery namedMutationQuery = session.createNamedMutationQuery(name);
        }
        {
            String name = null;
            Class<?> resultClass = null;
            Query<?> namedQuery = session.createNamedQuery(name, resultClass);
        }

        {
            String name = null;
            Class<?> resultType = null;
            SelectionQuery<?> namedSelectionQuery = session.createNamedSelectionQuery(name, resultType);
        }

        {
            String name = null;
            ProcedureCall namedStoredProcedureQuery = session.createNamedStoredProcedureQuery(name);
        }
        {
            String sqlString = null;
            MutationQuery nativeMutationQuery = session.createNativeMutationQuery(sqlString);
        }
        {
            String sqlString = null;
            Class<? extends Object> resultClass = null;
            NativeQuery<?> nativeQuery = session.createNativeQuery(sqlString, resultClass);
        }
        {
            String sqlString = null;
            Class<? extends Object> resultClass = null;
            String tableAlias = null;
            NativeQuery<?> nativeQuery = session.createNativeQuery(sqlString, resultClass, tableAlias);
        }
        {
            String sqlString = null;
            String resultSetMappingName = null;
            Class<?> resultClass = null;
            NativeQuery<?> nativeQuery = session.createNativeQuery(sqlString, resultSetMappingName, resultClass);
        }


        {
            String queryString = null;
            Class<?> resultClass = null;
            Query<?> query = session.createQuery(queryString, resultClass);
        }
        {
            CriteriaQuery<? extends Object> criteriaQuery = null;
            Query<?> query = session.createQuery(criteriaQuery);
        }
        {
            String hqlString = null;
            Class<?> resultType = null;
            SelectionQuery<?> selectionQuery = session.createSelectionQuery(hqlString, resultType);
        }
        {
            CriteriaQuery<? extends Object> criteria = null;
            SelectionQuery<?> selectionQuery = session.createSelectionQuery(criteria);
        }
        {
            String procedureName = null;
            ProcedureCall storedProcedureCall = session.createStoredProcedureCall(procedureName);
        }
        {
            String procedureName = null;
            Class<?>[] resultClasses = new Class[0];
            ProcedureCall storedProcedureCall = session.createStoredProcedureCall(procedureName, resultClasses);
        }
        {
            String procedureName = null;
            String[] resultSetMappings = new String[0];
            session.createStoredProcedureCall(procedureName, resultSetMappings);
        }
        {
            String procedureName = null;
            ProcedureCall storedProcedureQuery = session.createStoredProcedureQuery(procedureName);
        }
        {
            String procedureName = null;
            Class<?>[] resultClasses = new Class[0];
            ProcedureCall storedProcedureQuery = session.createStoredProcedureQuery(procedureName, resultClasses);
        }
        {
            String procedureName = null;
            String[] resultSetMappings = new String[0];
            ProcedureCall storedProcedureQuery = session.createStoredProcedureQuery(procedureName, resultSetMappings);
        }
        {
            Object object = null;
            session.detach(object);
        }
        {
            String name = null;
            session.disableFetchProfile(name);
        }
        {
            String filterName = null;
            session.disableFilter(filterName);
        }
        {
            ReturningWork<?> work = null;
            Object o = session.doReturningWork(work);
        }
        {
            Work work = null;
            session.doWork(work);
        }
        {
            String name = null;
            session.enableFetchProfile(name);
        }
        {
            String filterName = null;
            session.enableFilter(filterName);
        }
        {
            Object object = null;
            session.evict(object);
        }
        {
            Class<?> oClass = null;
            Object object = null;
            Object o = session.find(oClass, object);
        }
        {
            Class<?> oClass = null;
            Object o = null;
            Map<String, Object> map = null;
            Object o1 = session.find(oClass, o, map);
        }
        {
            Class<?> aClass = null;
            Object o = null;
            LockModeType lockModeType = null;
            Object o1 = session.find(aClass, o, lockModeType);
        }
        {
            Class<?> aClass = null;
            Object o = null;
            LockModeType lockModeType = null;
            Map<String, Object> map = null;
            Object o1 = session.find(aClass, o, lockModeType, map);
        }
        {
            session.flush();
        }
        {
            Class<?> entityType = null;
            Object id = null;
            Object o = session.get(entityType, id);
        }
        {
            Class<?> entityType = null;
            Object id = null;
            LockMode lockMode = null;
            Object o = session.get(entityType, id, lockMode);
        }
        {
            Class<?> entityType = null;
            Object id = null;
            LockOptions lockOptions = null;
            Object o = session.get(entityType, id, lockOptions);
        }
        {
            String entityName = null;
            Object id = null;
            Object o = session.get(entityName, id);
        }
        {
            String entityName = null;
            Object id = null;
            LockMode lockMode = null;
            Object o = session.get(entityName, id, lockMode);
        }
        {
            String entityName = null;
            Object id = null;
            LockMode lockOptions = null;
            Object o = session.get(entityName, id, lockOptions);
        }
        {
            CacheMode cacheMode = session.getCacheMode();
        }
        {
            CacheRetrieveMode cacheRetrieveMode = session.getCacheRetrieveMode();
        }
        {
            CacheStoreMode cacheStoreMode = session.getCacheStoreMode();
        }
        {
            HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        }
        {
            Object object = null;
            LockMode currentLockMode = session.getCurrentLockMode(object);
        }
        {
            Object delegate = session.getDelegate();
        }
        {
            String filterName = null;
            Filter enabledFilter = session.getEnabledFilter(filterName);
        }
        {
            String graphName = null;
            RootGraph<?> entityGraph = session.getEntityGraph(graphName);
        }
        {
            Class<?> entityClass = null;
            List<EntityGraph<?>> entityGraphs = (List<EntityGraph<?>>) session.getEntityGraphs(entityClass);
        }
        {
            EntityManagerFactory entityManagerFactory = session.getEntityManagerFactory();
        }
        {
            Object object = null;
            String entityName = session.getEntityName(object);
        }
        {
            SessionFactory factory = session.getFactory();
        }
        {
            int fetchBatchSize = session.getFetchBatchSize();
        }
        {
            FlushModeType flushMode = session.getFlushMode();
        }
        {
            FlushMode hibernateFlushMode = session.getHibernateFlushMode();
        }
        {
            Object object = null;
            Object identifier = session.getIdentifier(object);
        }
        {
            Integer jdbcBatchSize = session.getJdbcBatchSize();
        }
        {
            LobHelper lobHelper = session.getLobHelper();
        }
        {
            Object object = null;
            LockModeType lockMode = session.getLockMode(object);
        }
        {
            Metamodel metamodel = session.getMetamodel();
        }
        {
            String name = null;
            session.getNamedProcedureCall(name);
        }
        {
            String queryName = null;
            session.getNamedQuery(queryName);
        }
        {
            Map<String, Object> properties = session.getProperties();
        }
        {
            Class<? extends Object> entityType = null;
            Object id = null;
            Object reference = session.getReference(entityType, id);
        }
        {
            String entityName = null;
            Object id = null;
            Object reference = session.getReference(entityName, id);
        }
        {
            Object object = null;
            Object reference = session.getReference(object);
        }
        {
            SessionFactory sessionFactory = session.getSessionFactory();
        }
        {
            SessionStatistics statistics = session.getStatistics();
        }
        {
            String tenantIdentifier = session.getTenantIdentifier();
        }
        {
            Object tenantIdentifierValue = session.getTenantIdentifierValue();
        }
        {
            Transaction transaction = session.getTransaction();
        }
        {
            boolean connected = session.isConnected();
        }
        {
            boolean defaultReadOnly = session.isDefaultReadOnly();
        }
        {
            boolean dirty = session.isDirty();
        }
        {
            String name = null;
            session.isFetchProfileEnabled(name);
        }
        {
            boolean joinedToTransaction = session.isJoinedToTransaction();
        }
        {
            boolean open = session.isOpen();
        }
        {
            Object entityOrProxy = null;
            boolean readOnly = session.isReadOnly(entityOrProxy);
        }
        {
            boolean subselectFetchingEnabled = session.isSubselectFetchingEnabled();
        }
        {
            session.joinTransaction();
        }
        {
            Object object = null;
            Object id = null;
            session.load(object, id);
        }
        {
            Object object = null;
            LockMode lockMode = null;
            session.lock(object, lockMode);
        }
        {
            Object object = null;
            LockOptions lockOptions = null;
            session.lock(object, lockOptions);
        }
        {
            Object o = null;
            LockModeType lockModetype = null;
            session.lock(o, lockModetype);
        }
        {
            Object o = null;
            LockModeType lockModetype = null;
            Map<String, Object> map = null;
            session.lock(o, lockModetype, map);
        }
        {
            Object object = null;
            Object merge = session.merge(object);
        }
        {
            String entityName = null;
            Object object = null;
            Object merge = session.merge(entityName, object);
        }
        {
            Object object = null;
            session.persist(object);
        }
        {
            String entityName = null;
            Object object = null;
            session.persist(entityName, object);
        }
        {
            Object object = null;
            session.refresh(object);
        }
        {
            Object object = null;
            LockMode lockMode = null;
            session.refresh(object, lockMode);
        }
        {
            Object object = null;
            LockOptions lockOptions = null;
            session.refresh(object, lockOptions);
        }
        {
            Object object = null;
            Map<String, Object> map = null;
            session.refresh(object, map);
        }
        {
            Object object = null;
            LockModeType lockModeType = null;
            session.refresh(object, lockModeType);
        }
        {
            Object object = null;
            LockModeType lockModeType = null;
            Map<String, Object> map = null;
            session.refresh(object, lockModeType, map);
        }
        {
            Object object = null;
            session.remove(object);
        }
        {
            SharedSessionBuilder sharedSessionBuilder = session.sessionWithOptions();
        }
        {
            CacheMode cacheMode = null;
            session.setCacheMode(cacheMode);
        }
        {
            CacheRetrieveMode cacheRetrieveMode = null;
            session.setCacheRetrieveMode(cacheRetrieveMode);
        }
        {
            CacheStoreMode cacheStoreMode = null;
            session.setCacheStoreMode(cacheStoreMode);
        }
        {
            boolean readOnly = false;
            session.setDefaultReadOnly(readOnly);
        }
        {
            int batchSize = 0;
            session.setFetchBatchSize(batchSize);
        }
        {
            FlushModeType flushMode = null;
            session.setFlushMode(flushMode);
        }
        {
            FlushMode flushMode = null;
            session.setHibernateFlushMode(flushMode);
        }
        {
            Integer jdbcBatchSize = null;
            session.setJdbcBatchSize(jdbcBatchSize);
        }
        {
            String s = null;
            Object o = null;
            session.setProperty(s, o);
        }
        {
            Object entityOrProxy = null;
            boolean readOnly = false;
            session.setReadOnly(entityOrProxy, readOnly);
        }
        {
            boolean enabled = false;
            session.setSubselectFetchingEnabled(enabled);
        }
        {
            Class<?> aClass = null;
            Object unwrap = session.unwrap(aClass);
        }


    }
}
