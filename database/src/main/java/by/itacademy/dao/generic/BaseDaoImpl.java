package by.itacademy.dao.generic;

import by.itacademy.model.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {
    private final Class<T> modelClass;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    @SuppressWarnings("unchecked")
    public BaseDaoImpl() {
        this.modelClass = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), BaseDaoImpl.class);
    }

    @Override
    public Long save(T entity) {
        Session session = sessionFactory.getCurrentSession();
        Serializable id = session.save(entity);
        return (Long) id;
    }

    @Override
    public List<T> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(
                "FROM " + modelClass.getSimpleName(), modelClass)
                .getResultList();
    }

    @Override
    public void delete(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(entity);
    }

    @Override
    public T findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(modelClass, id);
    }

    @Override
    public void update(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.update(modelClass.getSimpleName(), entity);
    }
}