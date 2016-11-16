package system_class_package.interval_package;

import dnl.utils.text.table.TextTable;

import java.util.ArrayList;

/**
 * Created by Allex Dark on 15.11.2016.
 */
public class GUI_Data {
    ArrayList<Day> days;
    String columnName[]=new String[288];
    Object tab_data[][]=new Object[1][0];

    public void print_variants(int day_id, int quantum_id,int length,GUI_Data gui)
    {
        ArrayList<Window_Interval> wins=new ArrayList<Window_Interval>();
        Day day=days.get(day_id);
        for (int i = 0; i < day.window_intervals.size(); i++) {
            if(day.window_intervals.get(i).start<=quantum_id&&day.window_intervals.get(i).stop>=quantum_id)
                wins.add(day.window_intervals.get(i));
        }

        String col[]={"N","Master","Resource","start","stop","start penalty","stop penalty"};
        Object data[][]=new Object[wins.size()][7];
        for (int i = 0; i < wins.size(); i++) {
            data[i][0]=i;

            data[i][1]=wins.get(i).masterId;
            data[i][2]=wins.get(i).resourceId;

            data[i][3]=wins.get(i).start;
            data[i][4]=wins.get(i).stop;

            data[i][5]=quantum_id-wins.get(i).start;
            data[i][6]=(wins.get(i).stop-(wins.get(i).start+length-1));
        }


        TextTable tt = new TextTable(gui.columnName, gui.tab_data);
        tt.printTable();
        System.out.println("\n");
        tt = new TextTable(col, data);
        tt.printTable();
        System.out.println("sin index");
    }
}
