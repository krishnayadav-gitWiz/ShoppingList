package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product6FashionPojo;


public class Product6FashionOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product6FashionPojo pro;
//	public void addProductFashion() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product6FashionPojo product = new Product6FashionPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductFashion() {
	ArrayList<Product6FashionPojo> list = new ArrayList<Product6FashionPojo>();
//	list.add(pro);
	Product6FashionPojo p1=new Product6FashionPojo(1,"Allen Solly T-shirt INR->",699);
	list.add(p1);
	Product6FashionPojo p2=new Product6FashionPojo(2,"American Tourister luggage INR->",3989);
	list.add(p2);
	Product6FashionPojo p3=new Product6FashionPojo(3,"Puma Men's cap INR->",599);
	list.add(p3);
	Product6FashionPojo p4=new Product6FashionPojo(4,"LIFE Men's jeans INR->",849);
	list.add(p4);
	Product6FashionPojo p5=new Product6FashionPojo(5,"Kids coat,pant INR->",749);
	list.add(p5);
	Product6FashionPojo p6=new Product6FashionPojo(6,"Wollen V-nec cardigan INR->",989);
	list.add(p6);
	Product6FashionPojo p7=new Product6FashionPojo(7,"Women's kurta with Pant and Duppatta INR->",1749);
	list.add(p7);
	Product6FashionPojo p0=new Product6FashionPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}
