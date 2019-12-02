package project4;

import java.lang.String;
import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;

import project4.GoodWeather;

public final class SoccerGame extends SportEvent implements GoodWeather {
    private Weather weather;
    
    private static final ArrayList<SoccerGame> eventList = new ArrayList<SoccerGame>();

    public SoccerGame(String name, String place, Date dateTime, int audience, String[] teams, int[] scores, String league, Weather weather) throws ParseException {
        super(name, place, dateTime, audience, teams, scores, league);
        this.setWeather(weather);
        SoccerGame event = this;
        SoccerGame.eventList.add(event);
    }

    public static ArrayList getEventList() {
        return SoccerGame.eventList;
    }

    public static int getNumberOfObjects() {
        return SoccerGame.getEventList().size();
    }

    public Weather getWeather() {
        return this.weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public boolean isGoodWeather() {
        return this.getWeather().isGoodWeather() && this.getWeather().getHeatIndex() <= 90.0;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + ((this.isGoodWeather()) ? "Good Weather" : "Bad Weather") + "]";
    }

}
