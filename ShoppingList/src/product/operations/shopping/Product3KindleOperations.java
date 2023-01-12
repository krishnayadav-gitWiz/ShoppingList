package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product3KindlePojo;


public class Product3KindleOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product3KindlePojo pro;
//	public void addProductKindle() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product3KindlePojo product = new Product3KindlePojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductKindle() {
	ArrayList<Product3KindlePojo> list = new ArrayList<Product3KindlePojo>();
//	list.add(pro);
	Product3KindlePojo p1=new Product3KindlePojo(1," Kindle(10th Gen) M12 INR->",7999);
	list.add(p1);
	Product3KindlePojo p2=new Product3KindlePojo(2,"All-new Kindle Paperwhite(8GB) INR->",13989);
	list.add(p2);
	Product3KindlePojo p3=new Product3KindlePojo(3,"All-new Kindle Oasis INR->",24999);
	list.add(p3);
	Product3KindlePojo p0=new Product3KindlePojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}