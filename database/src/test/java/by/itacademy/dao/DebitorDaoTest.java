package by.itacademy.dao;

import by.itacademy.model.Debitor;
import org.junit.Test;

import java.util.List;

public class DebitorDaoTest {

    @Test
    public void save() {
        Debitor debitor = new Debitor();
        debitor.setSubdivisions("test1");
        debitor.setDebitor("test2");
        debitor.setDateOfOccurrence("test3");
        debitor.setPrincipalAmount("test4");
        debitor.setSentDate("data");
        DebitorsDao.getInstance().save(debitor);
        DebitorsDao.getInstance().delete(debitor);
    }

    @Test
    public void findAll() {
        List<Debitor> list = DebitorsDao.getInstance().findAll();
        list.forEach(System.out::println);
    }
}