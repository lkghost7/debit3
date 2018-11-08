package by.itacademy.dao.generic;

import by.itacademy.model.BaseEntity;
import lombok.Cleanup;
import org.hibernate.Session;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import static by.itacademy.connection.ConnectionPool.getConnection;

public class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {
    private final Class<T> modelClass;

    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        this.modelClass = (Class<T>) type.getActualTypeArguments()[0];
    }

    @Override
    public Long save(T entity) {
        @Cleanup Session session = getConnection();
        Serializable id = session.save(entity);
        session.close();
        return (Long) id;
    }

    @Override
    public List<T> findAll() {
        Session session = getConnection();
        return session.createQuery(
                "FROM " + modelClass.getSimpleName(), modelClass)
                .getResultList();
    }

    @Override
    public void delete(T entity) {
        Session session = getConnection();
        session.beginTransaction();
        session.delete(entity);
        session.flush();
        session.getTransaction().commit();
    }

    @Override
    public T findById(Long id) {
        @Cleanup Session session = getConnection();
        return session.find(modelClass, id);
    }

    @Override
    public void update(T entity) {
        Session session = getConnection();
        session.beginTransaction();
        session.update(entity);
        session.flush();
        session.getTransaction().commit();

    }
}