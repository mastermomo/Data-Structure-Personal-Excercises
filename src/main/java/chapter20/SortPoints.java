package chapter20;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Mohammad Khan
 * This class serves as a HW exercise for chapter 20 for my CSC 202 class. 
 * It also holds the main method for program execution.
 * The purpose of this program is to take in 5 predetermined 2D points and 
 * output them both in order of creation and in order of smallest to largest in 
 * regards to Y.
 */
public class SortPoints {
    /**
    * Main method for program execution.
    */
    public static void main(String[] args) {

        // Creates 5 array points.
        Point[] points = new Point[5];
        
        // Creates the predetermined
        // x and y coordinates
        // for each of the 5 points.
        points[0] = new Point();
        points[0].x = 0.9;
        points[0].y = 1.1;
        points[1] = new Point();
        points[1].x = 1.0;
        points[1].y = 0.8;
        points[2] = new Point();
        points[2].x = 0.8;
        points[2].y = 1.1;
        points[3] = new Point();
        points[3].x = 1.0;
        points[3].y = 0.9;
        points[4] = new Point();
        points[4].x = 1.0;
        points[4].y = 1.1;
        
        System.out.println("5 Points (X, Y):"); // States the points in regards to their order in the array.

        // For loop that runs until all points the array are listed.
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i].x + ", " + points[i].y);
        }

        // States the points in regards to their order of smallest to largest Y.
        System.out.println("");
        System.out.println("5 Points sorted by Y and X:");
        
        // Sorts the array by Y. A for loop
        // then runs through all points in the array and
        // prints them out.
        Arrays.sort(points, new CompareY()); 
        for (Point p : points) {
            System.out.println(p.toString());
        }

    }
}

/**
 * @author Mohammad Khan
 * This class serves to finalize point comparisons
 * and print out the results.
 */
class Point implements Comparable<Point> {

    // Instance variables to represent 
    // X and Y coordinates.
    public double x;
    public double y;

    /**
     * Overrides the compareTo method to 
     * compare the values in the points.
     * @param o An object in the comparison.
     * @return an integer to dictate what is seen in the comparison.
     */
    @Override
    public int compareTo(Point o) {

        if (x > o.x)
            return 1;
        else if (x < o.x)
            return -1;
        else if (y > o.y)
            return 1;
        else if (y < o.y)
            return -1;
        else
            return 0;
    }
    
    /**
     * Overrides the toString method to print out the 
     * points from largest to smallest Y.
     * @return a string for Y points in mind.
     */
    @Override
    public String toString() {
        return String.format("%.1f",x) + ", " + String.format("%.1f",y);
    }
}

/**
 * @author Mohammad Khan
 * This class serves to compare the Y coordinates of 
 * each point and see where they stand in the order of 
 * points.
 */
class CompareY implements Comparator<Point> {

    /**
     * Overrides the compare method to 
     * compare the values in the points.
     * @param o1 The first object in the comparision.
     * @param o2 The second object in the comparison.
     * @return an integer to dictate what is seen in the comparison.
     */
    @Override
    public int compare(Point o1, Point o2) {

        if (o1.y > o2.y)
            return 1;
        else if (o1.y < o2.y)
            return -1;
        else if (o1.x > o2.x)
            return 1;
        else if (o1.x < o2.x)
            return -1;
        else
            return 0;
    }
}