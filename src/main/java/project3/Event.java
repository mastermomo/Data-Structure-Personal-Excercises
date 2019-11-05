package project3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 3rd project in my CSC 202 class.
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
    private static int numberOfObjects;
    
    private static ArrayList<Event> eventList = new ArrayList<Event>(); // Creates an ArrayList object.
    
            
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
        
        eventList.add(this); // Adds the toString of this class to the ArrayList.
        
        numberOfObjects++; // Increments this classes counter to tally the number of times this class is called on.
    }
    
    /**
     * Method that returns the number of times an object 
     * of the Event class gets called.
     * @return the number value of an Event object.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    /**
     * Returns the list of different events happening.
     * @return an ArrayList of the events.
     */
    public static ArrayList<Event> getEventList() {
        return eventList;
    }
    
    /**
     * Returns the corresponding name's of events 
     * in relation to their classes.
     * @return all event names.
     */
    public String getName() {
        return this.name; 
    }
    
    /**
     * Returns the dateTime variable in a 
     * properly formatted form.
     * @return the date and time.
     */
    public String getDateTimeString() {
        return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.dateTime);
    }
}
