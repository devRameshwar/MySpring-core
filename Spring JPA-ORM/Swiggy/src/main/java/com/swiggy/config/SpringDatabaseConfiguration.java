package com.swiggy.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import oracle.net.aso.f;

@Configuration
@EnableJpaRepositories("com.*")
public class SpringDatabaseConfiguration {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("c##coder");
		dataSource.setPassword("coder");

		return dataSource;
	}

	public Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");

		return properties;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getFactoryBean() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		// Setting The DataSource Object
		factory.setDataSource(getDataSource());

		// Setting The Package Details
		factory.setPackagesToScan("com.*");

		// Setting the Hibernate Properties
		factory.setJpaProperties(getProperties());

		// Setting The Hibernate JPA Veder Adapter Object

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(vendorAdapter);

		return factory;

	}

	@Bean("transactionManager")
	public PlatformTransactionManager getTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(getFactoryBean().getObject());
		
		return transactionManager;
	}
}
