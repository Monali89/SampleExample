package assertkeyword;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//Assignment no.50
public class Assert50
{
public static void main(String[] args)
{
	 int num[]=new int[4];
	 int num1[]= {10,20,30,40};
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Enter the values in array");
	 for(int i=0;i<=num.length;i++)
	 {
		 num[i]=s1.nextInt();
	 }
	 System.out.println(Arrays.toString(num));
assert(((num.length)&(num1.length))==4);
}
}