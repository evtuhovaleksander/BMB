package system_class_package.interval_package;

import java.util.ArrayList;

/**
 * Created by Allex Dark on 11.11.2016.
 */
public class Interval_Overlap_Class {

    ArrayList<Window_Interval> window_intervals=new ArrayList<Window_Interval>();

    public Quantum_Interval overlap(Interval master_interval,Interval resource_interval)
    {
        Quantum_Interval outt=new Quantum_Interval(0,0);
        Quantum_Interval long_i;
        Quantum_Interval short_i;
        if(master_interval.length>resource_interval.length){long_i=master_interval;short_i=resource_interval;}
        else{long_i=resource_interval;short_i=master_interval;};


        boolean stop;
        boolean start;
        boolean left=false;
        boolean right=false;
        boolean center=false;
        // center
        stop=short_i.stop<=long_i.stop;
        start=short_i.start>=long_i.start;
        if(start&&stop)center=true;
        //left
        start=short_i.start<long_i.stop;
        stop=short_i.stop>=long_i.stop;
        if(start&&stop) left=true;
        //rightt
        start=short_i.start<=long_i.start;
        stop=short_i.stop>long_i.start;
        if(start&&stop) right=true;
        if(center) outt=new Quantum_Interval(short_i.start,short_i.stop);
        if(left) outt=new Quantum_Interval(short_i.start,long_i.stop);
        if(right) outt=new Quantum_Interval(long_i.start,short_i.stop);

        if(outt.length!=0){return outt;}else{return null;}
    }

  
    public static ArrayList<Master_Interval> get_free_Master_Intervals(Master master)
    {
        ArrayList<Quantum_Interval> outt=get_free_Quantum_Intervals(master.blocked_intervals);
        ArrayList<Master_Interval> outt_typed=new ArrayList<Master_Interval>();
        for (Quantum_Interval interv:outt) {
            outt_typed.add(new Master_Interval(interv.start,interv.stop,master.masterID));
        }
        return outt_typed;
    }

    public static ArrayList<Resource_Interval> get_free_Resource_Intervals(Resource resource)
    {
        ArrayList<Quantum_Interval> outt=get_free_Quantum_Intervals(resource.blocked_intervals);
        ArrayList<Resource_Interval> outt_typed=new ArrayList<Resource_Interval>();
        for (Quantum_Interval interv:outt) {
            outt_typed.add(new Resource_Interval(interv.start,interv.stop,resource.resourceID));
        }
        return outt_typed;
    }

    public static ArrayList<Quantum_Interval> get_free_Quantum_Intervals(ArrayList blocked_Intervals)
    {
        ArrayList<Quantum_Interval> outt=new ArrayList<Quantum_Interval>();
        Day_TimeLine day=new Day_TimeLine();
        for (int j = 0; j < blocked_Intervals.size(); j++) {
            Quantum_Interval interv=((Quantum_Interval)blocked_Intervals.get(j));
            for (int i = interv.start; i <= interv.stop; i++) {
                day.bool_quants[i]=false;
            }
        }

        Quantum_Interval cur_interval=null;
        for (int i = 0; i < day.bool_quants.length; i++)
        {
            if(day.bool_quants[i])
            {
                if(cur_interval==null)
                {
                    cur_interval=new Quantum_Interval(i);
                }
            }
            else
            {
                if(cur_interval!=null)
                {
                    cur_interval.setStop(i-1);
                    outt.add(cur_interval);
                    cur_interval=null;
                }
            }
        }

        if(cur_interval!=null)
        {
            cur_interval.setStop(day.bool_quants.length-1);
            outt.add(cur_interval);
            cur_interval=null;
        }


        return outt;
    }


    public static ArrayList<Window_Interval> overlap_master_and_resource(Master master,Resource resource)
    {
        ArrayList<Window_Interval> outt=new ArrayList<Window_Interval>();
        Day_TimeLine day=new Day_TimeLine();
        for (int j = 0; j < master.free_intervals.size(); j++) {
            Master_Interval interv=master.free_intervals.get(j);
            for (int i = interv.start; i <= interv.stop; i++) {
                day.double_bool_quants[i][0]=true;
            }
        }

        for (int j = 0; j < resource.free_intervals.size(); j++) {
            Resource_Interval interv=resource.free_intervals.get(j);
            for (int i = interv.start; i <= interv.stop; i++) {
                day.double_bool_quants[i][1]=true;
            }
        }

        Quantum_Interval cur_interval=null;
        for (int i = 0; i < day.double_bool_quants.length; i++)
        {
            if(day.double_bool_quants[i][0]&&day.double_bool_quants[i][1])
            {
                if(cur_interval==null)
                {
                    cur_interval=new Quantum_Interval(i);
                }
            }
            else
            {
                if(cur_interval!=null)
                {
                    cur_interval.setStop(i-1);
                    outt.add(new Window_Interval(cur_interval.start,cur_interval.stop,master.masterID,resource.resourceID));
                    cur_interval=null;
                }
            }
        }

        if(cur_interval!=null)
        {
            cur_interval.setStop(day.bool_quants.length-1);
            outt.add(new Window_Interval(cur_interval.start,cur_interval.stop,master.masterID,resource.resourceID));
            cur_interval=null;
        }


        return outt;
    }










}
