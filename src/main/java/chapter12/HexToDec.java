package chapter12;

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.lang.System;
import java.lang.String;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 12 for my CSC 202 class.
 * It takes in a hex number from the user and coverts it to a decimal number.
 * If the user enters an input that isn't a hex number, an error is given to the user.
 */
public class HexToDec {
   /*
    * Returns the decimal value of a hex number.
    * @param hex represents the hex number given by the user.
    * @return a decimal value.
    */ 
    public static int hexToDecimal(String hex) {
        int decimalValue = 0; // Initalizes the decimal value to 0.
        char hexChar; // Creates a character variable.
        
        // For loop that runs until the hex string is
        // completely coverted to a decimal.
        for(int i = 0; i < hex.length(); i++) {
            hexChar = hex.charAt(i); // intailizes hexChar to the character located at position i.
            decimalValue = decimalValue * 16 + HexToDec.hexCharToDecimal(hexChar); // Initializes decimalValue to a new value, which is calulated in each foor loop.
        }
        return decimalValue; // Returns the converted decimal value.
    }
   /*
    * Returns a decimal value for a hex character.
    * @param ch represents the individual characters.
    * @return a decimal value.
    */
    public static int hexCharToDecimal(char ch) {
        // if-else statement that calculates the decimal value
        // based on what character is given.
        if(ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        }
        else {
            return ch - '0';   
        }
    }
    /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        // Prompts the user to enter a hex number and
        // takes it in.
        System.out.print("Enter a hex number: "); 
        String hex = scan.nextLine();
        
        // Try block that provides the calculated decimal value.
        try {
            System.out.println("Decimal: " + HexToDec.hexToDecimal(hex));
        }
        // Catch block that gives an error to the user if an incorrect input
        // is given.
        catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
