package com.student.configretion;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("com.*")
public class DatabaseConfigretion {

	@Bean
	public DriverManagerDataSource setDatabaseConfigretion() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		dataSource.setUsername("c##coder");
		dataSource.setPassword("coder");
		return dataSource;
	}

	 
	public Properties setHibernetProperty() {
		Properties properties = new Properties();
		properties.getProperty("hibernate.hbm2ddl.auto","create");
		properties.getProperty("hibernate.show_sql","true");
		return properties;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getBeanFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		// First : Setting the DataSource Object
		factoryBean.setDataSource(setDatabaseConfigretion());

		// Second : Setting the Hibernate Properties
		factoryBean.setJpaProperties(setHibernetProperty());

		// Third : Setting package Details to scan
		factoryBean.setPackagesToScan("com.*");

		// Fourth : Setting the Hibernate Jpa Vendor Details
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(vendorAdapter);
		return factoryBean;
	}

	@Bean("transactionManager")
	public PlatformTransactionManager getTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(getBeanFactory().getObject());

		return transactionManager;

	}
}
