package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product8FurniturePojo;


public class Product8FurnitureOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product8FurniturePojo pro;
//	public void addProductFurniture() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product8FurniturePojo product = new Product8FurniturePojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductFurniture() {
	ArrayList<Product8FurniturePojo> list = new ArrayList<Product8FurniturePojo>();
//	list.add(pro);
	Product8FurniturePojo p1=new Product8FurniturePojo(1,"Sofas & recliners INR->",15699);
	list.add(p1);
	Product8FurniturePojo p2=new Product8FurniturePojo(2,"Bed kingsize INR->",9989);
	list.add(p2);
	Product8FurniturePojo p3=new Product8FurniturePojo(3,"Dining Sets INR->",17999);
	list.add(p3);
	Product8FurniturePojo p4=new Product8FurniturePojo(4,"Laptop table INR->",749);
	list.add(p4);
	Product8FurniturePojo p5=new Product8FurniturePojo(5,"High back Chair INR->",9749);
	list.add(p5);
	Product8FurniturePojo p6=new Product8FurniturePojo(6,"Foldable Hammock INR->",649);
	list.add(p6);
	Product8FurniturePojo p7=new Product8FurniturePojo(7,"Swing Chair INR->",949);
	list.add(p7);
	Product8FurniturePojo p0=new Product8FurniturePojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}