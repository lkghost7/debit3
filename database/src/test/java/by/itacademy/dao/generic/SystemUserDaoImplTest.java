package by.itacademy.dao.generic;

import by.itacademy.model.SystemUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemUserDaoImplTest {

    @Autowired
    private SystemUserDaoImpl dao;

    @Test
    public void saveTest() {
        SystemUser systemUser = new SystemUser();
        systemUser.setNameUser("Admin");
        systemUser.setEmail("Email");
        systemUser.setPasswordUser("pass");
        Long id = dao.save(systemUser);
        SystemUser systemUserFromDb = dao.findById(id);
        Assert.assertEquals(systemUser.getNameUser(), systemUserFromDb.getNameUser());
        dao.delete(systemUser);
        SystemUser result = dao.findById(id);
        Assert.assertNull(result);
    }

    @Test
    public void findAllTest() {
        SystemUser systemUser1 = new SystemUser();
        systemUser1.setNameUser("Admin");
        systemUser1.setEmail("Email");
        systemUser1.setPasswordUser("pass");
        SystemUser systemUser2 = new SystemUser();
        systemUser2.setNameUser("Admin");
        systemUser2.setEmail("Email");
        systemUser2.setPasswordUser("pass");
        Long id1 = dao.save(systemUser1);
        Assert.assertNotNull(id1);
        Long id2 = dao.save(systemUser2);
        Assert.assertNotNull(id2);
        List<SystemUser> systemUserList = dao.findAll();
        Assert.assertTrue(systemUserList.size() >= 2);
        dao.delete(systemUser1);
        dao.delete(systemUser2);
    }

    @Test
    public void update() {
        SystemUser systemUser = new SystemUser();
        systemUser.setNameUser("Admin");
        systemUser.setEmail("Email");
        systemUser.setPasswordUser("pass");
        Long id = dao.save(systemUser);
        SystemUser systemUserFromDb = dao.findById(id);
        Assert.assertEquals(systemUser.getNameUser(), systemUserFromDb.getNameUser());
        systemUserFromDb.setNameUser("User");
        dao.update(systemUserFromDb);
        SystemUser systemUserAfterUpdate = dao.findById(id);
        Assert.assertEquals(systemUserFromDb.getNameUser(), systemUserAfterUpdate.getNameUser());
        dao.delete(systemUserAfterUpdate);
    }
}