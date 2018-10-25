package by.itacademy.dao;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.model.SystemUser;
import org.hibernate.Session;

import java.io.Serializable;

public class SystemUserDao {
    private static final SystemUserDao INSTANCE = new SystemUserDao();

    public static SystemUserDao getInstance() {
        return INSTANCE;
    }

    public Long save(SystemUser systemUser) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(systemUser);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }

    //        public void delete(Long id) {
//        Session session = ConnectionPool.getInstance().getConnection();
//        session.beginTransaction();
//        int result = session.createQuery("delete from system_user u where u.id = " + id).executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//    }
    public void delete(SystemUser systemUser) {
        Session session = ConnectionPool.getInstance().getConnection();
        session.beginTransaction();
        session.delete(systemUser);
        session.getTransaction().commit();
        session.close();
    }

    public SystemUser findOne(Long id) {
        Session session = ConnectionPool.getInstance().getConnection();
        session.beginTransaction();
        SystemUser systemUser = new SystemUser();
        systemUser.setId(id);
        SystemUser mySystemUser = session.get(SystemUser.class, id);
        session.close();
        return mySystemUser;
    }

}
