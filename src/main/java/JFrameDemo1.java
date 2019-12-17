import javax.swing.*;

public class JFrameDemo1 extends JFrame {

    public  JFrameDemo1(){
        setTitle("GUI");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var jl =new JLabel("JFrame Label");
        getContentPane().add(jl);
        setVisible(true);

    }
}
