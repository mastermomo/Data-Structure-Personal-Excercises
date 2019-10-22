package chapter07;

import java.util.Scanner;
import java.lang.String;
import java.lang.System;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 7 for my CSC 202 class.
 * The program takes in a year from the user and calculates which 
 * Chinese zodiac animal it is.
 */
public class ChineseZodiacArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates an object of the Scanner class.
        
        // Creates an array that holds each of the Chinese zodiac animals.
        String[] animals = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", 
            "horse", "goat", "monkey", "rooster", "dog", "pig"};
        
        // Asks the user to input a year and scans it in.
        System.out.print("Enter a year: "); 
        int year = scan.nextInt();
        
        int zodiac = (year - 4) % 12; // Calulates the year's Chinese zodiac animal.
        
        // For loop that runs through each element in the animals array.
        for(int i = 0; i < animals.length; i++) {
            // If statement that checks to see if each animal matches with the 
            // year given by the user.
            if(i == zodiac) {
                System.out.println(animals[i]); // Prints out the correct Chinese zodiac year.
            }
        }
    }
}
