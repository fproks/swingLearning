import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class constellationDemo {
    private JPanel panel1;
    private JTextField textField1;
    private JButton ADDButton;
    private JButton DELETEButton;
    private JLabel label;
    private JComboBox comboBox1;

    public constellationDemo() {
        textField1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                var str=textField1.getText();
                System.out.println(str);
                if(str!=""){
                    int i =comboBox1.getItemCount();
                    for (int j =0;j<i;j++){
                        System.out.println( comboBox1.getItemAt(j).toString());
                        if(comboBox1.getItemAt(j).toString().equals(str)){
                            ADDButton.setEnabled(false);
                            return;
                        }
                    }
                    ADDButton.setEnabled(true);
                }else {
                    ADDButton.setEnabled(false);
                }
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {

            }
        });
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str =textField1.getText();
                if(str!=""){
                    comboBox1.addItem(str);
                    textField1.setText("");
                }
            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.removeItem(comboBox1.getSelectedItem());
                DELETEButton.setEnabled(false);
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboBox1.getSelectedItem()!=null){
                    DELETEButton.setEnabled(true);
                }else {
                    DELETEButton.setEnabled(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("constellationDemo");
        frame.setContentPane(new constellationDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
