package com.swiggy.app;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.swiggy.entity.UserDetails;
import com.swiggy.service.UserDetailsService;

public class SwiggyMainApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();

		Scanner sc = new Scanner(System.in);

		UserDetailsService service = context.getBean(UserDetailsService.class);

		while (true) {
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(String.format("%107s",
					"********************************** Swiggy **********************************"));
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------");

			System.out.println(String.format("%80s", "[1] : User Operation") + "\n"
					+ String.format("%81s", "[2] : Admin Operation") + "\n"
					+ String.format("%83s", "[3] : Developer Details") + "\n" + String.format("%70s", "[4] : Exit"));

			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------");

			System.out.print("Plz Enter The Option To Perform The Operation : ");
			int option = Integer.parseInt(sc.next());
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------------------");
			switch (option) {
			case 1:
				while (true) {
					System.out.println(String.format("%107s",
							"***************************** User Operation *****************************"));
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------");
					System.out.println(String.format("%80s", "[A] : User Register") + "\n"
							+ String.format("%77s", "[B] : User Login") + "\n" + String.format("%71s", "[C] : Exit"));
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------");
					System.out.print("Enter The Option To Perform The Operation : ");
					char userOption = sc.next().charAt(0);
					System.out.println(
							"-----------------------------------------------------------------------------------------------------------------------------------");
					switch (Character.toUpperCase(userOption)) {
					case 'A':
						UserDetails userDetails = new UserDetails();
						System.out.print("Enter The Username of The User : ");
						userDetails.setUserName(sc.next());
						System.out.print("Enter The Password of The User : ");
						userDetails.setPassword(sc.next());
						System.out.print("Enter The First Name of The User : ");
						userDetails.setFirstName(sc.next());
						System.out.print("Enter The Last Name of The User : ");
						userDetails.setLastName(sc.next());
						System.out.print("Enter The GmailId of The User : ");
						userDetails.setGmailId(sc.next());
						System.out.print("Enter The Contact Number of The User : ");
						userDetails.setContactNumber(Long.parseLong(sc.next()));
						System.out.print("Enter The Gender of The User : ");
						userDetails.setGender(sc.next());
						System.out.print("Enter The Address of The User : ");
						userDetails.setAddress(sc.next());

						UserDetails userRegister = service.userRegister(userDetails);
						if (userRegister != null) {
							System.out.println("User Register Done Sucessfull ....................");
						} else {
							System.out.println("Somthing is Worng ...............................");
						}

						break;

					case 'B':
						break;

					default:
						System.out.println("Pls Select Valid Option......");
						break;
					}

				}
			case 2:

				break;

			case 3:

				break;

			case 4:

				System.out.println("Exit Sucessfully .....................................");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------");
				System.exit(0);
				break;

			default:
				System.out.println("Plz Enter Valid Option to Perform Operation");
				break;
			}
		}
	}
}
