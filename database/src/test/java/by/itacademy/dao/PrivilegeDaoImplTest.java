package by.itacademy.dao;

import by.itacademy.dao.generic.BaseDao;
import by.itacademy.dao.generic.BaseDaoTest;
import by.itacademy.dao.generic.PrivilegeDaoImpl;
import by.itacademy.model.Privilege;

public class PrivilegeDaoImplTest extends BaseDaoTest<Privilege> {

    private static final BaseDao<Privilege> DAO = new PrivilegeDaoImpl();

    @Override
    protected BaseDao<Privilege> getDao() {
        return DAO;
    }

    @Override
    protected Privilege getModel() {
        return new Privilege("Мега-админ");
    }
}