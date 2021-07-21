package org1.scanner;

import java.util.Scanner;

public class Employedetails {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
	    System.out.println("enter the employe id");
	    int id = s.nextInt();
	    
	    System.out.println("enter the employe name");
	    String name = s.next();
	    
	    System.out.println("enter the employe email");
	    String email = s.next();
	    
	    System.out.println("enter the employe phonenumber");
	    long phonenumber = s.nextLong();
	    
	    System.out.println("enter the employe salary");
	    int salary = s.nextInt();
	    
	    System.out.println("enter the employe gender");
	    String gender = s.next();
	    
	    System.out.println("enter the employe city");
	    String city = s.next();
	    
	     }
}
