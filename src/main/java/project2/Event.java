package project2;

import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the super class to SportEvent, MusicEvent, and ArtEvent.
 * It also serves as the grandparent class to BasketBallGame, SoccerGame,
 * Concert, Orchestra.
 */
public class Event {
    // Instance variables that serve to represent general aspects 
    // of an event.
    String name;
    String place;
    Date dateTime;
    int audiance;
    
    private static int numberOfObjects; // Represents the number objects of the Event class when it's called.
    
    /**
     * Constructor of general event.
     * @param name Represents the name of an event.
     * @param place Represents the place of an event.
     * @param dateTime Represents the date and time of an event.
     * @param audiance Represents the audience of an event.
     */
    public Event(String name, String place, Date dateTime, int audiance) {
        this.name = name;
        this.place = place;
        this.dateTime = dateTime;
        this.audiance = audiance;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the Event class gets called.
     * @return the number value of an Event object.
     */
    public static int getNumberOfObjects() {
        numberOfObjects++;
        return numberOfObjects;
    }
}
