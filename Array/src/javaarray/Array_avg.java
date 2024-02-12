package javaarray;

public class Array_avg {

	public static void main(String[] args) {
	 int s1[]= {65,77,23,86,11};
	 int sum=0;
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
