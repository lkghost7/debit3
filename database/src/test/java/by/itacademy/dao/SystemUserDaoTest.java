package by.itacademy.dao;

import by.itacademy.model.Privilege;
import by.itacademy.model.SystemUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SystemUserDaoTest {

    @Test
    public void save() {
        SystemUser systemUser = new SystemUser();
        systemUser.setId(100L);
        systemUser.setEmail("lk@i.ua");
        systemUser.setPasswordUser("222");
        systemUser.setFamilyUser("Зыскунов");

        Set<Privilege> privilegeSet = new HashSet<>();
        Privilege privilege = new Privilege(1L);
        Privilege privilege2 = new Privilege(2L);
        privilegeSet.add(privilege);
        privilegeSet.add(privilege2);
        Assert.assertNotNull(privilegeSet);

        Long id = SystemUserDao.getInstance().save(systemUser);
        Assert.assertNotNull(id);
        SystemUserDao.getInstance().delete(id);
    }

    @Test
    public void findById() {
        SystemUser systemUser = new SystemUser();
        systemUser.setId(100L);
        systemUser.setEmail("lk@i.ua");
        systemUser.setPasswordUser("222");
        systemUser.setFamilyUser("Зыскунов");
        Long id = SystemUserDao.getInstance().save(systemUser);
        SystemUser systemUserFromDb = SystemUserDao.getInstance().findById(id);
        System.out.println(systemUserFromDb);
        SystemUserDao.getInstance().delete(id);
    }
}