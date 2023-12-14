package in.DataBaseConfigretion;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableJpaRepositories("in.*")
public class DataBaseConfigretion {

	@Bean
	public DriverManagerDataSource setDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		driverManagerDataSource.setUsername("c##coder");
		driverManagerDataSource.setPassword("coder");
		return driverManagerDataSource;
	}

	public Properties setHibernateProperty() {
		Properties properties = new Properties();
		properties.getProperty("hibernate.hbm2ddl.auto", "create");
		properties.getProperty("hibernate.show_sql", "true");
		return properties;
	}

	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManager() {
		LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		// Setting the DataSource Property in LocalContainerEntityManagerFactoryBean
		// class
		managerFactoryBean.setDataSource(setDataSource());

		// setting Hibernate Property in LocalContainerEntityManagerFactoryBean class
		managerFactoryBean.setJpaProperties(setHibernateProperty());

		// setting the package details to Scane
		managerFactoryBean.setPackagesToScan("in.*");

		// Setting the HibernateJapVendorAdapter Details
		HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		managerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);

		return managerFactoryBean;

	}

	@Bean("transectionManager")
	public JpaTransactionManager transectionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManager().getObject());
		return transactionManager;
	}

}
