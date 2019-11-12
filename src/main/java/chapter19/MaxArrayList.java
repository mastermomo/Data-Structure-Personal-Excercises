package chapter19;

import java.util.ArrayList;

/**
 * @author Mohammad Khan This class serves as a HW exercise for chapter 19 for
 * my CSC 202 class. It functions to take an unordered array of integers and
 * orders them from smallest to largest. The largest integer in the array is
 * then shown to the user.
 */
public class MaxArrayList {
    
   /**
    * Main method for program execution.
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Creates an ArrayList object.

        // Adds four integer values to the array list.
        list.add(new Integer(8));
        list.add(new Integer(9));
        list.add(new Integer(4));
        list.add(new Integer(5));

        System.out.println("Max: " + MaxArrayList.<Integer>max(list)); // Prints out the largest integer in the array list to the user.
    }

    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        // Variables to keep track of the current
        // smallest value in the array list.
        E currentMin;
        int currentMinIndex;

        // For loop that runs until all integers
        // are sorted.
        for (int i = 0; i < list.size() - 1; i++) {
            currentMin = list.get(i); // Sets the current smallest value to what index i is.
            currentMinIndex = i; // Sets index i as the smallest index.

            // For loop that runs until the current index is given the
            // proper integer value in the array list of smallest to largest.
            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j); // Sets the current smallest value to what index j is.
                    currentMinIndex = j; // Sets index j as the smallest index.
                }
            }

            // If statement that resets the index and minimum 
            // integer for when the outer for loop runs again.
            if (list.get(currentMinIndex) != list.get(i)) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
        return list.get(list.size() - 1);
    }
}
