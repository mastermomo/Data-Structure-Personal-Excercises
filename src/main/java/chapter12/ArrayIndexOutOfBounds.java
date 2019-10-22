package chapter12;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.lang.ArrayIndexOutOfBoundsException;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 12 for my CSC 202 class.
 * It creates an array of 100 random integer values. The user is then asked
 * to choose an index within the array in order to receive the value that index holds.
 * If they enter an index outside of the array's bounds, an error is given to them.
 */
public class ArrayIndexOutOfBounds {
    /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        int[] data = new int[100]; // Creates an array of 100 elements.
        
        // For loop that runs until all 100 elements within
        // the array are given randomized integer values.
        for(int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 10); // Stores a random integer value in each array element.
        }
        
        System.out.println(Arrays.toString(data)); // Prints all integer values in the array.
        
        // Asks the user to input an index and takes it in.
        System.out.print("Enter an index: ");
        int index = scan.nextInt();
        
        // Try block that runs when the user enters a correct index.
        try {
            System.out.println("The element is " + data[index]); // Prints out the integer value stored in the index entered.
        }
        // Catch block that runs when the user enters an index an out
        // of bounds index.
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds"); // Error message given to the user.
        }
    }
}
