package ExceptionHandling;

public class Exception6 {
//try catch example

	public static void main(String[] args)
	{
		int option = 5;
		switch(option)
		{
		case 1:
			int a= 50/0;  //may throw exception
			System.out.println("rest of the code");
			
		case 2:
			try
			{
				int b=2/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("rest of the code");
			
		case 3:
			
			try
			{
				int b=2/0;
				System.out.println("rest of the code");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
		case 4:
			int a1=50;
			int b1=0;
			 int data;
			try
			{
				data=a1/b1;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			System.out.println("cant divided by zero");
			
		case 5:
			int i=50;
			int j=0;
			 int data1;
			try
			{
				data1=i/j;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(i/(j+2));
			}
	}

}
}