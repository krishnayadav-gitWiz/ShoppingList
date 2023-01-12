package seller.shopping;

import java.io.IOException;
import java.util.Scanner;

	//main Java class file for onlineshoppingList
public class SellerMainFile {
		// main method of shopping list class
		public static void SellerMain() throws IOException {
			Scanner sc=new Scanner(System.in);
			System.out.println("***************************Add some PRODUCT to sell here******************************\n");
			//Enter your details(Name & Mobile No)
			System.out.println("**********Please Provide some details*************\n");

			System.out.print("Enter Your E-mail ID (abcd@xyz.pqr) : ");
			//calling method for email validation
			//boolean vemail=EmailValidation.emailValidation();
			boolean vemail=EmailValidationSeller.checkForEmail();

			System.out.print("Enter Your Password (Abcd@1234) : ");
			//calling method for password validation
			//boolean vpassword=PasswordValidation.passwordValidation();
			boolean vpassword=PasswordValidationSeller.checkForPassword();

			System.out.println("\n");
			if(vemail && vpassword){
				CategorySellerList.category();
			}
			else{
				System.out.println("Your Email ID or Password Format is wrong (Please try to login again with right format).");
				System.exit(0);
			}
		}
	}

