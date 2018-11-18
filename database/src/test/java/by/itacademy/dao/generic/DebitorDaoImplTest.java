//package by.itacademy.dao.generic;
//
//import by.itacademy.model.Debitor;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class DebitorDaoImplTest {
//
//    @Autowired
//    private DebitorDaoImpl dao;
//
//    @Test
//    public void saveTest() {
//        Debitor debitor = new Debitor();
//        debitor.setSubdivisions("Колядичи");
//        Long id = dao.save(debitor);
//        Debitor debitorFromDb = dao.findById(id);
//        Assert.assertEquals(debitor.getSubdivisions(), debitorFromDb.getSubdivisions());
//        dao.delete(debitor);
//        Debitor result = dao.findById(id);
//        Assert.assertNull(result);
//    }
//
//    @Test
//    public void findAllTest() {
//        Debitor debitor1 = new Debitor();
//        Debitor debitor2 = new Debitor();
//        Long id1 = dao.save(debitor1);
//        Assert.assertNotNull(id1);
//        Long id2 = dao.save(debitor2);
//        Assert.assertNotNull(id2);
//        List<Debitor> debitorList = dao.findAll();
//        Assert.assertTrue(debitorList.size() >= 2);
//        dao.delete(debitor1);
//        dao.delete(debitor2);
//    }
//
//    @Test
//    public void update() {
//        Debitor debitor = new Debitor();
//        debitor.setSubdivisions("IBM");
//        Long id = dao.save(debitor);
//        Debitor debitorFromDb = dao.findById(id);
//        Assert.assertEquals(debitor.getSubdivisions(), debitorFromDb.getSubdivisions());
//        debitorFromDb.setSubdivisions("HP");
//        dao.update(debitorFromDb);
//        Debitor debitorAfterUpdate = dao.findById(id);
//        Assert.assertEquals(debitorFromDb.getSubdivisions(), debitorAfterUpdate.getSubdivisions());
//        dao.delete(debitorAfterUpdate);
//    }
//}