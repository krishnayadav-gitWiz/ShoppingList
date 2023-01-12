package customer.shopping;

import java.util.Scanner;

// Java Program to check the validity
//of a Password using User-Defined Exception
//Class for user-defined InvalidPasswordException
class InvalidPasswordException extends Exception {
	int passwordConditionViolated = 0;

	//checking for invalid password
	public InvalidPasswordException(int conditionViolated)
	{
		super("Invalid Password: ");
		passwordConditionViolated = conditionViolated;
	}
	//password must have 8 to 15 characters and at least one Uppercase & Lowercase & SpecialCharacter & Digit
	public String printMessage()
	{
		// Call constructor of parent Exception
		// according to the condition violated
		switch (passwordConditionViolated) {

		// Password length should be
		// between 8 to 15 characters
		case 1:
			return ("Password length should be between 8 to 15 characters.");

			// Password should not contain any space
		case 2:
			return ("Password should not contain any space.");

			// Password should contain// at least one digit(0-9)
		case 3:
			return ("Password should contain at least one digit(0-9).");

			// Password should contain at least
			// one special character ( @, #, %, &, !, $ )
		case 4:
			return ("Password should contain at least one special character.");

			// Password should contain at least
			// one uppercase letter(A-Z)
		case 5:
			return ("Password should contain at least one uppercase letter(A-Z).");

			// Password should contain at least
			// one lowercase letter(a-z)
		case 6:
			return ("Password should contain at least one lowercase letter(a-z).");
		}

		return ("");
	}
}

//Driver Class
public class PasswordValidationCustomer {

	// A utility function to check
	// whether a password is valid or not
	public static void isValid(String password)
			throws InvalidPasswordException
	{

		// for checking if password length
		// is between 8 and 15
		if (!((password.length() >= 8)
				&& (password.length() <= 15))) {
			throw new InvalidPasswordException(1);
		}

		// to check space
		if (password.contains(" ")) {
			throw new InvalidPasswordException(2);
		}
		if (true) {
			int count = 0;

			// check digits from 0 to 9
			for (int i = 0; i <= 9; i++) {

				// to convert int to string
				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(3);
			}
		}

		// for special characters
		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") 
				|| password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(")
				|| password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/")|| password.contains(":") 
				|| password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			throw new InvalidPasswordException(4);
		}

		if (true) {
			int count = 0;

			// checking capital letters
			for (int i = 65; i <= 90; i++) {

				// type casting
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(5);
			}
		}

		if (true) {
			int count = 0;

			// checking small letters
			for (int i = 90; i <= 122; i++) {

				// type casting
				char c = (char)i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(6);
			}
		}

		// The password is valid
	}

	//method to be called during password validation during SIGN-UP
	public static boolean passwordValidation()
	{
		Scanner sc=new Scanner(System.in);
		String password = sc.nextLine();
		//return true if password is valid otherwise false 
		boolean temp=false;
		try {
			isValid(password);
			temp=true;
		}
		catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
		return temp;
	}


	//method to be called during password validation during SIGN-IN
	public static boolean checkForPassword() {
		Scanner sc=new Scanner(System.in);
		//password dynamically given, you can use any one for sign-in
		String [] passwordArr = {"Abcd@1234","Krisna$1998","Dummy#dummy123","xYZ&pqR123","abc"};
		String password = sc.nextLine();
		//return true if password is matched otherwise false
		for(String n : passwordArr) {
			if (n.equals(password)) return true;
		}
		return false;  
	}
}



