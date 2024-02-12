package Encapsulation;
//assignment no. 45
import java.util.Scanner;

public class Switchcase_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		//int sum= a+b;
		 switch(2)
		 {
		
		 case 1:int sum= a+b;
			 System.out.println("Addition with a and b:"    +sum);
		 
		 break;
		 case 2:int sub=a-b;
			 System.out.println("substraction with a and b:"   +sub);
		 break;
		 case 3:int div= a/b;
			 System.out.println("division with a and b"     +div);
		 break;
		 case 4: int mul=a*b;
			 System.out.println("multiplication with a and b"    +mul);
		 break;
		 default:System.out.println(" No case is selected that is why i am the output");
		 s1.close();
		 }

}
}