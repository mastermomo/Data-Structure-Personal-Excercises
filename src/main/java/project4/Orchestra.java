package project4;

import java.lang.String;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public final class Orchestra extends MusicEvent {
    private boolean casualAttire;
    
    private static final ArrayList<Orchestra> eventList = new ArrayList<Orchestra>();

    public Orchestra(String name, String place, Date dateTime, int audience, String[] performers, boolean casualAttire) throws ParseException {
        super(name, place, dateTime, audience, performers);
        this.setCasualAttire(casualAttire);
        Orchestra event = this;
        Orchestra.eventList.add(event);
    } 

    public static ArrayList getEventList() {
        return Orchestra.eventList;
    }

    public static int getNumberOfObjects() {
        return Orchestra.getEventList().size();
    }

    public boolean isCasualAttire() {
        return this.casualAttire;
    }

    public void setCasualAttire(boolean casualAttire) {
        this.casualAttire = casualAttire;
    }

    @Override  
    public String toString() {
        return super.toString() + " [" + ((this.isCasualAttire()) ? "Casual Attire" : "Formal Attire") + "]";
    }

}