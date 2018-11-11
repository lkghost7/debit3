package by.itacademy.dao.generic;

import by.itacademy.model.BaseEntity;

import java.util.List;

public interface BaseDao<T extends BaseEntity> {

    Long save(T entity);

    List<T> findAll();

    void delete(T entity);

    T findById(Long id);

    void update(T entity);

}