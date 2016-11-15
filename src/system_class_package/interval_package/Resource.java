package system_class_package.interval_package;

import java.util.ArrayList;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Resource {
    ArrayList<Resource_Interval> blocked_intervals;
    ArrayList<Resource_Interval> free_intervals;
    int resourceID;

    public Resource(int resourceID) {
        this.resourceID = resourceID;
    }

    public void print()
    {
        System.out.println("resource "+resourceID);
        System.out.println("blocked");
        for (Resource_Interval fr:blocked_intervals) {fr.print();}
        System.out.println("free");
        for (Resource_Interval fr:free_intervals) {fr.print();}
        System.out.println("\n\n");
    }
}
