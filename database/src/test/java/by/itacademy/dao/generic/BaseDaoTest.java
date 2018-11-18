package by.itacademy.dao.generic;

import by.itacademy.model.BaseEntity;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public abstract class BaseDaoTest<T extends BaseEntity> {
    protected abstract BaseDao<T> getDao();

    protected abstract T getModel();

    @Test
    public void testSave() {
        T model = getModel();
        Long id = getDao().save(model);
        T entity = getDao().findById(id);
        assertNotNull(entity);
        getDao().delete(entity);
    }

    @Test
    public void testDelete() {
        T model = getModel();
        Long id = getDao().save(model);
        getDao().delete(model);
        T entity = getDao().findById(id);
        assertNull(entity);
    }
}