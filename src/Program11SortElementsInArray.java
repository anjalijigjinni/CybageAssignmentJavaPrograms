import java.util.Scanner;

public class Program11SortElementsInArray {

	public static void main(String[] args) {

		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements in array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements in the array before sorting is ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			System.out.println( arr[i] + " ");
			
		}
	}

}
