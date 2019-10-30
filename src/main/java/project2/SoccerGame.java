package project2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class.
 * It functions as the sub class to SportEvent. It also serves
 * as the grandchild class to Event. Finally, it also is a concrete class
 * to the GoodWeather interface.
 */
public class SoccerGame extends SportEvent implements GoodWeather {
    private Weather weather; // Instance variable that serve to represent the weather of a soccer game.
    
    private static int numberOfObjects; // Represents the number objects of the SoccerGame class when it's called.

    /**
     * Constructor of a soccer game.
     * @param name Represents the name of a soccer game.
     * @param place Represents the place of a soccer game.
     * @param dateTime Represents the date and time of a soccer game.
     * @param audiance Represents the audience of a soccer game.
     * @param teams Represents the teams of a soccer game.
     * @param scores Represents the scores of a soccer game.
     * @param league Represents the league of a soccer game.
     * @param weather Represents the weather of a soccer game.
     */
    SoccerGame(String name, String place, Date dateTime, int audiance, String[] teams, int[] scores, String league, Weather weather) {
        super(name, place, dateTime, audiance, league, teams, scores);
        this.weather = weather;
        numberOfObjects++;
    }
    
    /**
     * Method that returns the number of times an object 
     * of the SoccerGame class gets called.
     * @return the number value of a SoccerGame object.
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    
    /**
     * Overrides the isGoodWeather() method from the Weather class
     * for a soccer game.
     * @return boolean of weather conditions.
     * @Override
     */
    public boolean isGoodWeather() {
        Weather checkWeather = new Weather();
        return checkWeather.isSunny() && (checkWeather.getTemperature() >= 60.0 && checkWeather.getTemperature() <= 95.0) && checkWeather.getWindSpeed() <= 10.0 
                && (checkWeather.getHumidity() >= 0.4 && checkWeather.getHumidity() <= 0.8);  
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
     * in order to list out all aspects of the SoccerGame class.
     * @return a string of aspects of SoccerGame.
     * @Override
     */
    public String toString() {
       return "[class = SoccerGame" + ", name = " + name + ", place = " + place + ", date/time = " + dateTime + ", " + SoccerGame.isWeekEnd(dateTime) + ", audience = " + audiance + 
                "] [teams = " + teams[0] + " vs " + teams[1] + ", scores = " + scores[0] + " - " + scores[1] + ", " + SoccerGame.whoWon(scores) + ", league = " 
               + league + "] [" + weather + "]";               
    }
}
