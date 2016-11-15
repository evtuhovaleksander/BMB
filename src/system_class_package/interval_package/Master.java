package system_class_package.interval_package;

import java.util.ArrayList;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Master {
    int masterID;
    ArrayList<Master_Interval> blocked_intervals;
    ArrayList<Master_Interval> free_intervals;
    public Master(int masterID) {
        this.masterID = masterID;
    }

    public void print()
    {
        System.out.println("master "+masterID);
        System.out.println("blocked");
        for (Master_Interval fr:blocked_intervals) {fr.print();}
        System.out.println("free");
        for (Master_Interval fr:free_intervals) {fr.print();}
        System.out.println("\n\n");
    }
}
