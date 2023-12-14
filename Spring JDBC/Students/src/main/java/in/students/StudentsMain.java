package in.students;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentsMain {
	public static void main(String[] args) throws SQLException {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("in.*");
		applicationContext.refresh();

		DataBaseOperetion operetion = applicationContext.getBean(DataBaseOperetion.class);
		StudentEntity entity = new StudentEntity();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\tTo insert Data press 1." + "\n\tTo delete Data press 2." + "\n\t"
					+ "To Update Data press 3." + "\n\tTo retrive Data press 4." + "\n\tTo Exit press 5.");
			System.out.print("Enter the requird option no ::");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("Enter Student Id: ");
				entity.setStudentId(sc.next());
				System.out.print("Enter Student Name: ");
				entity.setStudentName(sc.next());
				System.out.print("Enter Student corse: ");
				entity.setCorse(sc.next());
				int student = operetion.setStudents(entity);
				if (student > 0) {
					System.out.println("data inserted...!");
				} else {
					System.out.println("SomeThing Went Wrong....!");
				}
				break;
			case 3:
				System.out.print("Enter Student id: ");
				entity.setStudentId(sc.next());
				System.out.println("Enter Student Corse to Change: ");
				entity.setCorse(sc.next());
				int updateStudent = operetion.updateStudent(entity);
				if (updateStudent > 0) {
					System.out.println("data updated...!");
				} else {
					System.out.println("SomeThing Went Wrong....!");
				}
				break;
			case 2:
				System.out.println("Enter Student Id for Delete Student Data: ");
				entity.setStudentId(sc.next());
				int deleteStudent = operetion.deleteStudent(entity);
				if (deleteStudent > 0) {
					System.out.println("data deleted...!");
				} else {
					System.out.println("SomeThing Went Wrong....!");
				}
				break;
			case 4:
				List<StudentEntity> studentLidt = operetion.retriveStudent();
				for (StudentEntity list : studentLidt) {
					System.out.println(list);
				}
				break;
			case 5:
				System.out.println("Program was ended");
				System.exit(1);
				break;

			default:
				System.out.println("Check your number........");
				break;
			}
		}

	}

}
