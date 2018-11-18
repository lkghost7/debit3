package by.itacademy.dao.generic;

import by.itacademy.model.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfigurationTest.class)
@Transactional
public class CompanDaoImplTest {

    @Autowired
    private CompanDaoImpl dao;

    @Test
    public void saveTest() {
        Company company = new Company();
        company.setName("Лена");
        Long id = dao.save(company);
        Company companyFromDb = dao.findById(id);
        Assert.assertEquals(company.getName(), companyFromDb.getName());
        dao.delete(company);
        Company result = dao.findById(id);
        Assert.assertNull(result);
    }

    @Test
    public void findAllTest() {
        Company company1 = new Company();
        Company company2 = new Company();
        Long id1 = dao.save(company1);
        Assert.assertNotNull(id1);
        Long id2 = dao.save(company2);
        Assert.assertNotNull(id2);
        List<Company> companyList = dao.findAll();
        Assert.assertTrue(companyList.size() >= 2);
        dao.delete(company1);
        dao.delete(company2);
    }

    @Test
    public void update() {
        Company company = new Company();
        company.setName("IBM");
        Long id = dao.save(company);
        Company companyFromDb = dao.findById(id);
        Assert.assertEquals(company.getName(), companyFromDb.getName());
        companyFromDb.setName("HP");
        dao.update(companyFromDb);
        Company companyAfterUpdate = dao.findById(id);
        Assert.assertEquals(companyFromDb.getName(), companyAfterUpdate.getName());
        dao.delete(companyAfterUpdate);
    }
}