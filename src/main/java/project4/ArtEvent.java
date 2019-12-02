package project4;

import java.lang.String;
import java.text.ParseException;
import java.util.*;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 4th project in my CSC 202 class.
 * It functions as the sub class to the Event class.
 */
public final class ArtEvent extends Event {

    private String type; // Instance variable that serves to represent an aspect of an art event.
    
    private static final ArrayList<ArtEvent> eventList = new ArrayList<ArtEvent>(); // Creates an ArrayList object.
   
    /**
     * Constructor of an art event.
     * @param name Represents the name of an art event.
     * @param place Represents the place of an art event.
     * @param dateTime Represents the date and time of an art event.
     * @param audience Represents the audience of an art event.
     * @param type Represents the type of an art event.
     * @throws java.text.ParseException
     */
    public ArtEvent(String name, String place, Date dateTime, int audience, String type) throws ParseException {
        super(name, place, dateTime, audience);
        this.setType(type);
        ArtEvent event = this;
        ArtEvent.eventList.add(event);
    }

    /**
     * Method that returns the list of events.
     * @return ArtEvent's event list.
     */
    public static ArrayList getEventList() {
        return ArtEvent.eventList;
    }

    /**
     * Method that returns the number of times an object 
     * CHANGE TO PROJECT 3 CODE???
     * @return the number value of an ArtEvent object.
     */
    public static int getNumberOfObjects() {
        return ArtEvent.getEventList().size();
    }
    
    /**
     * Returns the type of this class.
     * @return Returns the type ArtEvent.
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * Sets the type as ArtEvent.
     * @param type Represents the ArtEvent class.
     */
    public final void setType(String type) {
        this.type = type;
    }

    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the ArtEvent class.
     * @return a string of aspects of ArtEvent. 
     */
    @Override
    public String toString() {return super.toString() + " [type = " + this.getType() + "]";}

}