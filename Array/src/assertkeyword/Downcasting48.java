package assertkeyword;
public class Downcasting48 
{
public static void main(String[] args) {
		class Four4
		{
			void one()
			{
			System.out.println("void one from the class Four4");
			}
		}
		class Three3 extends Four4
		{
			void two()
			{
			System.out.println("Void two from the class Three3");
			}
		}
		class Two2 extends Three3
		{
			void three()
			{
			System.out.println("void three from the class Two2");
			}
		}
		class Assert48  extends Two2
		{	
			void four()
			{
			System.out.println("void four from the subclass/Downcasting_Assignment48");
			}
			public static void main(String[] args)
			{
				//upcasting from 2 to 3
				System.out.println("Example for upcasting from 2 to 3");
				Three3 ref= new Two2();
				ref.two();
				ref.one();
				// downcasting from 3 to 2
				System.out.println("");
				System.out.println("Downcasting from 3 to 2");
				Two2 t1=(Two2) ref;
				t1.one();
				t1.two();
				t1.three();
			} }}}
