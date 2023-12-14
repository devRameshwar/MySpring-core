package in.employee;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMainClassAppllication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("in.*");
		applicationContext.refresh();
		EmployeeOperationClass bean = applicationContext.getBean(EmployeeOperationClass.class);
		Scanner sc = new Scanner(System.in);
		EmployeeEntity entity = new EmployeeEntity();
		while (true) {
			System.out.println("1.insert\n" + "2.Update\n" + "3.Delete\n" + "4.Retrive\n" + "5.Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter Employee Id: ");
				entity.setEmpid(sc.nextInt());
				System.out.println("Enter Employee Name: ");
				entity.setEmpName(sc.next());
				System.out.println("Enter Employee Degination: ");
				entity.setDegination(sc.next());
				System.out.println("Enter sallary: ");
				entity.setSallry(sc.nextDouble());
				int employeeInsert = bean.employeeInsert(entity);
				if (employeeInsert > 0) {
					System.out.println("Employee Data inserted...");
				} else {
					System.out.println("Something Went Wrong......!");
				}
				break;
			case 2:
				
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:
				System.out.println("Application close.....!");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
