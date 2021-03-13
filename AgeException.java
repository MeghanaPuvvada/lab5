package lab5;

import java.util.*;
	class AgeExcdemo extends Exception {
		public AgeExcdemo(String str) {
			System.out.println(str);
		}
	}
	public class AgeException {
		 
		 public static void main(String[] args) {
			  Scanner s = new Scanner(System.in);
			  System.out.print("Enter ur age :: ");
			  int age = s.nextInt();
			  
			  try {
				   if(age < 15) 
				    throw new AgeExcdemo("Invalid age");
				   else
				    System.out.println("Valid age");
			  }
			  catch (AgeExcdemo a) {
				  System.out.println(a);
			  }
		 }

	
}
