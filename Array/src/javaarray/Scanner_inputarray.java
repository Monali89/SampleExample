package javaarray;
//to print the values in array using scanner class
import java.util.Scanner;

public class Scanner_inputarray {

	public static void main(String[] args) {
		 int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter elements you want to store");
		 n=sc.nextInt();
		 int[] array=new int[4];
		 System.out.println("Enter the elements of array");
		 for(int i=0;i<n;i++)
		 {
			 array[i]=sc.nextInt();
			 System.out.println("Array elements are");
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println(array[i]);
		 }

	}

}
