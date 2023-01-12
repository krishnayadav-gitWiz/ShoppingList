package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product10SportPojo;


public class Product10SportOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product10SportPojo pro;
//	public void addProductSport() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product10SportPojo product = new Product10SportPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductSport() {
	ArrayList<Product10SportPojo> list = new ArrayList<Product10SportPojo>();
//	list.add(pro);
	Product10SportPojo p1=new Product10SportPojo(1,"Yoga Mat INR->",399);
	list.add(p1);
	Product10SportPojo p2=new Product10SportPojo(2,"Pull Up Band INR->",224);
	list.add(p2);
	Product10SportPojo p3=new Product10SportPojo(3,"Training Gloves INR->",185);
	list.add(p3);
	Product10SportPojo p4=new Product10SportPojo(4,"Solimo Hoola Loop INR->",149);
	list.add(p4);
	Product10SportPojo p5=new Product10SportPojo(5,"Home GYM Set INR->",625);
	list.add(p5);
	Product10SportPojo p0=new Product10SportPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}