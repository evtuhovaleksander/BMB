package system_class_package.interval_package;

/**
 * Created by Allex Dark on 11.11.2016.
 */
public class Window_Interval extends Interval {
    public Master_Interval master_interval;
    public Resource_Interval resource_interval;
    public int masterId;
    public int resourceId;

    public Window_Interval(int start, int stop, Master_Interval master_interval, Resource_Interval resource_interval, int masterId, int resourceId) {
        super(start, stop);
        this.master_interval = master_interval;
        this.resource_interval = resource_interval;
        this.masterId = masterId;
        this.resourceId = resourceId;
    }

    public Window_Interval(int start, int stop, Master_Interval master_interval, Resource_Interval resource_interval) {
        super(start, stop);
        this.master_interval = master_interval;
        this.resource_interval = resource_interval;
    }

    public Window_Interval(int start, int stop, int masterId, int resourceId) {
        super(start, stop);
        this.masterId = masterId;
        this.resourceId = resourceId;
    }

    public void print()
    {
        System.out.format("WindowInterval start: %3d   stop: %3d   length: %3d   resourceID: %2d   masterID: %2d%n",start,stop,length,resourceId,masterId);

    }
}
