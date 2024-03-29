package project2;

import java.lang.Math;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class. 
 * It is a class that was provided by the instructor.
 * It functions is to provide the code needed in the GoodWeather class.
 */
public class Weather {

    private boolean sunny;
    private double  temperature;
    private double  windSpeed;
    private double  humidity; 

    public Weather() {}
    
    public Weather(boolean sunny, double temperature, double windSpeed, double humidity) {
        this.setSunny(sunny);
        this.setTemperature(temperature);
        this.setWindSpeed(windSpeed);
        this.setHumidity(humidity);
    }  // Weather()
    
    public final void setSunny(boolean sunny) {this.sunny = sunny;}
    public boolean    isSunny()        {return this.sunny;}

    public final void setTemperature(double temperature) {this.temperature = temperature;}
    public double     getTemperature()            {return this.temperature;}
    
    public final void setWindSpeed(double windSpeed) {this.windSpeed = windSpeed;}
    public double     getWindSpeed()          {return this.windSpeed;}
    
    public final void setHumidity(double humidity) {this.humidity = humidity;}
    public double     getHumidity()         {return this.humidity;}
    
    public double getHeatIndex() {return -42.379 + 2.04901523*getTemperature() + 10.14333127*getHumidity() - 0.22475541*getTemperature()*getHumidity() - 0.00683783*Math.pow(this.getTemperature(), 2.0) - 0.05481717*Math.pow(this.getHumidity(), 2.0) + 0.00122874*Math.pow(this.getTemperature(), 2.0)*getHumidity() + 0.00085282*getTemperature()*Math.pow(this.getHumidity(), 2.0) - 0.00000199*Math.pow(this.getTemperature(), 2.0)*Math.pow(this.getHumidity(), 2.0);}
    
    public boolean isGoodWeather() {return this.isSunny() && (this.getTemperature() >= 60.0 && this.getTemperature() <= 95.0) && this.getWindSpeed() <= 10.0 && (this.getHumidity() >= 0.4 && this.getHumidity() <= 0.8);}

    public boolean isBadWeather()  {return !(this.isGoodWeather());}
    
}  // class Weather