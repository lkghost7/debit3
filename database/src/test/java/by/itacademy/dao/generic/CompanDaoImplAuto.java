package by.itacademy.dao.generic;

import by.itacademy.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CompanDaoImplAuto extends BaseDaoTest<Company> {

    @Qualifier("companDaoImpl")
    @Autowired
    private BaseDao<Company> dao = new CompanDaoImpl();

    @Override
    protected BaseDao<Company> getDao() {
        return dao;
    }

    @Override
    protected Company getModel() {
        return new Company();
    }
}
