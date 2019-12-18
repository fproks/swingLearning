import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo1Test {

    @Test
    public  void  DemoTest() throws InterruptedException {
        var demo =new JFrameDemo1();
        Thread.sleep(100000);
    }

    @Test
    public  void JPanelDemo() throws InterruptedException {
        var demo =new JFrame("GUI");
        demo.setBounds(300,100,400,300);
        var penel =new  JPanel();
        var label =new JLabel("a label");
        penel.setBackground(Color.GRAY);
        penel.add(label);
        demo.add(penel);
        demo.setVisible(true);
        Thread.sleep(1000000);
    }

    @Test
    public  void  layoutDemo1() throws InterruptedException {
        var demo =new JFrame("GUI");
        demo.setSize(400,200);
        demo.setLayout(new BorderLayout()); //BorderLayout 将窗口分割为 5 个区域
        JButton button1 =new JButton("👆");
        JButton button2 =new JButton("👈");
        JButton button3 =new JButton("👉");
        JButton button4 =new JButton("👇");
        JButton button5 =new JButton("中");
        button5.setSize(200,200);
        demo.add(button1,BorderLayout.NORTH);
        demo.add(button2,BorderLayout.WEST);
        demo.add(button3,BorderLayout.EAST);
        demo.add(button4,BorderLayout.SOUTH);
        demo.add(button5,BorderLayout.CENTER);
        demo.setBounds(300,200,600,300);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread.sleep(10000);
    }

    public static void makeButton(String title,JFrame frame,GridBagLayout gridBagLayout,GridBagConstraints constraints)
    {
        JButton button=new JButton(title);    //创建Button对象
        gridBagLayout.setConstraints(button,constraints);
        frame.add(button);
    }

    @Test
    public  void GridBagLayoutDemo() throws InterruptedException {
        JFrame frame=new JFrame("拨号盘");
        GridBagLayout gbaglayout=new GridBagLayout();    //创建GridBagLayout布局管理器
        GridBagConstraints constraints=new GridBagConstraints();
        frame.setLayout(gbaglayout);    //使用GridBagLayout布局管理器
        constraints.fill=GridBagConstraints.BOTH;    //组件填充显示区域
        constraints.weightx=0.0;    //恢复默认值
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //结束行
        JTextField tf=new JTextField("13612345678");  //到这里结束一行
        gbaglayout.setConstraints(tf, constraints);
        frame.add(tf);
       constraints.weightx=0.5;    // 指定组件的分配区域
        constraints.weighty=0.8;
        constraints.gridwidth=2;
        makeButton("7",frame,gbaglayout,constraints);    //调用方法，添加按钮组件
        constraints.gridwidth=1;
        makeButton("8",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;    //结束行
        makeButton("9",frame,gbaglayout,constraints);  //到这里结束一行

        constraints.gridwidth=1;    //重新设置gridwidth的值

        makeButton("4",frame,gbaglayout,constraints);
        constraints.gridwidth=2;
        makeButton("5",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("6",frame,gbaglayout,constraints);
        constraints.gridwidth=1;

        makeButton("1",frame,gbaglayout,constraints);
        constraints.gridwidth=2;
        makeButton("2",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("3",frame,gbaglayout,constraints);
        constraints.gridwidth=5;

        makeButton("返回",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        makeButton("拨号",frame,gbaglayout,constraints);
        constraints.gridwidth=5;
        frame.setBounds(400,400,400,400);    //设置容器大小
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Thread.sleep(10000);
    }

}