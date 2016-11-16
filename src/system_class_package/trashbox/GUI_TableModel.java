package system_class_package.trashbox;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Vector;

public class GUI_TableModel extends DefaultTableModel {

    public GUI_TableModel(Object rowData[][], Object columnNames[]) {
        super(rowData, columnNames);
    }

    public Class getColumnClass(int col) {
        Vector v = (Vector) dataVector.elementAt(0);
        return v.elementAt(col).getClass();
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }
}