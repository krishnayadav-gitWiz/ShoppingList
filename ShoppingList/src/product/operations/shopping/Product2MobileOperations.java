package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product2MobilePojo;



public class Product2MobileOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product2MobilePojo pro;
//	public void addProductMobile() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product2MobilePojo product = new Product2MobilePojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductMobile() {
	ArrayList<Product2MobilePojo> list = new ArrayList<Product2MobilePojo>();
//	list.add(pro);
	Product2MobilePojo p1=new Product2MobilePojo(1,"Sumsung galaxy M12 INR->",11699);
	list.add(p1);
	Product2MobilePojo p2=new Product2MobilePojo(2,"Redmi 9 INR->",9989);
	list.add(p2);
	Product2MobilePojo p3=new Product2MobilePojo(3,"Realme narzo INR->",8999);
	list.add(p3);
	Product2MobilePojo p4=new Product2MobilePojo(4,"Oneplus INR->",42749);
	list.add(p4);
	Product2MobilePojo p5=new Product2MobilePojo(5,"Powerbank INR->",1749);
	list.add(p5);
	Product2MobilePojo p0=new Product2MobilePojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}
