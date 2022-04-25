
public class Program7SwappingTwoNumbers {

	public static void main(String[] args) {
		
		
		int x = 150;
		int y = 200;
		
		// First Way Using Third Variable
		
		int temp;
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("Swapping of two numbers using third varaible is  " + x + " "+ y);
		
		
		//Second Way without using third variable
		
		int var1 = 32;
		int var2 = 23;
		
		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;

		System.out.println("Swapping of two numbers without third varaible is  " + var1 + " "+ var2);
	}

}
