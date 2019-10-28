/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author eleme
 */
public class SoccerGame extends SportEvent implements GoodWeather {
    private Weather weather;
    
    private static int numberOfObjects;

    SoccerGame(String name, String place, Date dateTime, int audiance, String[] teams, int[] scores, String league, Weather weather) {
        super(name, place, dateTime, audiance, league, teams, scores);
        this.weather = weather;
    }
    
    public static String getNumberOfObjects() {
        // numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
    
    @Override
    public boolean isGoodWeather() {
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("[class = %s, name = %s, place = %s, dateTime = %s, audience = %s] [teams = %s, scores = %s", "SoccerGame" ,name,
            league, dateTime, audiance, Arrays.toString(teams), Arrays.toString(scores));
}
}
