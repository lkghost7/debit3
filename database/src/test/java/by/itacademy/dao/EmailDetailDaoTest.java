package by.itacademy.dao;

import by.itacademy.model.EmailDetail;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmailDetailDaoTest {

    @Test
    public void findById() {
    }

    @Test
    public void save() {
        EmailDetail emailDetail = new EmailDetail();
        emailDetail.setEmail("lk1@tut.by");
        EmailDetailDao.getInstance().save(emailDetail);
        EmailDetailDao.getInstance().delete(emailDetail);
    }

    @Test
    public void findAll() {
        List<EmailDetail> emailDetailList = EmailDetailDao.getInstance().findAll();
        Assert.assertNotNull(emailDetailList);
    }

    @Test
    public void delete() {
    }
}