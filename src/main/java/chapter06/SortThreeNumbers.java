package chapter06;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 6 for my CSC 202 class.
 * The program sorts three double inputs from the user in increasing order.
 */
public class SortThreeNumbers {
   /*
    * Sorts three values in increasing order.
    * @param num1 serves as the first input from the user.
    * @param num2 serves as the second input from the user.
    * @param num3 serves as the third input from the user.
    */ 
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        // Sorts withs num1 being the largest value of the three input.
        if ((num1 > num2) && (num1 > num3)) {
            // Sorts with num2 being larger than num3.
            if (num2 > num3) {
                System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1); // Shows the order to the user.
            }
            // Sorts with num3 being larger than num2.
            else if (num3 > num2){
                System.out.println("The sorted numbers are " + num2 + " " + num3 + " " + num1); // Shows the order to the user.
            }
        }
        // Sorts withs num2 being the largest value of the three input.
        else if ((num2 > num1) && (num2 > num3)) {
            // Sorts with num1 being larger than num3.
            if (num1 > num3){
                System.out.println("The sorted numbers are " + num3 + " " + num1 + " " + num2); // Shows the order to the user.
            }
            // Sorts with num3 being larger than num1.
            else if (num3 > num1) {
                System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2); // Shows the order to the user.
            }
        }
        // Sorts withs num3 being the largest value of the three input.
        else if ((num3 > num1) && (num3 > num2)) {
            // Sorts with num1 being larger than num2.
            if (num1 > num2) {
                System.out.println("The sorted numbers are " + num2 + " " + num1 + " " + num3); // Shows the order to the user.
            }
            // Sorts with num2 being larger than num1.
            else if (num2 > num1) {
                System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3); // Shows the order to the user.

            }
        }
        // Else statement that runs when the user doesn't provide the correct inputs.
        else {
            System.out.println("Invalid data has been given.");
        }
    }
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        
        // Asks the user for 3 inputs and scans those inputs.
        System.out.println("Enter three values: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        
        SortThreeNumbers.displaySortedNumbers(num1, num2, num3); // Runs the displaySortedNumbers method.
    }
}
