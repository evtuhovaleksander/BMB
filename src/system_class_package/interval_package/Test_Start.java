package system_class_package.interval_package;


import dnl.utils.text.table.TextTable;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Test_Start {
    public static void main(String[] args) throws IOException {




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

        Day day=new Day(all,"day1");
        GUI_Data gui=new GUI_Data();
        gui.days=new ArrayList<Day>();
        gui.days.add(day);
        for (int i = 0; i <288 ; i++) {
            gui.columnName[i]=Integer.toString(i);
        }
        gui.tab_data[0]=gui.days.get(0).obj_mas;




        TextTable tt = new TextTable(gui.columnName, gui.tab_data);
        tt.printTable();



        System.out.println("ind = 16");
        gui.print_variants(0,16,1,gui);
        System.out.println("\n\n");

        System.out.println("ind = 0");
        gui.print_variants(0,0,1,gui);
        System.out.println("\n\n");

        System.out.println("ind = 2");
        gui.print_variants(0,2,1,gui);
        System.out.println("\n\n");

        System.out.println("ind = 6");
        gui.print_variants(0,6,1,gui);
        System.out.println("\n\n");

    }
    }

