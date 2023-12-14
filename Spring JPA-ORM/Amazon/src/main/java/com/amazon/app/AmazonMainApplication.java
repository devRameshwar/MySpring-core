package com.amazon.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.user.entity.UserDetails;
import com.amazon.user.service.UserDetailsService;

public class AmazonMainApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		Scanner sc = new Scanner(System.in);
		UserDetailsService service = context.getBean(UserDetailsService.class);
		
//		UserDetails userDetails = new UserDetails();
//		System.out.print("Enter The Username of The User : ");
//		userDetails.setUserName(sc.next());
//		System.out.print("Enter The Password of The User : ");
//		userDetails.setPassword(sc.next());
//		System.out.print("Enter The First Name of The User : ");
//		userDetails.setFirstName(sc.next());
//		System.out.print("Enter The Last Name of The User : ");
//		userDetails.setLastName(sc.next());
//		System.out.print("Enter The Gmail Id of The User : ");
//		userDetails.setGmailId(sc.next());
//		System.out.print("Enter The Contact Number of The User : ");
//		userDetails.setContactNumber(Long.parseLong(sc.next()));
//		System.out.print("Enter The Gender of The User : ");
//		userDetails.setGender(sc.next());
//		System.out.print("Enter The Address of The User : ");
//		userDetails.setAddress(sc.next());
//		
//		UserDetails userRegister = service.userRegister(userDetails);
//		if(userRegister != null) {
//			System.out.println("User Register Sucessfully Done !!!!!!!!!!!!!!!");
//			System.out.println("Username : "+userDetails.getUserName());
//			System.out.println("Password : "+userRegister.getPassword());
//		}else {
//			System.out.println("Somthing Went Worng !!!!!!!!!!!!!!!!!!!!!!!");
//		}
//	 
		
		
		
//		System.out.print("How Many Recard You Want to register : ");
//		int size = sc.nextInt();
//		ArrayList<UserDetails> list = new ArrayList<UserDetails>();
//		for(int i=1;i<=size;i++) {
//			System.out.println("Enter "+i+"User Details");
//			System.out.println("-------------------------------------------");
//			UserDetails userDetails = new UserDetails();
//			System.out.print("Enter The Username of The User : ");
//			userDetails.setUserName(sc.next());
//			System.out.print("Enter The Password of The User : ");
//			userDetails.setPassword(sc.next());
//			System.out.print("Enter The First Name of The User : ");
//			userDetails.setFirstName(sc.next());
//			System.out.print("Enter The Last Name of The User : ");
//			userDetails.setLastName(sc.next());
//			System.out.print("Enter The Gmail Id of The User : ");
//			userDetails.setGmailId(sc.next());
//			System.out.print("Enter The Contact Number of The User : ");
//			userDetails.setContactNumber(Long.parseLong(sc.next()));
//			System.out.print("Enter The Gender of The User : ");
//			userDetails.setGender(sc.next());
//			System.out.print("Enter The Address of The User : ");
//			userDetails.setAddress(sc.next());
//			
//			list.add(userDetails);
//		}
//		List<UserDetails> setAllUserRegister = service.setAllUserRegister(list);
//		if(setAllUserRegister != null) {
//			System.out.println(size +" Row Inserted Sucsessfully");
//		}else {
//			System.out.println("Somthing is worng");
//		}
	
		
		
//		System.out.println("Enter The Username : ");
//		String userName=sc.next();
//		System.out.println("Enter The Last Name : ");
//		String lastName=sc.next();
//		
//		service.updateUserDetails(userName, lastName);
		
//		List<UserDetails> allUserDetails = service.getAllUserDetails();
//		for(UserDetails data : allUserDetails) {
//			System.out.println(data);
//		}
		
		service.LoadUserDetails(0,2);
	}
}
