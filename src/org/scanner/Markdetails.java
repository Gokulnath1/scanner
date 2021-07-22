package org.scanner;

import java.util.Scanner;

public class Markdetails {
	   
	    public static void main(String[] args) {
			
	    	System.out.println("rm");
	    	Scanner s = new Scanner(System.in);
	    	
	    	System.out.println("enter the student id");
	        int id = s.nextInt();
	    	 
	     	System.out.println("enter the student name");
	        String name = s.next();
	        
	     	System.out.println("enter the gender");
	        String gender = s.next();
	        
	     	System.out.println("enter the mark1");
	        int mark1 = s.nextInt();
	        
	        
	        System.out.println("enter the mark2");
	        int mark2 = s.nextInt();
	        
	        
	        System.out.println("enter the mark3");
	        int mark3 = s.nextInt();
	        
	        
	        System.out.println("enter the mark4");
	        int mark4 = s.nextInt();
	        
	        
	        System.out.println("enter the mark5");
	        int mark5 = s.nextInt();
	        
	        int total = mark1+mark2+mark3+mark4+mark5;
	        System.out.println("The Total is "+total);
	        
	        
	        
	        
	     		    	
		}

}
