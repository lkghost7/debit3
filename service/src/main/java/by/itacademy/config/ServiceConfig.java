package by.itacademy.config;

import by.itacademy.configuration.ApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "by.itacademy")
@Import(value = {ApplicationConfiguration.class})
@EnableTransactionManagement
public  class ServiceConfig {

}
