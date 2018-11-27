package by.itacademy.services;


import by.itacademy.configuration.ApplicationConfiguration;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@RunWith(SpringRunner.class)
@ComponentScan(basePackages = "by.itacademy.services.")
@ContextConfiguration(classes = ApplicationConfiguration.class)
@EnableTransactionManagement
@PropertySource("classpath:databaseTest.properties")
public class CommonServiceTest {

}

