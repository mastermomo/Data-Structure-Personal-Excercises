package project3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 3rd project in my CSC 202 class.
 * It functions as the sub class to the Event class.
 */
public class ArtEvent extends Event {
    private String type; // Instance variable that serves to represent an aspect of an art event.
    private static int numberOfObjects; // Represents the number objects of the ArtEvent class when it's called.
    
    private static ArrayList<ArtEvent> eventList = new ArrayList<ArtEvent>(); // Creates an ArrayList object.

    /**
     * Constructor of an art event.
     * @param name Represents the name of an art event.
     * @param place Represents the place of an art event.
     * @param dateTime Represents the date and time of an art event.
     * @param audiance Represents the audience of an art event.
     * @param type Represents the type of an art event.
     */
    public ArtEvent(String name, String place, Date dateTime, int audiance, String type) {
        super(name, place, dateTime, audiance);
        this.type = type;
        
        eventList.add(this); // Adds the toString of this class to the ArrayList.
        
        numberOfObjects++; // Increments this classes counter to tally the number of times this class is called on.
    }
    
    /**
     * Method that returns the number of times an object 
     * of the ArtEvent class gets called.
     * @return the number value of an ArtEvent object.
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
     * in order to list out all aspects of the ArtEvent class.
     * @return a string of aspects of ArtEvent.
     * @Override
     */
    public String toString() {
        return "[class = ArtEvent" + ", name = " + name + ", place = " + place + ", date/time = " + this.getDateTimeString() + ", " + ArtEvent.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [type = " + type + "]";               
    }
}
