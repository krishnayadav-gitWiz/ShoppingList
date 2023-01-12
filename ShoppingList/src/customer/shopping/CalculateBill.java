package customer.shopping;

import java.util.Scanner;

//Bill calculater class
public class CalculateBill {
	//method for claculating total bill for Tv & Appliances bill category
	public static void calculateBillForTv(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*5699;
		}else if(p==2){
			q=q*8989;

		}else if(p==3){
			q=q*37999;
		}else if(p==4){
			q=q*42749;
		}else if(p==5){
			q=q*4749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Mobile and Accessories bill category
	public static void calculateBillForMobile(int p,int q) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*11699;
		}else if(p==2){
			q=q*9989;

		}else if(p==3){
			q=q*8999;
		}else if(p==4){
			q=q*42749;
		}else if(p==5){
			q=q*1749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Kindle E-reader bill category
	public static void calculateBillForKindle(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-3): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*7999;
		}else if(p==2){
			q=q*13989;

		}else if(p==3){
			q=q*24999;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Health Wellness bill category
	public static void calculateBillForHealth(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*1699;
		}else if(p==2){
			q=q*489;

		}else if(p==3){
			q=q*10999;
		}else if(p==4){
			q=q*1749;
		}else if(p==5){
			q=q*749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Electronics and Accessories category
	public static void calculateBillForElectronics(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*112699;
		}else if(p==2){
			q=q*5989;

		}else if(p==3){
			q=q*23999;
		}else if(p==4){
			q=q*1449;
		}else if(p==5){
			q=q*3749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Fashion bill category
	public static void calculateBillForFashion(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-7): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*699;
		}else if(p==2){
			q=q*3989;
		}else if(p==3){
			q=q*599;
		}else if(p==4){
			q=q*849;
		}else if(p==5){
			q=q*749;
		}else if(p==6){
			q=q*989;
		}else if(p==7){
			q=q*1749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Echo Fire TV bill category
	public static void calculateBillForEcho(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-4): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*4699;
		}else if(p==2){
			q=q*2989;

		}else if(p==3){
			q=q*8999;
		}else if(p==4){
			q=q*3099;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Furniture bill category
	public static void calculateBillForFurniture(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-7): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*15699;
		}else if(p==2){
			q=q*9989;

		}else if(p==3){
			q=q*17999;
		}else if(p==4){
			q=q*749;
		}else if(p==5){
			q=q*9749;
		}
		else if(p==6){
			q=q*649;
		}
		else if(p==7){
			q=q*949;
		}
		else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Grocery & Household bill category
	public static void calculateBillForGrocery(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*399;
		}else if(p==2){
			q=q*224;

		}else if(p==3){
			q=q*185;
		}else if(p==4){
			q=q*189;
		}else if(p==5){
			q=q*625;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}

	//method for claculating total bill for Sports & Fitness bill category
	public static void calculateBillForSports(int p,int q) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select product choice from above list(0-5): ");
		p=sc.nextInt();
		System.out.println("Select your total quantity: ");
		q=sc.nextInt();
		if(p==1) {
			q=q*999;
		}else if(p==2){
			q=q*1089;

		}else if(p==3){
			q=q*399;
		}else if(p==4){
			q=q*249;
		}else if(p==5){
			q=q*3749;
		}else if(p==0){
			System.out.println("Please select valid choice\n");
			q=0;
		}else {
			System.out.println("You select wrong no need to pay anything.\n");
			q=0;
		}
		//displaying total bill for your purchase
		System.out.println("Your total bill is: INR->"+ q);
	}
}
