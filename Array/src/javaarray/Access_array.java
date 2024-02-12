package javaarray;

public class Access_array
{

	public static void main()
{
		/* String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
           System.out.println(cars[0]);
		}*/
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
		/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}*/
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]);
		 
	}

}

