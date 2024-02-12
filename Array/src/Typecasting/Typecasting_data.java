package Typecasting;
//assignment no.46
public class Typecasting_data {

	public static void main(String[] args) {
		 
byte mybyte=127;//-128 to 127
int myint1=mybyte;
System.out.println(mybyte);
System.out.println(myint1);



short myshort= 1234;  //-32768 to -32767



int myint=45000; // -2,147,483,648 to 2,147,483,647
byte mybyte1= (byte) myint;
System.out.println(myint);
System.out.println(mybyte1);

long mylong=11;    //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	}

}
