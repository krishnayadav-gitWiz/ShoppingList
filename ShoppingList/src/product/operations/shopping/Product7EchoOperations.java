package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product7EchoPojo;


public class Product7EchoOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product7EchoPojo pro;
//	public void addProductEcho() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product7EchoPojo product = new Product7EchoPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductEcho() {
	ArrayList<Product7EchoPojo> list = new ArrayList<Product7EchoPojo>();
//	list.add(pro);
	Product7EchoPojo p1=new Product7EchoPojo(1,"Amazon alexa(4th Gen) INR->",699);
	list.add(p1);
	Product7EchoPojo p2=new Product7EchoPojo(2,"Fir TV Stick INR->",3989);
	list.add(p2);
	Product7EchoPojo p3=new Product7EchoPojo(3,"Eco show 8 INR->",599);
	list.add(p3);
	Product7EchoPojo p4=new Product7EchoPojo(4,"Wipro smart with Echo Flex LED INR->",849);
	list.add(p4);
	Product7EchoPojo p0=new Product7EchoPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}
