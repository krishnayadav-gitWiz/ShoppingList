package customer.shopping;

import java.util.regex.Pattern;
import java.util.*;

//Java Program to check the validity
//class to check email id is valid or not
public class EmailValidationCustomer {
	//method to check email id in right format and return boolean data type accordingly
	public static boolean isValid(String email)
	{
		//Email ID should be in right format E.g.-krishna.yadav2@citiustech.com
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$";
		//email id should be in right pattern/format
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	//method to be called during email validation during SIGN-UP
	public static boolean emailValidation()
	{
		ArrayList<String> address = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String email = sc.nextLine();
		address.add(email);
		//return true if email id is valid otherwise false 
		boolean temp=true;
		for(String i : address){
			if (isValid(i)) {
				temp=true;
				return temp;
			}
			else {
				temp=false;
				return temp;
			}
		}
		return temp;
	}

	//method to be called during email validation during SIGN-IN
	public static boolean checkForEmail() {
		Scanner sc=new Scanner(System.in);
		//email id dynamically given, you can use any one for sign-in
		String [] emailArr = {"abcd@xyz.pqr","krishna@gmail.com","dummy123@dummy.dummy","abc","Xyz@pqr.abc","abc"};
		String email = sc.nextLine();
		//return true if email-id is matched otherwise false
		for(String n : emailArr) {
			if (n.equals(email)) return true;
		}
		return false;  
	}
}


