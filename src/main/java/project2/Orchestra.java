package project2;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the sub class to MusicEvent. It also serves
 * as the grandchild class to Event.
 */
public class Orchestra extends MusicEvent {
    private boolean casualAttire; // Instance variable that serves to represent the attire for an orchestra.
    
    private static int numberOfObjects; // Represents the number objects of the Orchestra class when it's called.

    /**
     * Constructor of an orchestra.
     * @param name Represents the name of an orchestra.
     * @param place Represents the place of an orchestra.
     * @param dateTime Represents the date and time of an orchestra.
     * @param audiance Represents the audience of an orchestra.
     * @param performers Represents the teams of an orchestra.
     * @param casualAttire Represents the attire for an orchestra.
     */
    public Orchestra(String name, String place, Date dateTime, int audiance, String[] performers, boolean casualAttire) {
        super(name, place, dateTime, audiance, performers);
        this.casualAttire = casualAttire;
        numberOfObjects++;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the Orchestra class gets called.
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
     * Method that returns the list of performers
     * to be at the orchestra.
     * @param performers Represents the performers of the orchestra.
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
    * Method that checks to see if 
    * causal attire is needed for the 
    * orchestra.
    * @param casualAttire Represents whether casual attire is allowed or not at the orchestra.
    * @return true or false.
    */
    public static String casualAttireCheck(boolean casualAttire) {
        if (casualAttire = true) {
            return "Casual Attire";
        }
        else {
            return "No Casual Attire";
        }
    }
    
    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the Orchestra class.
     * @return a string of aspects of Orchestra.
     * @Override
     */
    public String toString() {
        return "[class = Orchestra" + ", name = " + name + ", place = " + place + ", date/time = " + dateTime + ", " + Orchestra.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [performers = " + "["+ Orchestra.performerList(performers) + "]] [" + Orchestra.casualAttireCheck(casualAttire) + "]";               
    }
}
