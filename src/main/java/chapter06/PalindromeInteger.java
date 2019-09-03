package chapter06;

import java.util.Scanner;
import java.lang.System;
import java.lang.String;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 6 for my CSC 202 class. 
 * Its function is to take in an integer input from the user and 
 * determine if that input is palindrome.
 */
public class PalindromeInteger {
    /*
    * Returns the reversal of an integer.
    * @param number serves as the value given by the user.
    * @return an int value that serves as the reverse of what was given by the user.
    */     
    public static int reverse(int number) {
        int result = 0; // Sets result to 0.
        
        // While loop that continues until number has been reversed.
        while(number > 0) {
            int remainder = number % 10; // Takes the remainder of number / 10.
            result = result * 10 + remainder; // Sets result to the reverse of number with each while loop interation.
            number = number / 10; // Divides number by 10 in each loop.
        }
        
        return result; // Returns the reverse of number.
    }
    /*
    * Returns true if number is palindrome.
    * @param number serves as the value given by the user.
    * @return true if number is the same as what is returned by PalindromeInteger.reverse(number). False otherwise.
    */ 
    public static boolean isPalindrome(int number) {    
        return number == PalindromeInteger.reverse(number); // Returns true when number is palindrome.
    }
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        // Asks the user for an input and scans said input.
        System.out.println("Enter a positive integer: ");
        int number = scan.nextInt();
        
        // If-else statement that determines whether the input is palindrome.
        if (PalindromeInteger.isPalindrome(number)) {
            System.out.println(number + " is palindrome"); // States the input is palindrome.
        }
        else {
            System.out.println(number + " is not palindrome"); // States the input is not palindrome.
        }
    }
}
