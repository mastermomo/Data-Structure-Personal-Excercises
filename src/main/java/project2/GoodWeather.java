package project2;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class. 
 * It is a class that was provided by the instructor.
 * It functions as an interface to both the SoccerGame and Concert classes.
 */
public interface GoodWeather {
    public abstract boolean isGoodWeather();  //  (Sunny) AMD (60.0 <= Temperature <= 95.0) AND (Wind Speed <= 10.0) AND (40.0% <= Humidity <= 80.0%)
}  // interface GoodWeather