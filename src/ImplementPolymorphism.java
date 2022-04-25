
public class ImplementPolymorphism {

	int result;

	public void add(int a, int b) {

		result = a + b;
		System.out.println(result);
	}

	public void add(int a, int b, int c) {

		result = a + b + c;
		System.out.println(result);
	}

	public void add(int a, int b, int c, int d) {

		result = a + b + c + d;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		ImplementPolymorphism pol = new ImplementPolymorphism();
		pol.add(10, 20, 30);

	}

}
