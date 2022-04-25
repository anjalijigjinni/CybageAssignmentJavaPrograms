import java.util.Scanner;

public class Program5SwitchCase {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;

		System.out.println("Enter type of operation to be performed : 1)add 2)sub 3)mul 4)div ");
		Scanner sc = new Scanner(System.in);
		String inputOperation = sc.nextLine();

		switch (inputOperation) {

		case "add":
			c = (a + b);
			System.out.println("Input operation given by user is  " + inputOperation);
			System.out.println(c);
			break;

		case "sub":
			c = (a - b);
			System.out.println("Input operation given by user is  " + inputOperation);
			System.out.println(c);
			break;

		case "mul":
			c = (a * b);
			System.out.println("Input operation given by user is  " + inputOperation);
			System.out.println(c);
			break;

		case "div":
			c = (a / b);
			System.out.println("Input operation given by user is  " + inputOperation);
			System.out.println(c);
			break;

		default:
			System.out.println("You have entered the wrong operation, please enter the correct operation");

		}
		

	}

}
