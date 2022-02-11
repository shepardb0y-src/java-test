package Lessons;

import java.util.ArrayList;

public class ArrayListLesson {

	public static void main(String[] args) {
		// ArrayList are resizable which is different from the built-in array where you can't resize the array
		// Instantiating ArrayList gives us access to built-in methods
		
		// Creating ArrayList
		// We need to import
		// We can omit the String argument when we are instantiating the ArrayList
		// ArrayList<String> cars = new ArrayList<String>();
		
		// History: Once upon a time, ArrayList were not specific - JDK 1.5
		// ArrayList cars = new ArrayList(); - might be off a little bit
		ArrayList<String> cars = new ArrayList<>();
		
		// Add items
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Ford");
		
		// Adding items by index
		cars.add(1, "Lexus");
		
		// Printing our ArrayList
		System.out.println(cars);
		
		// Add two arrays together
		ArrayList<String> cars2 = new ArrayList<>();
		
		cars2.add("BMW");
		cars2.add("Tesla");
		
		System.out.println(cars2);
		
		ArrayList<String> cars3 = new ArrayList<>();
		cars3.add("Nissan");
		
		cars3.addAll(cars);
		cars3.addAll(cars2);
		
		// Add arrays together
		cars.addAll(cars2);
		
		// Reprint our cars
		System.out.println(cars3);
		
		// Grabbing size of array
		System.out.println(cars.size());
		
		// Clearing our array
		cars3.clear();
		
		System.out.println("Cars3 " + cars3);
		
		// Cloning array - shallow copy
		ArrayList<String> cars4 = (ArrayList<String>) cars.clone();
		System.out.println(cars4);
	}

}