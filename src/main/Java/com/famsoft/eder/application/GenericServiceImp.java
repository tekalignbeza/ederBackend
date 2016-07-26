package com.famsoft.eder.application;

import com.famsoft.eder.data.GenericDao;
import com.famsoft.eder.model.CoreEntity;
import com.famsoft.eder.model.Member;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */


@Transactional
public class GenericServiceImp<E extends CoreEntity> implements GenericService<E> {

    GenericDao<E> genericDao;

    public GenericServiceImp(GenericDao<E> genericDao) {
        this.genericDao = genericDao;
    }

    @Override
    public E get(long id) {
        return genericDao.get(id);
    }

    @Override
    public List<E> getAll() {
        return genericDao.getAll();
    }

    @Override
    public void create(E entity) {
        genericDao.create(entity);
    }

    @Override
    public void update(E entity) {
        genericDao.update(entity);
    }

    @Override
    public void delete(long id) {
        genericDao.delete(id);
    }
}
