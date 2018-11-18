package by.itacademy.dao.generic;

import by.itacademy.model.Company;

public class CompanDaoImpl extends BaseDaoImpl<Company> implements CompanDao {

    private static final CompanDaoImpl INSTANCE = new CompanDaoImpl();

    public static CompanDaoImpl getCompanDao() {
        return INSTANCE;
    }
}