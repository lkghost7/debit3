package by.itacademy.dao.generic;

import by.itacademy.model.Privilege;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrivilegeDaoImplTest {

    private PrivilegeDaoImpl dao = new PrivilegeDaoImpl();

    @Test
    public void saveTest() {
        Privilege privilege = new Privilege();
        privilege.setNamePrivilege("Executor");
        Long id = PrivilegeDaoImpl.getPrivilegeDao().save(privilege);
        Privilege privilegeFromDb = PrivilegeDaoImpl.getPrivilegeDao().findById(id);
        Assert.assertEquals(privilege.getNamePrivilege(), privilegeFromDb.getNamePrivilege());
        PrivilegeDaoImpl.getPrivilegeDao().delete(privilege);
        Privilege result = PrivilegeDaoImpl.getPrivilegeDao().findById(id);
        Assert.assertNull(result);
    }

    @Test
    public void findAllTest() {
        Privilege privilege1 = new Privilege("Executor");
        Privilege privilege2 = new Privilege("Executor");
        Long id1 = dao.save(privilege1);
        Assert.assertNotNull(id1);
        Long id2 = dao.save(privilege2);
        Assert.assertNotNull(id2);
        List<Privilege> privilegeList = dao.findAll();
        Assert.assertTrue(privilegeList.size() >= 2);
        dao.delete(privilege1);
        dao.delete(privilege2);
    }

    @Test
    public void update() {
        Privilege privilege = new Privilege();
        privilege.setNamePrivilege("Executor");
        Long id = dao.save(privilege);
        Privilege privilegeFromDb = dao.findById(id);
        Assert.assertEquals(privilege.getNamePrivilege(), privilegeFromDb.getNamePrivilege());
        privilegeFromDb.setNamePrivilege("Operator");
        dao.update(privilegeFromDb);
        Privilege privilegeAfterUpdate = dao.findById(id);
        Assert.assertEquals(privilegeFromDb.getNamePrivilege(), privilegeAfterUpdate.getNamePrivilege());
        dao.delete(privilegeAfterUpdate);
    }
}