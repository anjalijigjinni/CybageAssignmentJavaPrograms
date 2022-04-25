import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Program1HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		ht.put(4, "Four");

		for (Entry m : ht.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue());

		}
		
		

	}

}
