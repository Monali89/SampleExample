package javaarray;

public class Array_ascending1
{
public static void main(String[] args)
	{
	 int[] array = new int[] {18, 24, 0, 1, 30, 34, -1, -4, 6, 15, 20, -13};  
	 System.out.println("Array elements ascending order:");    
	 for (int i = 0; i < array.length; i++)   
	 	{  
		     for (int j = i + 1; j < array.length; j++)   
		        {  
		           int tmp = 0;  
		           if (array[i] > array[j])   
		                {  
		                    tmp = array[i];  
		                    array[i] = array[j];  
		                    array[j] = tmp;  
		                }  
		           }  
		            System.out.println(array[i]);  
		       }  
		    }  
		} 
	
