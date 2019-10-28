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
public class Event {
    String name;
    private String place;
    Date dateTime;
    int audiance;
    
    private static int numberOfObjects;
    
    public Event(String name, String place, Date dateTime, int audiance) {
        this.name = name;
        this.place = place;
        this.dateTime = dateTime;
        this.audiance = audiance;
    }
    
    public static String getNumberOfObjects() {
        numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
}
