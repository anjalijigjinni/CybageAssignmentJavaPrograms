import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		String str, reverse = "";
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("reverse string is " +reverse);

		if (str.equalsIgnoreCase(reverse)) {
			System.out.println(str + " String is palindrome");
		}

		else {
			System.out.println(str + " String is not palindrome");
		}

	}

}
