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
public class SportEvent extends Event {
    String league;
    String[] teams = new String[2];
    int[] scores = new int[2];
    
    private static int numberOfObjects;
    
    public SportEvent(String name, String place, Date dateTime, int audiance, String league, String[] teams, int[] scores) {
        super(name, place, dateTime, audiance);
        this.league = league;
        this.teams = teams;
        this.scores = scores;
    }
    
    public static String getNumberOfObjects() {
        numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
}
