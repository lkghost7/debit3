package by.itacademy.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("by.itacademy")
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
//@Import({DatabaseConfiguration.class})  если раскоментить - создать классс
public class ApplicationConfiguration {

    @Value("${hibernate.dialect}")
    private String dialect;

    @Value("${hibernate.show_sql}")
    private String showSql;

    @Value("${hibernate.format_sql}")
    private String formatSql;

    @Value("${hibernate.creation_policy}")
    private String creationPolicy;

    @Bean
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public DataSource dataSource(@Value("${db.url}") String url,
                                 @Value("${db.username}") String username,
                                 @Value("${db.password}") String password,
                                 @Value("${db.driverName}") String driverName) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverName);
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource,
                                                  Properties hibernateProperties) {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setPackagesToScan("by.itacademy");
        factoryBean.setHibernateProperties(hibernateProperties);
        return factoryBean;
    }

//    @Bean
//    public Properties hibernateProperties(
//            @Value("classpath:database.properties") Resource databaseResource) throws IOException {
//        Properties properties = new Properties();
//        properties.load(databaseResource.getInputStream());
//        return properties;
//    }

    @Bean
    public Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", dialect);
        properties.setProperty("hibernate.show_sql", showSql);
        properties.setProperty("hibernate.format_sql", formatSql);
        properties.setProperty("hibernate.hbm2ddl.auto", creationPolicy);
        return properties;
    }

    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
