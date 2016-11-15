package system_class_package.interval_package;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class Day_TimeLine {
    boolean bool_quants[];
    boolean double_bool_quants[][];

    public Day_TimeLine() {
        this.bool_quants = new boolean[288] ;
        this.double_bool_quants=new boolean[288][2];
        for (int i = 0; i <bool_quants.length ; i++) {
            bool_quants[i]=true;
        }
    }
}
