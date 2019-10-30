package project2;

import java.util.Date;
import java.util.Calendar;

/**
 * @author Mohammad Khan
 * This class serves as a part of the 2nd project in my CSC 202 class. 
 * It is a class that was provided by the instructor.
 * It functions is to provide the code needed in the GoodWeather class.
 */
public class Week {

    public static boolean isWeekEnd(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return (calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7);
    }  // isWeekEnd()
    
    public static boolean isWeekDay(Date date) {return !(Week.isWeekEnd(date));}

}  // class Week