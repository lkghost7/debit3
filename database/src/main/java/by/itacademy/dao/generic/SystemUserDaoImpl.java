package by.itacademy.dao.generic;

import by.itacademy.model.SystemUser;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SystemUserDaoImpl extends BaseDaoImpl<SystemUser> implements SystemUserDao {
}