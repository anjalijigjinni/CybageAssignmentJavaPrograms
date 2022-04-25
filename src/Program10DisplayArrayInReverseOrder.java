import java.util.Scanner;

public class Program10DisplayArrayInReverseOrder {

	public static void main(String[] args) {

		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements in array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements in the array is ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println("Elements in reverse order");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}

	}

}
