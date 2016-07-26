package com.famsoft.eder.data;

import com.famsoft.eder.model.CoreEntity;
import com.famsoft.eder.model.Member;

import java.util.List;

/**
 * Created by tekalign.bezawork on 3/28/16.
 */
public interface GenericDao<E extends CoreEntity> {

    public E get(long id);
    public List<E> getAll();
    public void create(E entity);
    public void update(E entity);
    public void delete(long id);

}
