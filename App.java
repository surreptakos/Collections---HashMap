import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// Maps store pairs of values: a key and a value
		// we would say that we are storing "Strings keyed by Integers"
		// So it goes Map<Key, Value>
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");

		// .get returns null if the key doesn't exist in the map
		String text = map.get(1);
		System.out.println(text);

		// If a key-value pair exists and you try to assign another value to
		// that key, the value is overwritten
		// You can obviously have duplicate values, but you can't have duplicate
		// keys
		map.put(6, "Hello");
		String text2 = map.get(6);
		System.out.println(text2);

		// Syntax for iterating through a Map
		// HashMap is not sorted! There's no guarantee that you'll get the same
		// results from this loop each time.
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ": " + value);
		}

	}

}
