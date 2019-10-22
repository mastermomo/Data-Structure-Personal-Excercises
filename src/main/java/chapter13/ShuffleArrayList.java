package chapter13;

import java.lang.System;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Number;
import java.lang.Integer;
import java.util.Collections;
import java.util.Random;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 13 for my CSC 202 class.
 * It's function is to randomize integers 1 - 5 each run.
 */
public class ShuffleArrayList {
   /*
    * Shuffles the array list into a random order.
    * @param list represents the list of integers.
    */
    public static void shuffle(ArrayList<Number> list) {
         Collections.shuffle(list);
    }   
   
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>(); // Creates an object of ArrayList as a Number datatype.
        
        // Adds integers 1 - 5 to the array list.
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(5));
        
        ShuffleArrayList.shuffle(list); // Shuffles the integers into random order.
        
        // For loop that prints out the random order in which 
        // the integers appear in.
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
