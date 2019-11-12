package chapter18;

import java.lang.System;
import java.lang.String;
import java.util.*;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 18 for my CSC 202 class.
 * The program takes an integer input that represents an index 
 * and provides the Fibonacci number in return. It also prints out
 * the number of times the method that calculates the Fibonacci number
 * is called.
 */
public class FibonacciSeries {
    public static int count = 0; // Instance variable that sets the method counter to 0.
    
   /**
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a Scanner object.
        
        // Asks for an index from the user and takes it in.
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = scan.nextInt();
        
        // Prints out the Fibonacci number and the number of times the 
        // fib method is called to calculate the Fibonacci number.
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
        System.out.println("Number of times fib is invoked? " + count);
    }
    
    /**
     * Calculates the Fibonacci number from the index given
     * by the user.
     * @param index integer index given by the user.
     * @return the Fibonacci number as a long value.
     */
    private static long fib(long index) {
        count++; // Increments each time this method is called.
        
        // If-else statement that calculates and returns the correct 
        // Fibonacci number back to the user.
        if(index == 0) {
            return 0;
        }
        else if(index == 1) {
            return 1;
        }
        else {
            return fib(index - 1) + fib(index - 2);
        }
    }
}
