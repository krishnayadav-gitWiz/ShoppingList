package customer.shopping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import product.operations.shopping.Product10SportOperations;
import product.operations.shopping.Product1TvOperations;
import product.operations.shopping.Product2MobileOperations;
import product.operations.shopping.Product3KindleOperations;
import product.operations.shopping.Product4HealthOperations;
import product.operations.shopping.Product5ElectronicOperations;
import product.operations.shopping.Product6FashionOperations;
import product.operations.shopping.Product7EchoOperations;
import product.operations.shopping.Product8FurnitureOperations;
import product.operations.shopping.Product9GroceryOperations;
import product.pojo.shopping.Product10SportPojo;
import product.pojo.shopping.Product1TvPojo;
import product.pojo.shopping.Product2MobilePojo;
import product.pojo.shopping.Product3KindlePojo;
import product.pojo.shopping.Product4HealthPojo;
import product.pojo.shopping.Product5ElectronicPojo;
import product.pojo.shopping.Product6FashionPojo;
import product.pojo.shopping.Product7EchoPojo;
import product.pojo.shopping.Product8FurniturePojo;
import product.pojo.shopping.Product9GroceryPojo;


//Product List class for selecting many product from your selected category
public class ProductSellerList {
	//TV and Appliances CATEGORY method
	public static void tvAppliances() {
		Scanner sc =new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from TV & Appliances (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////
//		String [] tvAndApp= {"1: Sumsung washing machine ₹ 5,699/-","2: LG AC ₹ 8,989/-","3: Redmi(50)4k ₹ 37,999/-",
//				"4: Dishwashers ₹ 42,749/-","5: Panasonic Microwave Oven ₹ 4,749/-","0: Exit\n"};
//		for (int i = 0; i < tvAndApp.length; i++) {
//			System.out.println(tvAndApp[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> tvAndApp=new ArrayList<String>();
//		tvAndApp.add("1: Sumsung washing machine ₹ 5,699/-");
//		tvAndApp.add("2: LG AC ₹ 8,989/-");
//		tvAndApp.add("3: Redmi(50)4k ₹ 37,999/-");
//		tvAndApp.add("4: Dishwashers ₹ 42,749/-");
//		tvAndApp.add("5: Panasonic Microwave Oven ₹ 4,749/-");
//		tvAndApp.add("0: Exit\n");
//		
//        tvAndApp.forEach(product->System.out.println(product));

////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product1TvOperations pro = new Product1TvOperations();
//		pro.addProductTv();
		List list= pro.getProductTv();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		Product1TvPojo product = (Product1TvPojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}
		//method for claculating total bill for Tv & Appliances bill category
		int p = 0,q = 0;
		CalculateBill.calculateBillForTv(p, q);

	}

	//Mobile and Accessories CATEGORY method
	public static void mobileAccessories() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Mobiles & Accessories (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////
//		String [] mobileAndAcc= {"1: Sumsung galaxy M12 ₹ 11,699/-","2: Redmi 9 ₹ 9,989/-","3: Realme narzo ₹ 8,999/-","4: Oneplus ₹42,749/-",
//				"5: Powerbank ₹1,749/-","0: Exit\n"};
//		for (int i = 0; i < mobileAndAcc.length; i++) {
//			System.out.println(mobileAndAcc[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> mobileAndAcc=new ArrayList<String>();
//		mobileAndAcc.add("1: Sumsung galaxy M12 ₹ 11,699/-");
//		mobileAndAcc.add("2: Redmi 9 ₹ 9,989/-");
//		mobileAndAcc.add("3: Realme narzo ₹ 8,999/-");
//		mobileAndAcc.add("4: Oneplus ₹42,749/-");
//		mobileAndAcc.add("5: Powerbank ₹1,749/-");
//		mobileAndAcc.add("0: Exit\n");
//
//		mobileAndAcc.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product2MobileOperations pro = new Product2MobileOperations();
//		pro.addProductMobile();
		List list= pro.getProductMobile();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product2MobilePojo product = (Product2MobilePojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}
		//method for claculating total bill for Mobile and Accessories bill category
		int p = 0,q = 0;
		CalculateBill.calculateBillForMobile(p,q);
	}

	//Kindle and E-reader CATEGORY method
	public static void kindleEreader() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Kindle E-reader (CATEGORY) given below");
////////////////////////////////////////////////1rd-method/////////////////////////////////////////////////

//		String [] kindleE= {"1: Kindle(10th Gen) ₹ 7,999/-","2: All-new Kindle Paperwhite(8GB) ₹ 13,989/-",
//				"3: All-new Kindle Oasis ₹ 24,999/-","0: Exit\n"};
//		for (int i = 0; i < kindleE.length; i++) {
//			System.out.println(kindleE[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> kindleE=new ArrayList<String>();
//		kindleE.add("1: Kindle(10th Gen) ₹ 7,999/-");
//		kindleE.add("2: All-new Kindle Paperwhite(8GB) ₹ 13,989/-");
//		kindleE.add("3: All-new Kindle Oasis ₹ 24,999/-");
//		kindleE.add("0: Exit\n");
//		
//		kindleE.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product3KindleOperations pro = new Product3KindleOperations();
//		pro.addProductKindle();
		List list= pro.getProductKindle();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product3KindlePojo product = (Product3KindlePojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}

		//method for claculating total bill for Kindle E-reader bill category
		int p=0,q=0;
		CalculateBill.calculateBillForKindle(p, q);

	}

	//Health and Wellness CATEGORY method
	public static void healthWellness() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them		
		System.out.println("Please select product from Health Wellness (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] healthW= {"1: BP Monitor ₹ 1,699/-","2: Electric Toothbrush ₹ 489/-","3: Foot and Leg Massager ₹ 10,999/-",
//				"4: MI Trimmer ₹1,749/-","5: Dr Ortho ₹749/-","0: Exit\n"};
//		for (int i = 0; i < healthW.length; i++) {
//			System.out.println(healthW[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> healthW=new ArrayList<String>();
//		healthW.add("1: BP Monitor ₹ 1,699/-");
//		healthW.add("2: Electric Toothbrush ₹ 489/-");
//		healthW.add("3: Foot and Leg Massager ₹ 10,999/-");
//		healthW.add("4: MI Trimmer ₹1,749/-");
//		healthW.add("5: Dr Ortho ₹749/-");
//		healthW.add("0: Exit\n");
//		
//		healthW.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
				Product4HealthOperations pro = new Product4HealthOperations();
             	//pro.addProductHealth();
				List list= pro.getProductHealth();
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Product4HealthPojo product = (Product4HealthPojo) iterator.next();
				System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
				}
		//method for claculating total bill for Health Wellness bill category
		int p=0,q=0;
		CalculateBill.calculateBillForHealth(p, q);

	}

	//Electronics and Accessories CATEGORY method
	public static void electronicsAccessories() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Electronics & Accessories (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] eleAcc= {"1: Macbook Pro M1 ₹ 11,2699/-","2: Digitek Tripod ₹ 5,989/-","3: Sumsang galaxy Watch4 narzo ₹ 23,999/-",
//				"4: Oneplus Band ₹1,449/-","5: EKSA E900 pro headphone ₹3,749/-","0: Exit\n"};
//		for (int i = 0; i < eleAcc.length; i++) {
//			System.out.println(eleAcc[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> eleAcc=new ArrayList<String>();
//		eleAcc.add("1: Macbook Pro M1 ₹ 11,2699/-");
//		eleAcc.add("2: Digitek Tripod ₹ 5,989/-");
//		eleAcc.add("3: Sumsang galaxy Watch4 narzo ₹ 23,999/-");
//		eleAcc.add("4: Oneplus Band ₹1,449/-");
//		eleAcc.add("5: EKSA E900 pro headphone ₹3,749/-");
//		eleAcc.add("0: Exit\n");
//		
//		eleAcc.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product5ElectronicOperations pro = new Product5ElectronicOperations();
     	//pro.addProductElectronic();
		List list= pro.getProductElectronic();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product5ElectronicPojo product = (Product5ElectronicPojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}
		//method for claculating total bill for Electronics and Accessories category
		int p=0,q=0;
		CalculateBill.calculateBillForElectronics(p, q);

	}

	//Fashion (Men/Women/Kids) CATEGORY method
	public static void fashion() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Fashion (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] fas= {"1: Allen Solly T-shirt ₹ 699/-","2: American Tourister luggage ₹ 3,989/-","3: Puma Men's cap ₹ 599/-",
//				"4: LIFE Men's jeans ₹849/-","5: Kids coat,pant ₹749/-","6: Wollen V-nec cardigan ₹989/-",
//				"7: Women's kurta with Pant and Duppatta ₹1749/-","0: Exit\n"};
//		for (int i = 0; i < fas.length; i++) {
//			System.out.println(fas[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> fas=new ArrayList<String>();
//		fas.add("1: Allen Solly T-shirt ₹ 699/-");
//		fas.add("2: American Tourister luggage ₹ 3,989/-");
//		fas.add("3: Puma Men's cap ₹ 599/-");
//		fas.add("4: LIFE Men's jeans ₹849/-");
//		fas.add("5: Kids coat,pant ₹749/-");
//		fas.add("6: Wollen V-nec cardigan ₹989/-");
//		fas.add("7: Women's kurta with Pant and Duppatta ₹1749/-");
//		fas.add("0: Exit\n");
//		
//		fas.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
				Product6FashionOperations pro = new Product6FashionOperations();
		     	//pro.addProductFashion();
				List list= pro.getProductFashion();
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Product6FashionPojo product = (Product6FashionPojo) iterator.next();
				System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
				}
		//method for claculating total bill for Fashion bill category
		int p=0,q=0;
		CalculateBill.calculateBillForFashion(p, q);

	}

	//Echo & FireTV CATEGORY method
	public static void echoFireTv() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Echo FireTV (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] echo= {"1: Amazon alexa(4th Gen) ₹ 4,699/-","2: Fir TV Stick ₹ 2,989/-","3: Eco show 8 ₹ 8,999/-",
//				"4: Wipro smart with Echo Flex LED  ₹3,099/-","0: Exit\n"};
//		for (int i = 0; i < echo.length; i++) {
//			System.out.println(echo[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> echo=new ArrayList<String>();
//		echo.add("1: Amazon alexa(4th Gen) ₹ 4,699/-");
//		echo.add("2: Fir TV Stick ₹ 2,989/-");
//		echo.add("3: Eco show 8 ₹ 8,999/-");
//		echo.add("4: Wipro smart with Echo Flex LED  ₹3,099/-");
//		echo.add("0: Exit\n");
//		
//		echo.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product7EchoOperations pro = new Product7EchoOperations();
     	//pro.addProductEcho();
		List list= pro.getProductEcho();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product7EchoPojo product = (Product7EchoPojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}
		//method for claculating total bill for Echo Fire TV bill category
		int p=0,q=0;
		CalculateBill.calculateBillForEcho(p, q);

	}

	//furniture CATEGORY method
	public static void furniture() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Furniture (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] fur= {"1: Sofas & recliners ₹ 15,699/-","2: Bed kingsize ₹ 9,989/-","3: Dining Sets ₹ 17,999/-",
//				"4: Laptop table ₹ 749/-","5: High back Chair ₹ 9,749/-","6: Foldable Hammock ₹ 649/-","7: Swing Chair ₹949/-","0: Exit\n"};
//		for (int i = 0; i < fur.length; i++) {
//			System.out.println(fur[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> fun=new ArrayList<String>();
//		fun.add("1: Sofas & recliners ₹ 15,699/-");
//		fun.add("2: Bed kingsize ₹ 9,989/-");
//		fun.add("3: Dining Sets ₹ 17,999/-");
//		fun.add("4: Laptop table ₹ 749/-");
//		fun.add("5: High back Chair ₹ 9,749/-");
//		fun.add("6: Foldable Hammock ₹ 649/-");
//		fun.add("7: Swing Chair ₹949/-");
//		fun.add("0: Exit\n");
//		
//		fun.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
				Product8FurnitureOperations pro = new Product8FurnitureOperations();
		     	//pro.addProduct();
				List list= pro.getProductFurniture();
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Product8FurniturePojo product = (Product8FurniturePojo) iterator.next();
				System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
				}
		//method for claculating total bill for Furniture bill category
		int p=0,q=0;
		CalculateBill.calculateBillForFurniture(p, q);

	}

	//Grocery and Household CATEGORY method
	public static void groceryHousehold() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Grocery & Household (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////

//		String [] grocery= {"1: Kissan Crunchy Peanut ₹ 399/-","2: Maggi Pazzta ₹ 224/-","3: B Natural Mixed fruit Juive ₹ 185/-",
//				"4: Bikano Namkeen ₹149/-","5: Powder Detergent ₹625/-","0: Exit\n"};
//		for (int i = 0; i < grocery.length; i++) {
//			System.out.println(grocery[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> grocery=new ArrayList<String>();
//		grocery.add("1: Kissan Crunchy Peanut ₹ 399/-");
//		grocery.add("2: Maggi Pazzta ₹ 224/-");
//		grocery.add("3: B Natural Mixed fruit Juive ₹ 185/-");
//		grocery.add("4: Bikano Namkeen ₹149/-");
//		grocery.add("5: Powder Detergent ₹625/-");
//		grocery.add("0: Exit\n");
//
//		grocery.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
//for displaying each product by encpsulated form
Product9GroceryOperations pro= new Product9GroceryOperations();
//pro.addProductFurniture();
List list= pro.getProductGrocery();
for (Iterator iterator = list.iterator(); iterator.hasNext();) {
	Product9GroceryPojo product = (Product9GroceryPojo) iterator.next();
System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
}
		//method for claculating total bill for Grocery & Household bill category
		int p=0,q=0;
		CalculateBill.calculateBillForGrocery(p, q);

	}

	//Sports and Fitness CATEGORY method
	public static void sportsFitness() {
		Scanner sc=new Scanner(System.in);
		//You can buy anything from bellow just choose one of them
		System.out.println("Please select product from Sports & Fitness (CATEGORY) given below");
////////////////////////////////////////////////1st-method/////////////////////////////////////////////////
//		String [] sport= {"1: Yoga Mat ₹ 999/-","2: Pull Up Band ₹ 1,089/-","3: Training Gloves ₹ 399/-",
//				"4: Solimo Hoola Loop ₹249/-","5: Home GYM Set ₹3,749/-","0: Exit\n"};
//		for (int i = 0; i < sport.length; i++) {
//			System.out.println(sport[i]);
//		}
////////////////////////////////////////////////2nd-method/////////////////////////////////////////////////

//		ArrayList<String> sport=new ArrayList<String>();
//		sport.add("1: Yoga Mat ₹ 999/-");
//		sport.add("2: Pull Up Band ₹ 1,089/-");
//		sport.add("3: Training Gloves ₹ 399/-");
//		sport.add("4: Solimo Hoola Loop ₹249/-");
//		sport.add("5: Home GYM Set ₹3,749/-");
//		sport.add("0: Exit\n");
//		
//		sport.forEach(product->System.out.println(product));
////////////////////////////////////////////////3rd-method/////////////////////////////////////////////////
		//for displaying each product by encpsulated form
		Product10SportOperations pro = new Product10SportOperations();
		//pro.addProductSport();
		List list= pro.getProductSport();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
		Product10SportPojo product = (Product10SportPojo) iterator.next();
		System.out.println(product.getProduct_id()+": "+product.getProduct_name()+" "+product.getProduct_price());
		}
		//method for claculating total bill for Sports & Fitness bill category
		int p=0,q=0;
		CalculateBill.calculateBillForSports(p, q);

	}
}
