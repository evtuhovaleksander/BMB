package system_class_package.interval_package;

import java.util.Date;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Quantum_Interval {
    int start;
    int stop;
    int length;

    public Quantum_Interval(int start, int stop) {
        this.start = start;
        this.stop = stop;
        this.length=stop-start+1;
    }
    public Quantum_Interval(int start) {
        this.start = start;
    }

    public Quantum_Interval(Date start,Date stop) {

    }

    public void setStop(int stop) {
        this.stop = stop;
        this.length=stop-start+1;
    }

}
