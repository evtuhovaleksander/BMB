package system_class_package.interval_package;


import java.util.ArrayList;

public class Test_Start {
    public static void main(String[] args) {


        ArrayList<Master_Interval> blocked = new ArrayList<>();
        blocked.add(new Master_Interval(1,2,0));
        blocked.add(new Master_Interval(6,8,0));
        ArrayList<Master_Interval> master0=Interval_Overlap_Class.get_free_Master_Intervals(blocked,0);
        for (Master_Interval fr:master0) {fr.print();}

        System.out.println("\n\n\n\n");

        blocked = new ArrayList<>();
        blocked.add(new Master_Interval(2,3,1));
        blocked.add(new Master_Interval(7,7,1));
        ArrayList<Master_Interval> master1=Interval_Overlap_Class.get_free_Master_Intervals(blocked,1);
        for (Master_Interval fr:master1) {fr.print();}

        System.out.println("\n\n\n\n");

        ArrayList<Master_Interval> all_masters=new ArrayList<>();
        all_masters.addAll(master0);
        all_masters.addAll(master1);
        for (Master_Interval fr:all_masters) {fr.print();}











    }
    }

