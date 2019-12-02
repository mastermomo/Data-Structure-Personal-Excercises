package project4;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 4th project in my CSC 202 class.
 * It functions as the sub class to SportEvent. It also serves
 * as the grandchild class to Event.
 */
public final class BasketBallGame extends SportEvent {

    private static final ArrayList<BasketBallGame> eventList = new ArrayList<BasketBallGame>(); // Creates an ArrayList object.
   
    /**
     * Constructor of a basketball game.
     * @param name Represents the name of a basketball game.
     * @param place Represents the place of a basketball game.
     * @param dateTime Represents the date and time of a basketball game.
     * @param audience Represents the audience of a basketball game.
     * @param teams Represents the teams of a basketball game.
     * @param scores Represents the scores of a basketball game.
     * @param league Represents the league of a basketball game.
     * @throws java.text.ParseException
     */
    public BasketBallGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
        BasketBallGame event = this;
        BasketBallGame.eventList.add(event);
    }

    /**
     * Method that returns the list of events.
     * @return BasketBallGame's event list.
     */
    public static ArrayList getEventList() {
        return BasketBallGame.eventList;
    }  

    /**
     * Method that returns the number of times an object 
     * CHANGE TO PROJECT 3 CODE???
     * @return the number value of an BasketBallGame object.
     */
    public static int getNumberOfObjects() {
        return BasketBallGame.getEventList().size();
    }  

    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the ArtEvent class.
     * @return a string of aspects of BasketBallGame. 
     */
    @Override
    public String toString() {
        return super.toString();
    }
} 