package javaarray;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner1 
{
public static void main(String[] args)
	{
	int roll_no[]= new int[4];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the values");
	for(int i=0;i<roll_no.length;i++)
	{
		roll_no[i]=s.nextInt();
}
System.out.println("The value of four arrays" +Arrays.toString(roll_no));
}
}