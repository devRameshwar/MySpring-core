package in.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperationClass implements OparetionImlimetaton {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int employeeInsert(EmployeeEntity entity) {
		String query = "insert into employee99 values" + "(" + entity.getEmpid() + ",'" + entity.getEmpName() + "','"
				+ entity.getDegination() + "'," + entity.getSallry() + ")";
		int update = jdbcTemplate.update(query);
		return update;
	}

	@Override
	public int employeeUpdate(EmployeeEntity entity) {
		String query = "";
		int update = jdbcTemplate.update(query);
		return update;
	}

}
