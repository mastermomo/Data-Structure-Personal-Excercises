/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Date;

/**
 *
 * @author eleme
 */
public class BasketBallGame extends SportEvent {
    private static int numberOfObjects; 

    public BasketBallGame(String name, String place, Date dateTime, int audiance, String[] teams, int[] scores, String league) {
        super(name, place, dateTime, audiance, league, teams, scores);
    }    
    
    public static String getNumberOfObjects(String name, String place, Date dateTime, int audiance, String[] teams, int[] scores, String league) {
        numberOfObjects++; 
        return Integer.toString(numberOfObjects);
    }
}
