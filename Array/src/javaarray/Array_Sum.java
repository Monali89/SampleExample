package javaarray;
//Assignmentno.36
//sum of all positive and negative  elements
public class Array_Sum
{
public static void main(String[] args) 
{
int no[]= {17,-14,20,-10,-25};
no[0]=17;
no[1]=-14;
no[2]=20;
no[3]=-10;
no[4]=-25;
int sum=0;
for(int i=0;i<=no.length-1;i++)
{
	sum=sum+no[i];
}
System.out.println(sum);
}
}


