package by.itacademy.repository;

import by.itacademy.configuration.ApplicationConfiguration;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@EnableTransactionManagement
@PropertySource("classpath:databaseTest.properties")
public abstract class CommonTest {

}
