package Encapsulation;
public class Enacapsulate_return
{
int add(int a, int b)
{
 int sum=a+b;
return sum;
}
double add(double a, double b)
{
double  sum=a+b;
return sum;
}
double add(double a, int b)
{
 double sum=a+b;
return sum;
}

public static void main(String[] args)
{
	Enacapsulate_return e1=new Enacapsulate_return();
	System.out.println(e1.add(12,4));
	System.out.println(e1.add(12.00, 12.9));
	System.out.println(e1.add(4, 1.1));
}
}