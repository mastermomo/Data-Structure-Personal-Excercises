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
public class Concert extends MusicEvent implements GoodWeather{
    private String type;
    private Weather weather;
    
    private static int numberOfObjects;

    public Concert(String name, String place, Date dateTime, int audiance, String[] performers, String type, Weather weather) {
        super(name, place, dateTime, audiance, performers);
        this.type = type;
        this.weather = weather;
    }
    
    public static String getNumberOfObjects() {
        //numberOfObjects++;
        return Integer.toString(numberOfObjects);
    }

    @Override
    public boolean isGoodWeather() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
