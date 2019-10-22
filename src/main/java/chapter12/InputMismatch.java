package chapter12;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;
import java.util.InputMismatchException;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 12 for my CSC 202 class.
 * It takes in two integer values from the user and provides the sum. If the 
 * user provides anything besides integers, an error is given through a try-catch
 * block. The user is then prompted to renter their two values as integers. 
 */
public class InputMismatch {
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        System.out.print("Enter two integers: "); // Asks the user to enter two integer values
        
        boolean done = false; // Sets a boolean to false for a while loop later in the code.
        
        // Initializes two integer variables to 0.
        int n1 = 0;
        int n2 = 0;
        
        // While loop that continues to run as long as the user doesn't enter two 
        // integer values.
        while(!done) {
           // Try block that runs and causes the while loop to 
           // end when the user enters two integer values.
           try {
              n1 = scan.nextInt(); // scans for the first integer.
              n2 = scan.nextInt(); // scans for the second integer.
              done = true; // sets the boolean to true to break out of the while loop.
           }
           // Catch block that runs when the user doesn't enter two integers.
           catch(InputMismatchException e) {
               System.out.print("Incorrect input please re-enter two integers: "); // Asks the user to re-enter two integers.
               
               // Scans for the next two inputs from the user.
               scan.next();
               scan.next();
           }
        }
        int sum = n1 + n2; // Adds the two integer values.
        System.out.println("Sum is " + sum); // States what the sum is.
    }
}
