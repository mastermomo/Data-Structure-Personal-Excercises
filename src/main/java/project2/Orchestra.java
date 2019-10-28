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
public class Orchestra extends MusicEvent {
    private boolean casualAttire;
    
    private static int numberOfObjects;

    public Orchestra(String name, String place, Date dateTime, int audiance, String[] performers, boolean casualAttire) {
        super(name, place, dateTime, audiance, performers);
        this.casualAttire = casualAttire;
    }
    
    public static String getNumberOfObjects() {
        //numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }
}
