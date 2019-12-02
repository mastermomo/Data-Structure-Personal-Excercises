package project4;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 4th project in my CSC 202 class.
 * It functions as the sub class to MusicEvent. It also serves
 * as the grandchild class to Event. Finally, it also is a concrete class
 * to the GoodWeather interface.
 */
public final class Concert extends MusicEvent implements GoodWeather {

    private String type; // Instance variable that serves to represent an aspect of an concert event.
    private Weather weather; // Instance variable that serves to represent the weather for the concert event.
    
    private static final ArrayList<Concert> eventList = new ArrayList<Concert>(); // Creates an ArrayList object.

    /**
     * Constructor of a concert.
     * @param name Represents the name of a concert.
     * @param place Represents the place of a concert.
     * @param dateTime Represents the date and time of a concert.
     * @param audience Represents the audience of a concert.
     * @param performers Represents the teams of a concert.
     * @param type Represents the type of concert.
     * @param weather Represents the weather of a concert.
     */
    public Concert(String name, String place, Date dateTime, int audience, String[] performers, String type, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setType(type); this.setWeather(weather);
        Concert event = this;
        Concert.eventList.add(event);
    }

    /**
     * Method that returns the list of events.
     * @return Concert's event list.
     */
    public static ArrayList getEventList() {
        return Concert.eventList;
    }

    /**
     * Method that returns the number of times an object 
     * @return the number value of an Concert object.
     */
    public static int getNumberOfObjects() {
        return Concert.getEventList().size();
    }

    /**
     * Returns the type of this class.
     * @return Returns the type Concert.
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * Sets the type as Concert.
     * @param type Represents the Concert class.
     */
    public final void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the weather of this class.
     * @return weather of a concert.
     */
    public Weather getWeather() {
        return this.weather;
    }

    /**
     * Sets the weather of a concert.
     * @param weather Represents the weather.
     */
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    /**
     * Determines if the weather is good or not.
     * @return a booean for the weather conditions.
     */
    @Override  
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather();
    }

    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the Concert class.
     * @return a string of aspects of Concert. 
     */
    @Override  
    public String toString() {
        return super.toString() + "[type = " + this.getType() + ", " + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";
    }
    

}  