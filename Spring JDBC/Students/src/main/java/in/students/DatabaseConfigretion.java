package in.students;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatabaseConfigretion {
	@Bean
	public JdbcTemplate dataBaseConnection() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		driverManagerDataSource.setUsername("C##coder");
		driverManagerDataSource.setPassword("coder");
		return new JdbcTemplate(driverManagerDataSource);
	}	
}
