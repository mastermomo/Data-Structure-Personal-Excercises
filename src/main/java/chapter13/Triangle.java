package chapter13;

/**
 * @author Mohammad Khan
 * 
 * This class serves as a HW exercise for chapter 13 for my CSC 202 class.
 * The class provides the methods and constructors needed for the main method
 * in class TestTriangle to work properly. This class also extends the abstract
 * class GeometricObject.
 */
public class Triangle extends GeometricObject {
    
    // Class level variables for triangle sides.
    private double side1;
    private double side2;
    private double side3;
    
    /**
     * Constructor that defaults the sides of a
     * triangle to 1.0. This constructor was made 
     * to meet the requirements of one of the objects
     * created in the TestTriangle class.
     */
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    /**
     * Constructor that takes in the the sides 
     * of a triangle from a user. 
     * @param side1 serves as the first side of the triangle.
     * @param side2 serves as the second side of the triangle.
     * @param side3 serves as the third side of the triangle.
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    /**
     * Overrides GeometicObject's getArea method to
     * calculate the area of a triangle.
     * @return area in double.
     * @Override
     */
    public double getArea() {
        double s = 0.5 * (side1 + side2 + side3); // Calulates s in the area fomula.
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Calculates the area of the triangle.
        
        return area; // Returns the area.
    }

    /**
     * Overrides GeometricObject's getPerimeter
     * method to calculate the perimeter of a triangle.
     * @return perimeter in double
     * @Override
     */
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3; // Calculates the perimeter of a triangle.
        
        return perimeter; // Returns the perimeter.
    }
    /**
     * Overrides GeometricObject's toString method
     * to print out double values given to the
     * sides of the triangle.
     * @return a string of the triangle sides.
     * @Override
     */
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}
