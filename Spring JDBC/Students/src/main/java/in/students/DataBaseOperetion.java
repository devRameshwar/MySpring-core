package in.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DataBaseOperetion {

	@Autowired
	JdbcTemplate jdbcTemp;

	public int setStudents(StudentEntity entity) {
		String query = "INSERT INTO Students VALUES" + "('" + entity.getStudentId() + "','" + entity.getStudentName()
				+ "','" + entity.getCorse() + "')";
		int insert = jdbcTemp.update(query);
		return insert;
	}

	public int updateStudent(StudentEntity entity) {
		String query = "UPDATE Students" + " SET corse=" + " '" + entity.getCorse() + "'" + " WHERE StudentID=" + "'"
				+ entity.getStudentId() + "'";
		System.out.println(query);
		int update = jdbcTemp.update(query);
		return update;
	}

	public int deleteStudent(StudentEntity entity) {
		String query = "DELETE FROM students" + " WHERE StudentID = " + "'" + entity.getStudentId() + "'";
		int delete = jdbcTemp.update(query);
		return delete;
	}

	public List<StudentEntity> retriveStudent() {
		String query = "Select * from Students";
		List<StudentEntity> studentlist = jdbcTemp.query(query, new StudentsRowMapper());
		return studentlist;
	}

}
