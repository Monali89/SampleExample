package javaarray;

public class Java_Methods
{
	static void method_overload(int a, int b)
	{
		int div=a/b;
	System.out.println(div);
	}
	void method_overload(double a, double c)
	{
	double sum=a+c;	
	System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		method_overload(2,4);
		Java_Methods j1=new Java_Methods();
		j1.method_overload(12.0,6.0);
		 
	}

}
