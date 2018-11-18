package by.itacademy.dao.generic;

import by.itacademy.model.Debitor;

public class DebitorDaoImpl extends BaseDaoImpl<Debitor> implements DebitorDao {

    private static final DebitorDaoImpl INSTANCE = new DebitorDaoImpl();

    public static DebitorDaoImpl getDebitorDao() {
        return INSTANCE;
    }
}