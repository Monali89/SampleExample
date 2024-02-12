package assertkeyword;
import java.util.Scanner;
//Assignment no 51
public class Assert51 {
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter age of the person");
	int age=s1.nextInt();
	 assert age>18;
	 if(age>18)
	 {
		 System.out.println("Age of the person is grater than 18");
	 }
	 else
	 {
		 System.out.println("Age of the person is less than 18");
	 }
	}

}
