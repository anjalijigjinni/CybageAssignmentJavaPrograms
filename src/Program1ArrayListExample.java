import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program1ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Watermelon");
		list.add("Mango");
		list.add("Chikoo");

		for (String fruit : list) {

			System.out.println(fruit);
		}

		list.remove(2);
		list.remove(1);

		System.out.println("List after removing");

		for (String fruit : list) {

			System.out.println(fruit);
		}

		System.out.println("Printing all elements in forward direction");
		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Printing all elements in backward direction");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
