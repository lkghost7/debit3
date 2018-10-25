package by.itacademy.dao;


import by.itacademy.connection.ConnectionPool;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.io.Serializable;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserDao {
    private static final UserDao INSTANCE = new UserDao();

    public static UserDao getInstance() {
        return INSTANCE;
    }

    public Long saveUser(SystemUserDao systemUser) {
        Session currentSession = ConnectionPool.getInstance().getConnection();
        currentSession.beginTransaction();
        Serializable id = currentSession.save(systemUser);
        currentSession.getTransaction().commit();
        currentSession.close();
        return (Long) id;
    }

//    public List<Userka> findAll() {
//        Session currentSession = ConnectionPool.getInstance().getConnection();
//        List<Userka> usekas = currentSession.createQuery("select u from Userka u", Userka.class).list();
//        currentSession.close();
//        return usekas;
//    }

//    public void delete(Long id) {
//        Session session = ConnectionPool.getInstance().getConnection();
//        session.beginTransaction();
//        int result = session.createQuery("delete from Userka u where u.id = " + id).executeUpdate();
//        session.getTransaction().commit();
//        session.close();
//    }
}



