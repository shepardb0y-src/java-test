package Lessons;

import java.util.HashMap;

public class HashMapLesson {

	public static void main(String[] args) {
		// A Map is an object that contains key value pairs
		// It maps each key to a value and doesn't contain duplicate keys
		
		// Syntax: HashMap<Key, Value>
		
		// Create a HashMap - need to import
		// If you want to be explicit
		// HashMap<String, String> map1 = new HashMap<String, String>();
		// Initializing size can help with performance especially when working with larger amounts of data
		HashMap<String, String> map1 = new HashMap<>();
		
		// Adding key value pairs to our map
		map1.put("Teo", "villain");
		map1.put("Orella", "superhero");
		map1.put("a", "superhero");
		map1.put("b", "superhero");
		
		
		// length
		System.out.println(map1.size());
		
		// Print out our map
		System.out.println(map1);
		
		// Update our map
		// We point at the key that we want to update
		map1.put("Teo", "supervillain");
		
		// Display updates
		System.out.println(map1);
		
		// Orella kill Teo - removing by key
		map1.remove("Teo");
		
		// Display good always wins
		System.out.println(map1);
		
		// Greatest of all villains from the universe
		// Deletes everything
		map1.clear();
		
		// Display Earth No more
		System.out.println(map1);
		
		
	}

}