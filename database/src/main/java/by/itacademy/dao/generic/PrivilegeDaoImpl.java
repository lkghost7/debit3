package by.itacademy.dao.generic;

import by.itacademy.model.Privilege;

public class PrivilegeDaoImpl extends BaseDaoImpl<Privilege> implements PrivilegeDao {

    private static final PrivilegeDaoImpl INSTANCE = new PrivilegeDaoImpl();

    public static PrivilegeDaoImpl getPrivilegeDao() {
        return INSTANCE;
    }
}