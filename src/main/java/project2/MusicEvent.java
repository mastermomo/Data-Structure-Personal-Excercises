package project2;

import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the super class to both Concert and Orchestra classes.
 * It also serves as the subclass to Event.
 */
public class MusicEvent extends Event {
    String[] performers; // Instance variable that serves to represent an aspect of a music event.
    
    private static int numberOfObjects; // Represents the number objects of the MusicEvent class when it's called.

    /**
     * Constructor of a music event.
     * @param name Represents the name of a music event.
     * @param place Represents the place of a music event.
     * @param dateTime Represents the date and time of a music event.
     * @param audiance Represents the audience of a music event.
     * @param performers Represents the performers of a music event.
     */
    public MusicEvent(String name, String place, Date dateTime, int audiance, String[] performers) {
        super(name, place, dateTime, audiance);
        this.performers = performers;
        numberOfObjects++;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the MusicEvent class gets called.
     * @return the number value of a MusicEvent object.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
}
