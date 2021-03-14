package com.cg.eis.employee;
import java.util.*;
import com.cg.eis.exception.EmployeeException;
public class Employee {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Employee salary: ");
		 int salary = sc.nextInt();
		 try {
			 if(salary>3000)
				 System.out.println("Salary entered successfully!!");
			 else
				 throw new EmployeeException(salary);
		 }catch(EmployeeException e) {
			 System.out.println("Salary can not be entered : "+e);
		 }
		 

	}
}
