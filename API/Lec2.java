package API;

import java.time.*;

//joda time 
public class Lec2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day = date.getDayOfMonth();
        int year = date.getYear();
        System.out.println(day + " \n" + year);

        LocalTime dt = LocalTime.now();
        System.out.println(dt);

        int hour = dt.getHour();
        int mins = dt.getMinute();
        System.out.println(hour + "\n" + mins);

    }
}
