import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String str, reverse = "";
		System.out.println("Enter your string");
		System.out.println("AAYUSH");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("reverse string is " +reverse);

		

	}

		

}


