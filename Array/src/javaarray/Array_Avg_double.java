package javaarray;
//Assignment.no43
public class Array_Avg_double {

	public static void main(String[] args) {
		 double s1[]= {6.5,7.7,2.3,8.6,1.1};
		 double sum=0;
		 for(int i=0;i<=s1.length-1;i++)
		 {
			 sum=sum+s1[i];
			 System.out.println(sum);
			 System.out.println("avg of five no.of array");
			 System.out.println(sum/s1.length);
			 System.out.println(sum%s1.length);
			 
		 }
		}

	

	}

