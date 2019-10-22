package chapter08;

import java.util.Scanner;

/**
 *
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 8 for my CSC 202 class.
 * The program takes in a number of 3D points and determines which one is the 
 * closest.
 */
public class FindNearestPoints3D {
    /*
    * Returns a calculation of the distance between two 3D points.
    * @param x1 serves as the first point's x-axis.
    * @param y1 serves as the first point's y-axis.
    * @param z1 serves as the first point's z-axis.
    * @param x2 serves as the second point's x-axis.
    * @param y2 serves as the second point's y-axis.
    * @param z2 serves as the second point's z-axis.
    * @return a double value for the distance between two points. 
    */
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        // Returns the distance between two 3D coordinates.
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + 
                (z2 - z1) * (z2 - z1));
    }
   /*
    * Main method for program execution.
    */
    public static void main(String[] args) {
        // Stores all 3D points in a 2D array.
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, 
            {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        
        int p1 = 0, p2 = 1; // Initializes p1 and p2.
        
        // Sets the variable shortestDistance to the distance method, which holds p1 and p2 as array rows.
        double shortestDistance = FindNearestPoints3D.distance(points[p1][0], points[p1][1], points[p1][2], 
                points[p2][0], points[p2][1], points[p2][2]);
        
        double distance; // Initializes distance.
        
        // A nested for loop that compares each point with each other to see which is closest together.
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                distance = FindNearestPoints3D.distance(points[i][0], points[i][1], points[i][2], 
                points[j][0], points[j][1], points[j][2]);
                
                // If statement that determines the two 3D points with the shortest distance.
                if(shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        // Prints out the 3D points that are of the shortest distance.
        System.out.println("The closest two points are " + "(" + points[p1][0] +
            ", " + points[p1][1] + ", " + points[p1][2] + ") and (" + points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2]+")");
    }
}