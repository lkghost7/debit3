package by.itacademy.dao.run;

import by.itacademy.dao.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({

        CompanyDaoTest.class,
        CompanDaoImplTest.class,
        DebitorDaoTest.class,
        EmailDetailDaoTest.class,
        PersonDaoTest.class,
        RegistryContractsDaoTest.class,
        PrivilegeDaoImplTest.class,
        SystemUserDaoTest.class,
})
public class RunnableTest {
}