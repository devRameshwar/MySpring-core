package com.student.configretion;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.Entity.StudentEntity;
import com.student.service.StudentService;

public class StudentApplicationMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		Scanner sc = new Scanner(System.in);
		StudentEntity studentEntity = new StudentEntity();
		System.out.print("Enter Student id: ");
		studentEntity.setStudentId(sc.next());
		System.out.print("Enter Student Name: ");
		studentEntity.setStudentName(sc.next());
		System.out.print("Enter Student corse: ");
		studentEntity.setCorse(sc.next());
		StudentService studentService = context.getBean(StudentService.class);
		StudentEntity student = studentService.saveStudent(studentEntity);
		if (student != null) {
			System.out.println("Student save in database.....!");
		} else {
			System.out.println("something went wrong.....!");
		}
	}
}
