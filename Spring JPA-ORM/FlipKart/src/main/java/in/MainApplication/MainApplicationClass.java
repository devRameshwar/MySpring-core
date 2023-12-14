package in.MainApplication;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.FlipkartEntity.Flipkart;
import in.FlipkartService.FlipkartService;

public class MainApplicationClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("in.*");
		context.refresh();

		// logic to save data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id:");
		int productId = sc.nextInt();
		System.out.println("Enter product Name:");
		String ProductName = sc.next();
		System.out.println("Enter Product QTY:");
		int qty = sc.nextInt();
		System.out.println("Enter Product Price: ");
		double price = sc.nextDouble();
		FlipkartService service = context.getBean(FlipkartService.class);
		Flipkart saveData = service.saveData(new Flipkart(productId, ProductName, qty, price));
		if (saveData != null) {
			System.out.println("Data inserted Sucessfully....!");
		} else {
			System.out.println("Some thing went wrong....!");
		}
	}
}
