package seller.shopping;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SellerCrudOperations {
	//main method to perform all crud operations
		public static void operations() throws IOException {
//	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String choice,cont = "y";        
		while( cont.equalsIgnoreCase("y") ) {        	
			System.out.println("\t\t Product Information System\n\n");
			ArrayList<String> product=new ArrayList<String>();
			product.add("1: Add New Product ");
			product.add("2: View All Product ");
			product.add("3: Remove Specific Product ");
			product.add("4: Search Specific Product ");
			product.add("5: Update Specific Product ");
			product.add("0. Exit\n");
			Iterator<String> itr = product.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.print("\n\n");
			System.out.println("Enter your choice: ");
			choice = sc.nextLine();
			System.out.print("\n\n");
			if( choice.equals("1") ) {
				AddRecord();
			} else if( choice.equals("2") ) {
				ViewAllRecord();
			} else if( choice.equals("3") ) {
				DeleteRecordByID();
			}	else if( choice.equals("4") ) {
				SearchRecordbyID();
			}	else if( choice.equals("5") ) {
				updateRecordbyID();
			}else if( choice.equals("0") ) {
				System.out.println("EXIT");
				System.exit(0);
				break;
			}
			else {
				//System.out.println("Please select valid choice\n"); 
				System.err.println("Please select valid choice\n"); 
				break;
			}
		}
		System.out.println("Do you want to continue? Y/N");
		cont = sc.nextLine();
	}
	//method for adding product to sell
	public static void AddRecord() throws IOException {
		BufferedWriter bw = new BufferedWriter( new FileWriter("product_main.txt",true) );
		Scanner sc = new Scanner(System.in);
		String pId, pName,pPrice;
		System.out.print("Enter the Product ID: ");
		pId = sc.nextLine();
		System.out.print("Enter the Product Name: ");
		pName = sc.nextLine();
		System.out.print("Enter the Product Price: ");
		pPrice = sc.nextLine(); 		
		bw.write(pId+" "+pName+" "+pPrice);
		System.out.println("*****Product added successfully*****");
		System.out.print("\n\n");
		bw.flush();
		bw.newLine();
		bw.close();		
	}
	//method for view product to sell
	public static void ViewAllRecord() throws IOException {
		//txt file for storing all product derails
		BufferedReader br = new BufferedReader( new FileReader("product_main.txt") );
		String record;
		System.out.println("*****Final list of Products*****");
		while( ( record = br.readLine() ) != null ) {
			StringTokenizer st = new StringTokenizer(record," ");
			System.out.println(st.nextToken()+"	"+st.nextToken()+" "+st.nextToken());
		}
		System.out.print("\n\n");
		br.close();       		
	}
	//method for deleting product to sell
	public static void DeleteRecordByID() throws IOException {
		Scanner sc =  new Scanner(System.in);
		String pId, record;
		File tempDB = new File("product_temp.txt");
		File db = new File("product_main.txt");
		BufferedReader br = new BufferedReader( new FileReader( db ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		System.out.println("\t\t Delete Product Record\n");
		System.out.println("Enter the Product ID: ");
		pId =  sc.nextLine();
		while( ( record = br.readLine() ) != null ) {
			if( record.contains(pId) ) 
				continue;
			bw.write(record);
			bw.flush();
			bw.newLine();
		}
		System.out.println("*****Product deleted successfully*****");
		System.out.print("\n\n");
		br.close();
		bw.close();
		db.delete();
		tempDB.renameTo(db);
	}
	//method for search product to sell
	public static void SearchRecordbyID() throws IOException {
		String pId,record;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader( new FileReader("product_main.txt") );
		System.out.println("\t\t Search Product Record\n");
		System.out.println("Enter the Product ID: ");
		pId = sc.nextLine();
		while( ( record = br.readLine() ) != null ) {
			StringTokenizer st = new StringTokenizer(record," ");
			if( record.contains(pId) ) {
				System.out.println("*****Product which you want to check*****");
				System.out.println(st.nextToken()+"	"+st.nextToken()+" "+st.nextToken());
			}
		}
		System.out.print("\n\n");
		br.close();
	}
	//method for update product to sell
	public static void updateRecordbyID() throws IOException {
		String pName, pPrice, record, pId,record2;
		File db = new File("product_main.txt");
		File tempDB = new File("product_temp.txt");
		BufferedReader br = new BufferedReader( new FileReader(db) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t Update Product Record\n\n");   
		System.out.println("Enter the Product ID: ");
		pId = sc.nextLine();	   

		while( ( record = br.readLine() ) != null ) {

			StringTokenizer st = new StringTokenizer(record,",");
			if( record.contains(pId) ) {
				System.out.println("*****Product updated successfully*****");
				System.out.println(st.nextToken()+"	"+st.nextToken()+""+st.nextToken());
			}
			System.out.print("\n\n");
		}	    		
		br.close();
		System.out.println("Enter the new Product Name: ");
		pName = sc.nextLine();    		
		System.out.println("Enter the new Product price: ");
		pPrice = sc.nextLine(); 
		BufferedReader br2 = new BufferedReader( new FileReader(db) );
		while( (record2 = br2.readLine() ) != null ) {    			
			if(record2.contains(pId)) {
				bw.write(pId+" "+pName+" "+pPrice);
			} else {
				bw.write(record2);	
			}    			
			bw.flush();
			bw.newLine();
		}
		bw.close();
		br2.close();    		
		db.delete();    		
		boolean success = tempDB.renameTo(db);    		
		System.out.println(success);    
	}
}
