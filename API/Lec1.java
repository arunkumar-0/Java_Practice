package API;

import java.sql.Date;

//Date and Time Api 

public class Lec1 {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long date1 = dt.getTime();

        java.sql.Date dt1 = new Date(date1);
        System.out.println(dt1);
    }
}
