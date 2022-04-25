
public class Program1Variables {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("Performed swapping operations " + a + " " + b);

		// Performing different Arthematic Operations

		int x = 20;
		int y = 10;
		int z;
		z = x % y;
		System.out.println("Perfomed Modular division  " + z);

		if (x > y) {
			System.out.println("Largest Number is  " + x);

		}

		else {
			System.out.println();
		}

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("Swapping of two numbers without using third varaible   " + x + y);

	
	double val1 = 10.0;
	double val2 = 15.5;
	double val3 = val1+val2;
	System.out.println(val3);
	
	float f1=148.0f;
	float f2 = 163.90f;
	float f3 = f1*f2;
	System.out.println("Multiplication of two floating numbers is  " + f3);
	
	
	
	

	

	

	}
}
