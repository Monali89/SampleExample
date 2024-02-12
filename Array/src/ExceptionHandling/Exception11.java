package ExceptionHandling;
import java.util.Scanner;
//Assignmentno.45
public class Exception11 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		try
		 {
			 int a=s1.nextInt();
			 int b=s1.nextInt();
			 int c=a/b;
			 System.out.println(c);
			 }
		 catch(ArithmeticException a1)
		 {
			System.out.println("Hi case1"); 
		 }
		 catch(NullPointerException a2)
		 {
			 System.out.println("Hi case2");
		 }
	}
}


