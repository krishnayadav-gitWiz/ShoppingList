package category.operations.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import category.pojo.shopping.CategoryPojo;

public class CategoryOperations {
	Scanner sc = new Scanner(System.in);
	CategoryPojo cat;
	/////////////////you can add category(for testing purpose)/////////////////////
//	public void addCategory() {
//	System.out.println("Enter the Category ID: ");
//	int category_id=sc.nextInt();
//	System.out.println("Enter the Category Name: ");
//	String category_name=sc.next();
//	System.out.println("Enter the Category Price: ");
//	int category_price=sc.nextInt();
//	CategoryPojo category = new CategoryPojo(category_id,category_name,category_price);
//	cat=category;
//	}
	
	public List getCategories() {
	ArrayList<CategoryPojo> list = new ArrayList<CategoryPojo>();
//	list.add(cat);
	CategoryPojo tvApp=new CategoryPojo(1,"TV & Appliances");
	list.add(tvApp);
	CategoryPojo mobAcc=new CategoryPojo(2,"Mobiles & Accessories");
	list.add(mobAcc);
	CategoryPojo kindleE=new CategoryPojo(3,"Kindle E-reader");
	list.add(kindleE);
	CategoryPojo healthW=new CategoryPojo(4,"Health & Wellness");
	list.add(healthW);
	CategoryPojo eleAcc=new CategoryPojo(5,"Electronics & Accessories");
	list.add(eleAcc);
	CategoryPojo fas=new CategoryPojo(6,"Fashion");
	list.add(fas);
	CategoryPojo echoFTV=new CategoryPojo(7,"Echo & Fire TV");
	list.add(echoFTV);
	CategoryPojo fur=new CategoryPojo(8,"Furniture");
	list.add(fur);
	CategoryPojo groH=new CategoryPojo(9,"Grocery & Household");
	list.add(groH);
	CategoryPojo sportF=new CategoryPojo(10,"Sports & Fitness");
	list.add(sportF);
	CategoryPojo exit=new CategoryPojo(0,"Exit\n");
	list.add(exit);

	return list;
}
}
