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
public class MusicEvent extends Event {
    private String[] performers;
    
    private static int numberOfObjects;

    public MusicEvent(String name, String place, Date dateTime, int audiance, String[] performers) {
        super(name, place, dateTime, audiance);
        this.performers = performers;
    }
    
    public static String getNumberOfObjects() {
        numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
    
}
