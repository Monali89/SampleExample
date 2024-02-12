package javaarray;

import java.util.Scanner;

public class Area_of_circle1
{
public static void main(String[] args)
	{
	 double area,radius,circum,length,breadth;
	 int option;
	 Scanner sc=new Scanner(System.in);
	 option=sc.nextInt();
	 switch(option)
	 {
	 case 1:
		System.out.println("enter radius");
		radius=sc.nextDouble();
		area=(Math.PI)*(radius*radius);
		System.out.println(area);
		
	 case 2:
		 System.out.println("Enter radius");
		 radius=sc.nextDouble();
		 circum= 2*(Math.PI)*(radius*radius);
		 System.out.println(circum);
		 
	 case 3:
		 System.out.println("Enter length and breadth");
		 length=sc.nextDouble();
		 breadth=sc.nextDouble();
		 double area_of_rectangle=length*breadth;
		 System.out.println(area_of_rectangle);
		 
	 default:
			 System.out.println("invalid choice");
}
	}}