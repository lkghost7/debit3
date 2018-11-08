package by.itacademy.dao;

import by.itacademy.model.Company;
import by.itacademy.model.EmailDetail;
import by.itacademy.model.Person;
import org.junit.Test;

public class PersonDaoTest {

    @Test
    public void save() {
        Person person = new Person();
        person.setName("ваня");
        person.setFamaly("Мванко");
        Company company = CompanyDao.getInstance().findById(1L);
        EmailDetail emailDetail = EmailDetailDao.getInstance().findById(1L);
        person.setCompany(company);
        person.setEmailDetail(emailDetail);
        PersonDao.getInstance().save(person);
    }
}