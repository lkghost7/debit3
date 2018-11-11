package by.itacademy.dao.generic;

import by.itacademy.model.SystemUser;

public class SystemUserDaoImpl extends BaseDaoImpl<SystemUser> implements SystemUserDao {

    private static final SystemUserDaoImpl INSTANCE = new SystemUserDaoImpl();

    public static SystemUserDaoImpl getSystemUserDao() {
        return INSTANCE;
    }

}