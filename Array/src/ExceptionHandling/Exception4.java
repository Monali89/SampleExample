package ExceptionHandling;
//Assignment no.46
import java.util.Scanner;
import java.lang.String;
public class Exception4 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try
		 {
			 String a=s1.next();
			 String b=s1.next();
			
			
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

	


