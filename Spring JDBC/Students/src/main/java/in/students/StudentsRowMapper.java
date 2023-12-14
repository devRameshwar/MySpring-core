package in.students;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentsRowMapper implements RowMapper<StudentEntity> {

	@Override
	public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentEntity entity = new StudentEntity();
		entity.setStudentId(rs.getString("STUDENTID"));
		entity.setStudentName(rs.getString("STUDENTNAME"));
		entity.setCorse(rs.getString("CORSE"));
		return entity;
	}

}
