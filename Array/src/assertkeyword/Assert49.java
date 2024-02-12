package assertkeyword;
//Assignment no 49
import java.util.Scanner;
public class Assert49 
{
public static void main(String[] args) 
	{
		 Scanner s1=new Scanner(System.in);
		 System.out.println("Enter a number");
		 int len=s1.nextInt();
		 int arr[]= {1,2,3,4};
		 assert arr.length==len;
		 System.out.println("Matched");
		 for(int i=0; i<arr.length; i++)
			 if(arr[i]==len)
		 {
				 System.out.println("confirmed");
		 }
			 else
		 {
				 System.out.println("not confirmed");
		 }
	}
}
