package product.operations.shopping;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import category.pojo.shopping.CategoryPojo;
import product.pojo.shopping.Product1TvPojo;

public class Product1TvOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product1TvPojo pro;
//	public void addProductTv() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product1TvPojo product = new Product1TvPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductTv() {
	ArrayList<Product1TvPojo> list = new ArrayList<Product1TvPojo>();
//	list.add(pro);
	Product1TvPojo p1=new Product1TvPojo(1,"Sumsung washing machine INR->",5699);
	list.add(p1);
	Product1TvPojo p2=new Product1TvPojo(2,"LG AC INR->",8989);
	list.add(p2);
	Product1TvPojo p3=new Product1TvPojo(3,"Redmi(50)4k INR->",37999);
	list.add(p3);
	Product1TvPojo p4=new Product1TvPojo(4,"4: Dishwashers INR->",42749);
	list.add(p4);
	Product1TvPojo p5=new Product1TvPojo(5,"Panasonic Microwave Oven INR->",4749);
	list.add(p5);
	Product1TvPojo p0=new Product1TvPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}
