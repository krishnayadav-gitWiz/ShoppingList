package product.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.pojo.shopping.Product9GroceryPojo;


public class Product9GroceryOperations {
	Scanner sc = new Scanner(System.in);
	/////////////////you can add product(for testing purpose)/////////////////////
//	Product9GroceryPojo pro;
//	public void addProductGrocery() {
//	System.out.println("Enter the product ID: ");
//	int product_id=sc.nextInt();
//	System.out.println("Enter the product Name: ");
//	String product_name=sc.next();
//	System.out.println("Enter the product Price: ");
//	int product_price=sc.nextInt();
//	Product9GroceryPojo product = new Product9GroceryPojo(product_id,product_name,product_price);
//	pro=product;
//	}

	public List getProductGrocery() {
	ArrayList<Product9GroceryPojo> list = new ArrayList<Product9GroceryPojo>();
//	list.add(pro);
	Product9GroceryPojo p1=new Product9GroceryPojo(1,"Kissan Crunchy Peanut INR->",399);
	list.add(p1);
	Product9GroceryPojo p2=new Product9GroceryPojo(2,"Maggi Pazzta INR->",224);
	list.add(p2);
	Product9GroceryPojo p3=new Product9GroceryPojo(3,"B Natural Mixed fruit Juive INR->",185);
	list.add(p3);
	Product9GroceryPojo p4=new Product9GroceryPojo(4,"Bikano Namkeen INR->",149);
	list.add(p4);
	Product9GroceryPojo p5=new Product9GroceryPojo(5,"Powder Detergent INR->",625);
	list.add(p5);
	Product9GroceryPojo p0=new Product9GroceryPojo(0,"Exit\\n",0);
	list.add(p0);

	return list;
}
}