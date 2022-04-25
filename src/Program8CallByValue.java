
public class Program8CallByValue {

	public static void main(String[] args) {

		int a = 32, b = 23;
		System.out.println("Before Swapping values will be  " + a + " " + b);

		swapFunction(a, b);
		System.out.println("After Swapping values will be  " + a + " " + b);

	}

	public static void swapFunction(int a, int b) {

		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("Swapping inside the function values are  " +  a + " " +  b);

	}

}
