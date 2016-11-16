package system_class_package.interval_package;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TableTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         Color[] rowColors = new Color[] {
                randomColor(), randomColor(), randomColor()
        };

        JTable table = new JTable(3, 3);

        table.setDefaultRenderer(Object.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table,
                                                           Object value, boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                JPanel pane = new JPanel();
                pane.setBackground(rowColors[row]);

                return pane;
            }
        });
        frame.setLayout(new BorderLayout());

        JButton btn = new JButton("Change row2's color");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rowColors[1] = randomColor();
                table.repaint();
            }
        });

        frame.add(table, BorderLayout.NORTH);
        frame.add(btn, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    private static Color randomColor() {
        Random rnd = new Random();
        return new Color(rnd.nextInt(256),
                rnd.nextInt(256), rnd.nextInt(256));
    }
}
