package com.student.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JAP_Student")
public class StudentEntity {

	@Id
	@Column
	private String studentId;
	@Column(nullable = false, length = 20)
	private String studentName;
	@Column(nullable = false)
	private String corse;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCorse() {
		return corse;
	}

	public void setCorse(String corse) {
		this.corse = corse;
	}

}
