package by.itacademy.dao;

import by.itacademy.dao.generic.BaseDao;
import by.itacademy.dao.generic.BaseDaoTest;
import by.itacademy.dao.generic.CompanDaoImpl;
import by.itacademy.model.Company;

public class CompanDaoImplTest extends BaseDaoTest<Company> {

    private static final BaseDao<Company> DAO = new CompanDaoImpl();

    @Override
    protected BaseDao<Company> getDao() {
        return DAO;
    }

    @Override
    protected Company getModel() {
        return new Company();
    }

}