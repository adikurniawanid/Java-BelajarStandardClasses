package id.akdev.datecalender;

import java.util.Calendar;
import java.util.Date;

public class DateAndCalenderApp {
    public static void main(String[] args) {
        //date
        Date tanggal = new Date();
        System.out.println(tanggal);

        //calender
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,2020);
        calendar.add(Calendar.YEAR,-20);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DATE,21);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
