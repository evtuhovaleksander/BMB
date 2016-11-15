package system_class_package.interval_package;


import java.util.ArrayList;

public class Test_Start {
    public static void main(String[] args) {

        Master master0=new Master(0);
        ArrayList<Master_Interval> blocked = new ArrayList<>();
        blocked.add(new Master_Interval(1,2,0));
        blocked.add(new Master_Interval(6,8,0));
        master0.blocked_intervals=blocked;
        master0.free_intervals=Interval_Overlap_Class.get_free_Master_Intervals(master0);


        Master master1=new Master(1);
        blocked = new ArrayList<>();
        blocked.add(new Master_Interval(2,3,1));
        blocked.add(new Master_Interval(7,7,1));
        master1.blocked_intervals=blocked;
        master1.free_intervals=Interval_Overlap_Class.get_free_Master_Intervals(master1);




        Resource resource2 = new Resource(2);
        ArrayList<Resource_Interval> blocked2 = new ArrayList<>();
        blocked2.add(new Resource_Interval(0,3,2));
        blocked2.add(new Resource_Interval(5,8,2));
        resource2.blocked_intervals=blocked2;
        resource2.free_intervals=Interval_Overlap_Class.get_free_Resource_Intervals(resource2);



        Resource resource3 = new Resource(3);
        blocked2 = new ArrayList<>();
        blocked2.add(new Resource_Interval(3,6,3));
        blocked2.add(new Resource_Interval(9,10,3));
        resource3.blocked_intervals=blocked2;
        resource3.free_intervals=Interval_Overlap_Class.get_free_Resource_Intervals(resource3);




        master0.print();
        master1.print();
        resource2.print();
        resource3.print();









        ArrayList<Window_Interval> test;
        ArrayList<Window_Interval> all=new ArrayList<Window_Interval>();
        System.out.println("overlaping m0 r2");
        test= Interval_Overlap_Class.overlap_master_and_resource(master0,resource2);
        all.addAll(test);
        //for (Window_Interval wi:test)wi.print();

        System.out.println("overlaping m0 r3");
        test= Interval_Overlap_Class.overlap_master_and_resource(master0,resource3);
        all.addAll(test);
       // for (Window_Interval wi:test)wi.print();

        System.out.println("overlaping m1 r2");
        test= Interval_Overlap_Class.overlap_master_and_resource(master1,resource2);
        all.addAll(test);
       // for (Window_Interval wi:test)wi.print();

        System.out.println("overlaping m1 r3");
        test= Interval_Overlap_Class.overlap_master_and_resource(master1,resource3);
        all.addAll(test);
       // for (Window_Interval wi:test)wi.print();





        
        System.out.println("all free ");
        for (Window_Interval wi:all)wi.print();
    }
    }

