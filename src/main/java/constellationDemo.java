import javax.swing.*;

public class constellationDemo {
    private JPanel panel1;
    private JTextField textField1;

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
