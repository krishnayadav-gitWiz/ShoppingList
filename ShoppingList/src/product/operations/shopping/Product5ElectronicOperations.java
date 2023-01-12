package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product5ElectronicPojo;


public class Product5ElectronicOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product5ElectronicPojo pro;
//	public void addProductElectronic() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product5ElectronicPojo product = new Product5ElectronicPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductElectronic() {
	ArrayList<Product5ElectronicPojo> list = new ArrayList<Product5ElectronicPojo>();
//	list.add(pro);
	Product5ElectronicPojo p1=new Product5ElectronicPojo(1,"Macbook Pro M1 INR->",112699);
	list.add(p1);
	Product5ElectronicPojo p2=new Product5ElectronicPojo(2,"Digitek Tripod INR->",5989);
	list.add(p2);
	Product5ElectronicPojo p3=new Product5ElectronicPojo(3,"Sumsang galaxy Watch4 narzo INR->",23999);
	list.add(p3);
	Product5ElectronicPojo p4=new Product5ElectronicPojo(4,"Oneplus Band INR->",1449);
	list.add(p4);
	Product5ElectronicPojo p5=new Product5ElectronicPojo(5,"EKSA E900 pro headphone INR->",3749);
	list.add(p5);
	Product5ElectronicPojo p0=new Product5ElectronicPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}