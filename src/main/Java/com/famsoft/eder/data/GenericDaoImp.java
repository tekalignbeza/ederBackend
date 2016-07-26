package com.famsoft.eder.data;

import com.famsoft.eder.model.CoreEntity;
import com.famsoft.eder.model.Member;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */


public class GenericDaoImp<E extends CoreEntity> implements GenericDao<E> {

    @Autowired
    SessionFactory sessionFactory;

    public GenericDaoImp(Class<?> entityClass) {
        this.entityClass = entityClass;
    }

    Class<?> entityClass;

    public E get(long id) {

        return (E) sessionFactory.getCurrentSession().load(entityClass, id);
    }

    public List<E> getAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from " + entityClass.getName());
        return query.list();
    }

    public void create(E entity) {

        sessionFactory.getCurrentSession().persist(entity);
    }

    public void update(E entity) {

        sessionFactory.getCurrentSession().merge(entity);
    }

    public void delete(long id) {
        E toDelete = (E)sessionFactory.getCurrentSession().load(entityClass, id);
        sessionFactory.getCurrentSession().delete(toDelete);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public Class<?> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<?> entityClass) {
        this.entityClass = entityClass;
    }
}
