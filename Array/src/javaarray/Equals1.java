package javaarray;
//Nithya Gunasekaran 11:18 PM
	import java.util.Arrays;
	import java.util.Scanner;
public class Equals1
	{
		public static void main(String[] args) 
		{			
					Scanner s1=new Scanner(System.in);

					int array1[] =new int [5];
					int array2[]=new int [5];
					System.out.println("Enter the array1 value of 5 length"  );
					

					for(int i=0;i<array1.length;i++)
					{
					array1[i]	=s1.nextInt();
					
					
					}
					System.out.println("Enter the array2 value of 5 length");
					for(int j=0;j<array2.length;j++)
					{
					
					array2[j] = s1.nextInt();
					
					}
					
					
					System.out.println(Arrays.toString(array1));
					
					System.out.println(Arrays.toString(array2));
					
					boolean isEqual=Arrays.equals(array1, array2);
					
					if(isEqual)
					{
						System.out.println("The arrays are equal");
					}
					else
					{
						System.out.println("The arrays are not equal");
					}
				
				}

		
}
