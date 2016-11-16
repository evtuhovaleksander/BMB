package system_class_package.interval_package;

import org.joda.time.DateTime;

import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


public class Date_Converter {
    public static int Date_To_Index2(Date date)
    {

        long ddate2=date.getTime();

        ddate2-=date.getSeconds()*1000;
        ddate2-=date.getMinutes()*60*1000;
        ddate2-=date.getHours()*60*60*1000;

        long ddate3=date.getTime()-ddate2;
        long seconds_from_begin=ddate3/1000;
        long minutes_from_begin=seconds_from_begin/60;
        return (int)minutes_from_begin/5;
    }

    public static int Date_To_Index(String str){
        String[] strings = str.split("-");
        int temp = 0;
        temp += Integer.parseInt(strings[0])*60 + Integer.parseInt(strings[1]);
        int result = temp/5;
        return result;
    }
}
