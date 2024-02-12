package Typecasting;
class Teacher_upcasting
{
	void selenium()
	{
		
	}
	void java()
	{
		
	}
}
	public class Student_upcasting extends Teacher_upcasting
	{
	void kt()
	{
	}
	void kt_sessions()
	{
	}
		public static void main(String[] args)
		{
	Teacher_upcasting t1=new Student_upcasting();
	t1.selenium();
	t1.java();

	}

}
