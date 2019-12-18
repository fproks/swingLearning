import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test22 {
    private JPanel panel1;
    private JButton button11Button;
    private JButton button3;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel textLabel;
    private  int count=0;

    public test22() {
        button11Button.addActionListener(e -> {
            textLabel.setText("被点击"+count+"次");
            count++;
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("test22");
        frame.setSize(800,200);
        frame.setContentPane(new test22().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
