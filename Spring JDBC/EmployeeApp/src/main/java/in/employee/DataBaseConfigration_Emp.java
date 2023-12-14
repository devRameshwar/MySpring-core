package in.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBaseConfigration_Emp {

	@Bean
	public JdbcTemplate dataSourceConnection() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		driverManagerDataSource.setUsername("c##coder");
		driverManagerDataSource.setPassword("coder");
		return new JdbcTemplate(driverManagerDataSource);
	}
}
