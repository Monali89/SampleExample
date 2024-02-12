package javaarray;
//Assignmentno.42
public class Array_MinMax_Negative_Positive {

	public static void main(String[] args) {
		int number[]= {-74,-85,73,19,-8};
		int max=number[0];//assuming
		int min=number[0];//assumingv
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
				
			}
			if(number[i]<min)
			{
				min=number[i];
			}	
		}
		System.out.println("Maximum no. is: "+max);
		System.out.println("Minimum number is :"+min);
	
	
	}

}
