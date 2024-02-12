package Typecasting;

public class Widening_pgm1
{
public static void main(String[] args)
{
int salary=100000;
double con_sal= salary;//implicit syntax of widening
System.out.println(con_sal);

double con_sal1=(double) salary;//implicit syntax of widening
System.out.println(con_sal1);

byte a1=100;
a1=120;
int a2=    a1;
a2=234;
System.out.println(a2);
}
}
