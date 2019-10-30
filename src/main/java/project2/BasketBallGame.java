package project2;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the sub class to SportEvent. It also serves
 * as the grandchild class to Event.
 */
public class BasketBallGame extends SportEvent {
    private static int numberOfObjects; // Represents the number objects of the BasketBallGame class when it's called.

    /**
     * Constructor of a basketball game.
     * @param name Represents the name of a basketball game.
     * @param place Represents the place of a basketball game.
     * @param dateTime Represents the date and time of a basketball game.
     * @param audiance Represents the audience of a basketball game.
     * @param teams Represents the teams of a basketball game.
     * @param scores Represents the scores of a basketball game.
     * @param league Represents the league of a basketball game.
     */
    public BasketBallGame(String name, String place, Date dateTime, int audiance, String[] teams, int[] scores, String league) {
        super(name, place, dateTime, audiance, league, teams, scores);
        numberOfObjects++;
    }    
    
    /**
     * Method that returns the number of times an object 
     * of the BasketBallGame class gets called.
     * @return the number value of a BesketBallGame object.
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
     * A method that shows who won. If it's a tie, a coin
     * toss is done to determine the winner.
     * @param scores
     * @return 
     */
    public static String whoWon(int[] scores) {
        if (scores[0] > scores[1]) {
            return "UR won";
        }
        if (scores[0] < scores[1]) {
            return "VCU one";
        }
        else {
            int heads = 0;
            int tails = 1;
            Random rand = new Random();
            int result = rand.nextInt(2);
            
            if (result == heads) {
                return "UR won";
            }
            else {
                return "VCU won";
            }
        } 
    }
    
    /**
     * Overrides the toString() method from the Object class
     * in order to list out all aspects of the BasketBallGame class.
     * @return a string of aspects of BasketBallGame.
     * @Override
     */
    public String toString() {
//        return String.format("[class = %s, name = %s, place = %s, date/time = %s, audience = %s] [teams = %s, scores = %s", "SoccerGame" ,
//                name, place, dateTime, audiance, Arrays.toString(teams), Arrays.toString(scores));

        return "[class = BasketBallGame" + ", name = " + name + ", place = " + place + ", date/time = " + dateTime + ", " + BasketBallGame.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [teams = " + teams[0] + " vs " + teams[1] + ", scores = " + scores[0] + " - " + scores[1] + ", " + BasketBallGame.whoWon(scores) + ", league = " + league + "]";               
    }
    
    
}
