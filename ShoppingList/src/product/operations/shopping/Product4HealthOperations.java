package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product4HealthPojo;


public class Product4HealthOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product4HealthPojo pro;
//	public void addProductHealth() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product4HealthPojo product = new Product4HealthPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductHealth() {
	ArrayList<Product4HealthPojo> list = new ArrayList<Product4HealthPojo>();
//	list.add(pro);
	Product4HealthPojo p1=new Product4HealthPojo(1,"BP Monitor INR->",1699);
	list.add(p1);
	Product4HealthPojo p2=new Product4HealthPojo(2,"Electric Toothbrush INR->",489);
	list.add(p2);
	Product4HealthPojo p3=new Product4HealthPojo(3,"Foot and Leg Massager INR->",10999);
	list.add(p3);
	Product4HealthPojo p4=new Product4HealthPojo(4,"MI Trimmer INR->",1749);
	list.add(p4);
	Product4HealthPojo p5=new Product4HealthPojo(5,"Dr Ortho INR->",749);
	list.add(p5);
	Product4HealthPojo p0=new Product4HealthPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}