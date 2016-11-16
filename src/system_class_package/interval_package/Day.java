package system_class_package.interval_package;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Day {
   public String date;
    public boolean bool_flags[];
    public Object obj_mas[];
    public ArrayList<Window_Interval> window_intervals;


    public Day(ArrayList<Window_Interval> intervals,String date) throws IOException {
        this.window_intervals=intervals;
        bool_flags=new boolean[288];
        obj_mas=new Object[288];
        for (int i = 0; i <288 ; i++) {
            obj_mas[i]="X";
        }


        for (int i = 0; i <window_intervals.size() ; i++) {
            for (int j = window_intervals.get(i).start; j <=window_intervals.get(i).stop ; j++) {
                bool_flags[j]=true;
                obj_mas[j]="A";
            }
        }
        this.date=date;
    }








}
