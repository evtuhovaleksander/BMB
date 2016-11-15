package system_class_package.interval_package;

import java.util.Date;

/**
 * Created by Allex Dark on 11.11.2016.
 */
public class Window_Interval extends Interval {
    public Master_Interval master_interval;
    public Resource_Interval resource_interval;

    public Window_Interval(int start, int stop, Date start_date, Date stop_date, Master_Interval master_interval, Resource_Interval resource_interval) {
        super(start, stop, start_date, stop_date);
        this.master_interval = master_interval;
        this.resource_interval = resource_interval;
    }


}
