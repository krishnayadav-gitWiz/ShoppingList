package online.shopping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import customer.shopping.CustomerMainFile;
import seller.shopping.SellerMainFile;

public class OlnlineShoppingCustomerSeller {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("******Be a CUSTOMER or SELLER Please select any one to continue!!******");

		int option1;
		char ch=0;
		//do while loop to check do shopping multiple times
		do{
			System.out.println("*****You can Be Customer or Seller*****\n\n");

			//You can Buy product from any category just select any one and then for continue press Y/y or any other Key
			ArrayList<String> categories=new ArrayList<String>();
			categories.add("1. Customer");
			categories.add("2. Seller");
			categories.add("0. Exit\\n");
			Iterator<String> itr = categories.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Please select Any one to become Customer or Seller(0-2): \n");
			option1=sc.nextInt();			
			switch(option1){  
			//Case statements for each category (0-2)
			case 1: {
			CustomerMainFile.customerMain();
			}
			break; 
			case 2:{
			SellerMainFile.SellerMain();
			}
			break;
			case 0:{
				System.out.println("EXIT");
				System.exit(0);
				break;
			}
			default:
				//System.out.println("Please select valid choice\n"); 
				System.err.println("Please select valid choice\n"); 
				break;
			}
				System.err.println("Do you want continue.....then press y or Y / otherwise press any key\n");

				ch=sc.next().charAt(0);
				if(ch!='y' || ch!='Y'){
					System.out.println("Thank you!!");
				}
		}while(ch=='y' || ch=='Y');
	}
}
