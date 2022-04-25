
public class Program2Operators {

	public static void main(String[] args) {

		// Arthimetic Operators

		int a = 200, b = 100;
		System.out.println("a + b is " + " " + (a + b));
		System.out.println("a - b is " + (a - b));
		System.out.println("a * b is " + (a * b));
		System.out.println("a / b is " + (a / b));
		System.out.println("a % b is " + (a % b));

		// Assignment Operators

		int x = 10;
		int y;
		y = x; // Assignment Operator
		y += x; // Performs y =y+x
		System.out.println("Y value after addition is  " + y);
		y *= x;
		System.out.println("Y value after multiplication  is  " + y);

		// Relational Operators

		int val1 = 9;
		int val2 = 18;
		System.out.println((val1 == val2));
		System.out.println((val1 != val2));
		System.out.println((val1 > val2));
		System.out.println((val1 < val2));
		System.out.println((val1 >= val2));
		System.out.println((val1 <= val2));

		// Logical Operators

		System.out.println((val1 < val2) && (val1 <= val2));
		System.out.println((val1 > val2) || (val1 <= val2));
		System.out.println(!(val1 == val2));

		// Unary Operators

		int c = 15, d = 25;
		int res1, res2;
		res1 = c++;
		res2 = --d;
		System.out.println(res1);
		System.out.println(res2);
		
		//Ternary Operators
		
		int febDays = 29;
		String result;
		result = (febDays==29) ? "This is a leap year" : "Not a leap year" ;
		System.out.println(result);
		

	}

}
