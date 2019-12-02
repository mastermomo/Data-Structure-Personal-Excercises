package project4;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MusicEvent extends Event {
    private String[] performers;
    
    private static final ArrayList<MusicEvent> eventList = new ArrayList<MusicEvent>();

    protected MusicEvent(String name, String place, Date dateTime, int audience, String[] performers) throws ParseException {
        super(name, place, dateTime, audience);
        this.setPerformers(performers);
        MusicEvent event = this;
        MusicEvent.eventList.add(event);
    } 

    public static ArrayList getEventList() {
        return MusicEvent.eventList;
    }

    public static int getNumberOfObjects() {
        return MusicEvent.getEventList().size();
    }

    public String[] getPerformers() {
        return this.performers;
    }

    public final void setPerformers(String[] performers) {
        this.performers = performers;
    }

    @Override  
    public String toString() {
        return super.toString() + " [performers = " + Arrays.toString(this.getPerformers()) + "]";
    }
}  