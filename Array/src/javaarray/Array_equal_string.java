package javaarray;

import java.util.Arrays;

public class Array_equal_string {

	public static void main(String[] args)
	{
	String s1[]= {"Ram","Sita","Bharat"};
	String s2[]= {"Ram","sita","Lakshman"};
	boolean output=Arrays.equals(s1,s2);
	System.out.println(output);
	}

}
