package project3;

import java.util.ArrayList;
import java.util.Arrays;
import project2.*;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 3rd project in my CSC 202 class.
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
    
    private static ArrayList<Concert> eventList = new ArrayList<Concert>(); // Creates an ArrayList object.

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
        
        eventList.add(this); // Adds the toString of this class to the ArrayList.
        
        numberOfObjects++; // Increments this classes counter to tally the number of times this class is called on.
    }
    
    /**
     * Setter for the weather variable.
     * @param weather Represents the weather of the event.
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }
    
    /**
     * Getter for the weather variable.
     * @return the weather of the event.
     */
    public Weather getWeather() {
        return this.weather;
    }
    /**
     * Overrides the isGoodWeather method from GoodWeather class
     * to determine what constitutes "good weather" for this event.
     * @return return true of false
     * @Override 
     */
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;
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
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the Concert class.
     * @return a string of aspects of Concert.
     * @Override
     */
    public String toString() {
        return "[class = Concert" + ", name = " + name + ", place = " + place + ", date/time = " + this.getDateTimeString() + ", " + Concert.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [performers = " + "" + Arrays.toString(this.performers) + "][type = " + type + ", " + (this.isGoodWeather() ? "Good Weather" : "Bad Weather") + "]";               
    }
}
