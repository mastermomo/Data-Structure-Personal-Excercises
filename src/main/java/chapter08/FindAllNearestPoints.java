package chapter08;

import java.util.Scanner;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 8 for my CSC 202 class.
 * The program takes in a number of points and determines which one is the 
 * closest. If multiple points match in terms of distance, they all are listed then.
 */
public class FindAllNearestPoints {
   /*
    * Returns a calculation of the distance between two 2D points.
    * @param x1 serves as the first point's x-axis.
    * @param y1 serves as the first point's y-axis.
    * @param x2 serves as the second point's x-axis.
    * @param y2 serves as the second point's y-axis.
    * @return a double value for the distance between two points. 
    */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); // Returns the distance between two 2D coordinates.
    }
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creates a scanner object.
        
        System.out.print("Enter the number of points: "); // Asks the user for how many 2D points will be used.
        int numberOfPoints = scan.nextInt(); // Scans the number of points to be used.
        
        double[][] points = new double[numberOfPoints][2]; // Creates a 2D array that will store the points to be entered.
        
        // Asks and then scans in all 2D points entered by the user.
        // Each point is then assign to it's correspoing element in the array.
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = scan.nextDouble();
            points[i][1] = scan.nextDouble();
        }
        
        int p1 = 0, p2 = 1; // Initializes points 1 and 2.
        
        // Sets the variable shortestDistance to the distance method, which holds p1 and p2 as array rows.
        double shortestDistance = FindAllNearestPoints.distance(points[p1][0], points[p1][1], 
                points[p2][0], points[p2][1]); 
        
        // Nested for loop that compares each point with each other to see which is closest together.
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], 
                        points[j][0], points[j][1]);
                
                // If statement that prints the two 2D points with the shortest distance.
                // Also prints all points that are equally shortest through the use of the nested
                // for loops.
                if(shortestDistance == distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;   
                
                // Prints out all 2D points that are of the shortest distance.
                System.out.println("The closest two points are " + "(" + points[p1][0] +
                    ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
                }
            }
        }
        // Calculates the distance between the nearest 2D points
        System.out.println("Their distance is " + FindAllNearestPoints.distance(points[p1][0], points[p1][1], 
                points[p2][0], points[p2][1])); 
    }
}