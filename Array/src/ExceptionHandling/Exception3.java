package ExceptionHandling;
//throw
public class Exception3 {

	public static void main(String[] args) {
		int age=20;
		if(age>=18)
		{
			System.out.println("lets use google");
		}
		else
		{
			throw new ArithmeticException();
		}
	}

}
