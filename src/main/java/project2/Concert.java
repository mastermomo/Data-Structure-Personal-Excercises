package project2;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the sub class to MusicEvent. It also serves
 * as the grandchild class to Event. Finally, it also is a concrete class
 * to the GoodWeather interface.
 */
public class Concert extends MusicEvent implements GoodWeather{
    // Instance variables that serves to represent the weather and 
    // type of a concert.
    private String type;
    private Weather weather;
    
    private static int numberOfObjects; // Represents the number objects of the Concert class when it's called.

    /**
     * Constructor of a concert.
     * @param name Represents the name of a concert.
     * @param place Represents the place of a concert.
     * @param dateTime Represents the date and time of a concert.
     * @param audiance Represents the audience of a concert.
     * @param performers Represents the teams of a concert.
     * @param type Represents the type of concert.
     * @param weather Respresents the weather of a concert.
     */
    public Concert(String name, String place, Date dateTime, int audiance, String[] performers, String type, Weather weather) {
        super(name, place, dateTime, audiance, performers);
        this.type = type;
        this.weather = weather;
        numberOfObjects++;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the Concert class gets called.
     * @return the number value of a Concert object.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Overrides the isGoodWeather() method from the Weather class
     * for a concert.
     * @return boolean of weather conditions.
     * @Override
     */
    public boolean isGoodWeather() {
        Weather checkWeather = new Weather();
        return checkWeather.isSunny() && (checkWeather.getTemperature() >= 60.0 && checkWeather.getTemperature() <= 95.0) && checkWeather.getWindSpeed() <= 10.0 && (checkWeather.getHumidity() >= 0.4 && checkWeather.getHumidity() <= 0.8);
    }
    
    /**
     * Method that returns a string that shows 
     * whether it's the weekday or weekend.
     * @param date Represents the date that will be used to check whether it's the weekend or not.
     * @return a string notifying a weekday or weekend.
     */
    public static String isWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) {
            return "Weekend";
        }
        else {
            return "Weekday";
        }   
    }
    
    /**
     * Method that returns the list of performers
     * to be at the concert.
     * @param performers Represents the performers of the concert.
     * @return  An array of strings.
     */
    public static String performerList(String[] performers) {
        for (int i = 0; i <= performers.length; i++) {
            if (performers.length > 1) {
                return performers[i] + ", ";
            }    
            else {
                return performers[i];
            }
        }
        return "]";
    }
    
    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the Concert class.
     * @return a string of aspects of Concert.
     * @Override
     */
    public String toString() {
        return "[class = Concert" + ", name = " + name + ", place = " + place + ", date/time = " + dateTime + ", " + Concert.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [performers = " + "[" + Concert.performerList(performers) + "][type = " + type + ", " + weather + "]";               
    }
}
