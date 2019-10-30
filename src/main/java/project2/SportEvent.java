package project2;

import java.util.Date;


/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the super class to both BasketBallGame and SoccerGame classes.
 * It also serves as the subclass to Event.
 */
public class SportEvent extends Event {
    // Instance variables that serve to represent aspects 
    // of a sport event.
    String league;
    String[] teams = new String[2];
    int[] scores = new int[2];
    
    private static int numberOfObjects; // Represents the number objects of the SportEvent class when it's called.
    
    /**
     * Constructor of a sport event.
     * @param name Represents the name of a sports event.
     * @param place Represents the place of a sports event.
     * @param dateTime Represents the date and time of a sports event.
     * @param audiance Represents the audience of a sports event.
     * @param league Represents the name of a sports league.
     * @param teams Represents the name of the sports teams.
     * @param scores Represents the scores of sports teams. 
     */
    public SportEvent(String name, String place, Date dateTime, int audiance, String league, String[] teams, int[] scores) {
        super(name, place, dateTime, audiance);
        this.league = league;
        this.teams = teams;
        this.scores = scores;
        numberOfObjects++;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the SportEvent class gets called.
     * @return the number value of a SportEvent object.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
