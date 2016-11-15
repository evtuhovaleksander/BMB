package system_class_package.interval_package;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Day {
   String date;
    boolean bool_flags[];
    ArrayList<Window_Interval> window_intervals;


    public Day(ArrayList<Window_Interval> intervals,String date) {
        this.window_intervals=intervals;
        bool_flags=new boolean[288];
        for (int i = 0; i <window_intervals.size() ; i++) {
            for (int j = window_intervals.get(i).start; j <=window_intervals.get(i).stop ; j++) {
                bool_flags[j]=true;
            }
        }
        this.date=date;
    }

}
