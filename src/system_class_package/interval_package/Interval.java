package system_class_package.interval_package;

import java.util.Date;

/**
 * Created by Allex Dark on 11.11.2016.
 */
public class Interval extends Quantum_Interval {
    Date start_date;
    Date stop_date;


    public Interval(Date start_date, Date stop_date) {
        super(start_date, stop_date);
        this.start_date = start_date;
        this.stop_date = stop_date;
    }

    public Interval(int start, int stop) {
        super(start, stop);
    }


}
