
public class Program9CallByReference {
	
	

	public static void main(String[] args) {
		
		Integer a = new Integer(5);
		Integer b = new Integer(10);
		System.out.println("Before Swapping variables are  " + a + " " + b);
		swapFunction(a,b);
		System.out.println("After Swapping variables are  " + a + " " + b);
		
		
		
		
		
		
		

	}

	public static void swapFunction(Integer a, Integer b) {
		Integer c;
		c = a;
		a=b;
		b= c;
		System.out.println("Swapping Inside Function is   " + a + " " + b);
		
	}

}
