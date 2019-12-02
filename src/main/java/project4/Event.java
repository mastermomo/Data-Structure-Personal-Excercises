package project4;

import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Mohammad Khan This class serves as a part of the 4th project in my
 * CSC 202 class. It functions as the super class to SportEvent, MusicEvent, and
 * ArtEvent. It also serves as the grandparent class to BasketBallGame,
 * SoccerGame, Concert, Orchestra.
 */
public class Event {

    // Instance variables that serve to represent general aspects 
    // of an event.
    private String name;
    private String place;
    private Date dateTime;
    private int audience;

    private static final ArrayList<Event> eventList = new ArrayList<Event>(); // Creates an ArrayList object.

    /**
     * An empty constructor.
     */
    public Event() {
    }

    /**
     * Constructor of general event.
     *
     * @param name Represents the name of an event.
     * @param place Represents the place of an event.
     * @param dateTime Represents the date and time of an event.
     * @param audience Represents the audience of an event.
     */
    public Event(String name, String place, Date dateTime, int audience) {
        this.setName(name);
        this.setPlace(place);
        this.setDateTime(dateTime);
        this.setAudience(audience);
        Event event = this;
        Event.eventList.add(event);
    }

    public static ArrayList getEventList() {
        return Event.eventList;
    }

    public static int getNumberOfObjects() {
        return Event.getEventList().size();
    }

    public String getName() {
        return this.name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return this.place;
    }

    public final void setPlace(String place) {
        this.place = place;
    }

    public Date getDateTime() {
        return this.dateTime;
    }

    public final void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getAudience() {
        return this.audience;
    }

    public final void setAudience(int audience) {
        this.audience = audience;
    }

    public String getDateTimeString() {
        return (new SimpleDateFormat("MM/dd/yyyy HH:mm")).format(this.getDateTime());
    }

    public boolean isWeekEnd() {
        return Week.isWeekEnd(this.getDateTime());
    }

    public boolean isWeekDay() {
        return Week.isWeekDay(this.getDateTime());
    }

    @Override
    public String toString() {
        return "[class = " + this.getClass().getSimpleName() + ", name = " + this.getName() + ", place = " + this.getPlace() + 
                ", date/time = " + this.getDateTimeString() + ", " + ((this.isWeekEnd()) ? "Weekend" : "Weekday") + ", audience = " + this.getAudience() + "]";
    }
}
