import java.util.Scanner;

public class Program3PrintNumbersUsingLoop {

	public static void main(String[] args) {

		System.out.println("Enter how many numbers you want to print ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "  Number is even number");
			} else {
				System.out.println(i + "  Number is odd number");
			}
		}

	}

}
