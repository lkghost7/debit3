package by.itacademy.dao.generic;

import by.itacademy.model.BaseEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfigurationTest.class)
@Transactional
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