package by.itacademy.dao;

import by.itacademy.dao.generic.BaseDao;
import by.itacademy.dao.generic.BaseDaoTest;
import by.itacademy.dao.generic.CompanDaoImpl;
import by.itacademy.model.Company;
import org.springframework.beans.factory.annotation.Autowired;

public class CompanDaoImplTest extends BaseDaoTest<Company> {
    @Override
    protected BaseDao<Company> getDao() {
        return null;
    }

    @Override
    protected Company getModel() {
        return null;
    }

//    @Autowired
//    private BaseDao<Company> DAO;
//
//    @Override
//    protected BaseDao<Company> getDao() {
//        return DAO;
//    }
//
//    @Override
//    protected Company getModel() {
//        return new Company();
//    }

}