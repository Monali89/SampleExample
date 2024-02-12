package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		 int a[]=new int[5];
		 a[0]=12;
		 a[1]=13;
		 a[2]=23;
		 a[3]=34;
		 try
		 {
			 a[4]=55;
		 }
		 catch(ArrayIndexOutOfBoundsException a1)
		 {
			 System.out.println("since size was of 4 and addednumber 5 i handled this exception");
		 }
		 finally
		 {
			 System.out.println("Always i am");
		 }

	}

}
