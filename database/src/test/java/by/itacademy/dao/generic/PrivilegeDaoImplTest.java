//package by.itacademy.dao.generic;
//
//import by.itacademy.model.Privilege;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class PrivilegeDaoImplTest {
//    @Autowired
//    private PrivilegeDaoImpl dao;
//
//    @Test
//    public void saveTest() {
//        Privilege privilege = new Privilege();
//        privilege.setNamePrivilege("Executor");
//        Long id = dao.save(privilege);
//        Privilege privilegeFromDb = dao.findById(id);
//        Assert.assertEquals(privilege.getNamePrivilege(), privilegeFromDb.getNamePrivilege());
//        dao.delete(privilege);
//        Privilege result = dao.findById(id);
//        Assert.assertNull(result);
//    }
//
//    @Test
//    public void findAllTest() {
//        Privilege privilege1 = new Privilege("Executor");
//        Privilege privilege2 = new Privilege("Executor");
//        Long id1 = dao.save(privilege1);
//        Assert.assertNotNull(id1);
//        Long id2 = dao.save(privilege2);
//        Assert.assertNotNull(id2);
//        List<Privilege> privilegeList = dao.findAll();
//        Assert.assertTrue(privilegeList.size() >= 2);
//        dao.delete(privilege1);
//        dao.delete(privilege2);
//    }
//
//    @Test
//    public void update() {
//        Privilege privilege = new Privilege();
//        privilege.setNamePrivilege("Executor");
//        Long id = dao.save(privilege);
//        Privilege privilegeFromDb = dao.findById(id);
//        Assert.assertEquals(privilege.getNamePrivilege(), privilegeFromDb.getNamePrivilege());
//        privilegeFromDb.setNamePrivilege("Operator");
//        dao.update(privilegeFromDb);
//        Privilege privilegeAfterUpdate = dao.findById(id);
//        Assert.assertEquals(privilegeFromDb.getNamePrivilege(), privilegeAfterUpdate.getNamePrivilege());
//        dao.delete(privilegeAfterUpdate);
//    }
//}