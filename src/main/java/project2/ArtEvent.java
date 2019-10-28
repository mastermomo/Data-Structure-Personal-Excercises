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
public class ArtEvent extends Event {
    private String type;
    
    private static int numberOfObjects;

    public ArtEvent(String name, String place, Date dateTime, int audiance, String type) {
        super(name, place, dateTime, audiance);
        this.type = type;
    }
    
    public static String getNumberOfObjects() {
        numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
}
