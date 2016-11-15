package system_class_package.interval_package;

import java.util.Date;

/**
 * Created by Allex Dark on 11.11.2016.
 */
public class Resource_Interval extends Interval{
int ResouceID;

    public Resource_Interval(Date start_date, Date stop_date, int resouceID) {
        super(start_date, stop_date);
        ResouceID = resouceID;
    }

    public Resource_Interval(int start, int stop, int resouceID) {
        super(start, stop);
        ResouceID = resouceID;
    }
}
