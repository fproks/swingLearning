import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class tableDemo {
    private JPanel panel1;
    private JTable table1;
    private JScrollPane panel;
    private JButton deletButton;

    public tableDemo() {
        deletButton.addActionListener(e -> {
            int tab =table1.getSelectedRow();
            if(tab>=0) {
              var df=  (DefaultTableModel)table1.getModel();
              df.removeRow(tab);
              deletButton.setEnabled(false);
            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("tableDemo");
        var Demo = new tableDemo();
        frame.setContentPane(Demo.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        Demo.initalizeTable();
        frame.setVisible(true);
    }

    private void initalizeTable() {
        var tableModel = (DefaultTableModel) table1.getModel();
        //更改表头
        tableModel.setColumnIdentifiers(new String[]{"name", "sex", "age", "math", "yuwen"}); //更改表头
        tableModel.addRow(new Object[]{"lilei","mail",18,19,30});
        tableModel.addRow(new Object[]{"bilibili","famil",19,20,33});

        //设置选择事件
       var selectModel= table1.getSelectionModel();
       selectModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       selectModel.addListSelectionListener(e -> deletButton.setEnabled(true));

        //居中
        DefaultTableCellRenderer cr =new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        table1.setDefaultRenderer(Object.class,cr);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
