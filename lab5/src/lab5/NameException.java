package lab5;
import java.util.*;

class ValidNameExcep extends Exception{
	public ValidNameExcep(String str) {
		System.out.println(str);
	}
	
}

public class NameException {

	public static void main(String[] args) {
		String fname;
		String lname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		fname=sc.next();
		System.out.println("Enter the lname name");
		lname=sc.next();
		try {
			if(fname.equals(null) || lname.equals(null)) {
				throw new ValidNameExcep("Invalid name");
			}
			else 
				System.out.println("Valid name");
		}
		catch(ValidNameExcep e){
			System.out.println(e);
		}
	}
}
