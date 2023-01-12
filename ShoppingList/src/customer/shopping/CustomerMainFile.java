package customer.shopping;

import java.util.Scanner;
//import com.shopping.CategoryList;

//main Java class file for onlineshoppingList
public class CustomerMainFile {
	// main method of shopping list class
	public static void customerMain() {
		Scanner sc=new Scanner(System.in);
		System.out.println("***************************SHOP BY CATEGORY Then Select PRODUCT******************************\n");
		//Enter your details(Name & Mobile No)
		System.out.println("**********Please Provide some details*************\n");

		System.out.print("Enter Your E-mail ID (abcd@xyz.pqr) : ");
		//calling method for email validation
		//boolean vemail=EmailValidation.emailValidation();
		boolean vemail=EmailValidationCustomer.checkForEmail();

		System.out.print("Enter Your Password (Abcd@1234) : ");
		//calling method for password validation
		//boolean vpassword=PasswordValidation.passwordValidation();
		boolean vpassword=PasswordValidationCustomer.checkForPassword();

		System.out.println("\n");
		if(vemail && vpassword){
			CategoryCustomerList.category();
		}
		else{
			System.out.println("Your Email ID or Password Format is wrong (Please try to login again with right format).");
			System.exit(0);
		}
	}
}

