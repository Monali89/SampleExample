package javaarray;

import java.util.Arrays;

//Assignmentno 41
public class Format_string
{
public static void main(String[] args)
{
		 String name[]= {"Ram", "Sita", "Vishnu"};
		  
		int roll_no[]={1 , 2, 3};
		 double salary[]={6543, 4345,  4567};
		 for(int i=0;i<name.length;i++)
		 {
		 
		     System.out.println(name[i]);
		     System.out.println("            " +roll_no[i]);
		     System.out.println("            " +salary[i]);
		 //System.out.println((name[i], +roll_no[i], +salary[i]));
		 }
}
}
