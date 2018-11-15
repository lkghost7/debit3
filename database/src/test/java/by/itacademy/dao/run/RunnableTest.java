package by.itacademy.dao.run;

import by.itacademy.dao.*;
import by.itacademy.dao.generic.DebitorDaoImplTest;
import by.itacademy.dao.generic.PrivilegeDaoImplTest;
import by.itacademy.dao.generic.SystemUserDaoImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CompanDaoImplTest.class,
        SystemUserDaoImplTest.class,
        PrivilegeDaoImplTest.class,
        DebitorDaoImplTest.class,
        CompanDaoImplTest.class
})
public class RunnableTest {
}