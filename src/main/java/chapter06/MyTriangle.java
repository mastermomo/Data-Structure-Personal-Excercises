package chapter06;

import java.util.Scanner;
import java.lang.Math;
import java.lang.System;
import java.lang.String;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 6 for my CSC 202 class. 
 * It takes in 3 double inputs from the user for sides of a triangle
 * and provides the area of said triangle.
 */
public class MyTriangle {
   /*
    * Returns true if the sum of every two sides is greater than the third side. False otherwise.
    * @param side1 serves as the first side of the triangle.
    * @param side2 serves as the second side of the triangle.
    * @param side3 serves as the third side of the triangle.
    * @return true or false.
    */ 
    public static boolean isValid(double side1, double side2, double side3){
        return ((side1 + side2) > side3) && ((side2 + side3) > side1) 
                && ((side1 + side3) > side2); // Returns true when the first two sides are greater than the third.
    }
   /*
    * Returns the area of the triangle.
    * @param side1 serves as the first side of the triangle.
    * @param side2 serves as the second side of the triangle.
    * @param side3 serves as the third side of the triangle.
    * @return area in double format.
    */ 
    public static double area(double side1, double side2, double side3) {
        double s = 0.5 * (side1 + side2 + side3); // Calulates s in the area fomula.
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculates the area of the triangle.
        
        return area; // Returns the area.
    }
   /*
    * Main method for program execution.
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        System.out.println("Enter three sides of a trianlge in double format: "); // Asks the user for three inputs.
        
        // Scans for the three inputs.
        double edge1 = scan.nextDouble();
        double edge2 = scan.nextDouble();
        double edge3 = scan.nextDouble();
        
        // If-else statement that determines if the user provided the correct inputs.
        if(MyTriangle.isValid(edge1, edge2, edge3)) {
            System.out.printf("Area: %.2f\n", MyTriangle.area(edge1, edge2, edge3)); // Calculates the area if the users inputs are correct.
        }
        else {
            System.out.println("Input is invalid"); // Tells the user their inputs were incorrect.
        }
        
        
    }
}
