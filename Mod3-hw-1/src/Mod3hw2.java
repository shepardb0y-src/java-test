import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mod3hw2 {
	public static void isArrayEmpty (ArrayList array) {
        if(array.size() > 0) {
            System.out.println("Not empty!");
        }
        else {
            System.out.println("It's empty.");
        }
    }

	public static void main(String[] args) {
//      Write a Java program to copy one array list into another

        ArrayList<String> original = new ArrayList<> ();
        original.add("1, 2, 3, 4, 5");
        ArrayList<String> copy = (ArrayList<String>) original.clone();
//        System.out.println("This is the copy: " + copy);

//    Write a Java program to extract a portion of an array list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("apples", "bananas", "oranges"));
        System.out.println(fruits);

       List<String> extract = fruits.subList(0, 1);
       System.out.println("This is the extracted array: " +  extract);
        System.out.println("This is the extracted array: " +  fruits);

        extract.add("Tomato");
        System.out.println("Mutated? " +  extract);
        System.out.println("Mutated? " +  fruits);

//    Write a Java program of swap two elements in an array list
        ArrayList<String> animals = new ArrayList<>();
        animals.addAll(Arrays.asList("cats", "dogs", "hamsters", "giraffes", "birds", "sharks"));
        System.out.println("Original: " + animals);

        Collections.swap(animals, 1, 5);
        System.out.println("Swapped: " + animals);

//    Write a Java program to test an array list is empty or not
        ArrayList<String> empty = new ArrayList<>();
        isArrayEmpty(empty);
        isArrayEmpty(animals);

//    Write a Java program to replace the second element of an ArrayList with the specified element.
        animals.set(1, "lion");
        System.out.println(animals);
//    Write a Java program to trim the capacity of an array list the current list size
//  // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(8);
  
    
        arr.add(0);
        arr.add(7);
        arr.add(16);
        arr.add(6);
        arr.add(11);
  
        // trims the size to the number of elements
        arr.trimToSize();
  
        System.out.println("The List elements are:");
  
        // prints all the elements
        for (Integer number : arr) {
            System.out.println("Number = " + number);
        }
    }
//    Write a Java program to test a hash set is empty or not.
//
//            Write a Java program to get the number of elements in a hash set
//
//    Write a Java program to iterate through all elements in a hash list.
//
//            Write a Java program to convert a hash set (key-value pair) to an array.
//
//            Write a Java program to compare two sets and retain elements that are the same on both sets.
	}


