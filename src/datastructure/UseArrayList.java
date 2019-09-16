package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */ArrayList<Integer> numbers = new ArrayList<>();// Declares ArrayList of integers with name numbers

        // Add values to ArrayList
        numbers.add(34);
        numbers.add(467);
        numbers.add(89);
        numbers.add(123);
        numbers.add(345);
        System.out.println(numbers);//prints ArrayList with five values

        // Remove values from ArrayList
        numbers.remove(3); //removes value from index 3, shifts all succeeding values down one index
        System.out.println(numbers);//prints ArrayList with fourth value removed

        // Retrieve values from ArrayList
        System.out.println(numbers.get(3));//Retrieves and prints the value from ArrayList with index 3

        // Iterate through ArrayList
        //for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));//Prints out value at index i as for loop executes
        }

        //Iterator
        Iterator iterator = numbers.iterator(); //Stores ArrayList in Iterator
        while (iterator.hasNext()) { //Iterator checks to make sure there is a next value
            System.out.println(iterator.next());//Prints out next value in the Iterator
        }

    }

}
