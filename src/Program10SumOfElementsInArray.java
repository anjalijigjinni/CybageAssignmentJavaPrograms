import java.util.Scanner;

public class Program10SumOfElementsInArray {

	public static void main(String[] args) {

		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		System.out.println("Enter " + size + " elements in array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements in the array is ");
		for (int i : arr) {
			System.out.print(" " + i + " ");
		}
		
		System.out.println();

		for (int i = 0; i < size; i++) {
			
			sum = sum + arr[i];

		}
		
		System.out.println("Sum of the elements in the array is  " + sum);

	}

}
