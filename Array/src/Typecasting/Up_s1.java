package Typecasting;

class Up_s3
{
	 void one()
	 {
	 }
}
	 class Up_s2 extends Up_s3
	 {
		 void two()
		 {
			 
		 }
	 }
		 class Up_s1 extends Up_s2
		 {
			 void three()
			 {
				 
			 }
	 	public static void main(String[] args)
	{
	// Up_s3 ref= new Up_s1();//case 1
  // ref.one();
	 		Up_s1 ref= new Up_s2();
	}

		 }