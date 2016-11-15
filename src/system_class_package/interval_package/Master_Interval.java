package system_class_package.interval_package;

import java.util.Date;


public class Master_Interval extends Interval {
    int masterID;

    public Master_Interval(Date start_date, Date stop_date, int masterID) {
        super(start_date, stop_date);
        this.masterID = masterID;
    }

    public Master_Interval(int start, int stop, int masterID) {
        super(start, stop);
        this.masterID = masterID;
    }



    public void print()
    {
        System.out.println("MasterInterval start: "+ start+"    stop: "+stop+"    " +"length: "+length+"    "+"masterID: "+masterID);
    }
}
