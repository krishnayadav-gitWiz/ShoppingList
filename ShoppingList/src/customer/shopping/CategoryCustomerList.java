package customer.shopping;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import com.shopping.ProductList;

import category.operations.shopping.CategoryOperations;
import category.pojo.shopping.CategoryPojo;

//Category List class
public class CategoryCustomerList {
//	private static Object cat;

	//method for selecting category where you want to do shopping
	public static void category() {
		Scanner sc=new Scanner(System.in);
		int option1;
		char ch=0;
		//do while loop to check do shopping multiple times
		do{
			System.out.println("*****You can Buy product from any category just select any one and then continue your shopping*****\n\n");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////
			//You can Buy product from any category just select any one and then for continue press Y/y or any other Key
//			String [] categories= {"1. TV & Appliances","2. Mobiles & Accessories","3. Kindle E-reader","4. Health & Wellness","5. Electronics & Accessories",
//					"6. Fashion","7. Echo & Fire TV","8. Furniture","9. Grocery & Household","10. Sports & Fitness","0. Exit\n"};
//			for (int i = 0; i < categories.length; i++) {
//				System.out.println(categories[i]);
//			}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////
			//You can Buy product from any category just select any one and then for continue press Y/y or any other Key
//			ArrayList<String> categories=new ArrayList<String>();
//			categories.add("1. TV & Appliances");
//			categories.add("2. Mobiles & Accessories");
//			categories.add("3. Kindle E-reader");
//			categories.add("4. Health & Wellness");
//			categories.add("5. Electronics & Accessories");
//			categories.add("6. Fashion");
//			categories.add("7. Echo & Fire TV");
//			categories.add("8. Furniture");
//			categories.add("9. Grocery & Household");
//			categories.add("10. Sports & Fitness");
//			categories.add("0. Exit\n");
//			Iterator<String> itr = categories.iterator();
//	        while (itr.hasNext()) {
//	 	            System.out.println(itr.next());
//	        }
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
			//You can Buy product from any category just select any one and then for continue press Y/y or any other Key
			CategoryOperations cat = new CategoryOperations();
//			cat.addCustomer();
			List list= cat.getCategories();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			CategoryPojo category = (CategoryPojo) iterator.next();
			System.out.println(category.getCategory_id()+": "+category.getCategory_name());
		}
			
			System.out.println("Please select category from above list where you want to do shopping(0-10): \n");
			option1=sc.nextInt();
			switch(option1){  
			//Case statements for each category (0-10)
			case 1: {
				ProductSellerList.tvAppliances();
			}
			break; 
			case 2:{
				ProductSellerList.mobileAccessories();
			}
			break;
			case 3:{
				ProductSellerList.kindleEreader();
			}
			break;
			case 4:{
				ProductSellerList.healthWellness();
			}
			break;
			case 5:{
				ProductSellerList.electronicsAccessories();
			}
			break;
			case 6:{
				ProductSellerList.fashion();
			}
			break;
			case 7:{
				ProductSellerList.echoFireTv();
			}
			break;
			case 8:{
				ProductSellerList.furniture();
			}
			break;
			case 9:{
				ProductSellerList.groceryHousehold();
			}
			break;
			case 10:{
				ProductSellerList.sportsFitness();
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

			//System.out.println("Do you want to Buy other product.....then press y or Y / otherwise press any key");
			System.err.println("Do you want to Buy other product.....then press y or Y / otherwise press any key\n");

			ch=sc.next().charAt(0);
			if(ch!='y' || ch!='Y'){
				System.out.println("Thank you!! Have a nice day:)");
			}
		}while(ch=='y' || ch=='Y');
	}
}
