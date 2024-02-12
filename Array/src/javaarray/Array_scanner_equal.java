package javaarray;

import java.util.Scanner;
//Assignmentno.37
public class Array_scanner_equal {

	public static void main(String[] args) {
		 Scanner s1=new Scanner(System.in);
		 Scanner s2=new Scanner(System.in);
		 System.out.println("Enter two strings");
		
		 String a=s1.next();
		 String b=s2.next();
		 Boolean output=a.equals(b);
		 System.out.println(output);
		 
	}

}
