package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LayoutDemo {
    public static void main (String [] args){
        JFrame win = new JFrame("布局管理演示");
        win.setSize(500,400);
        JPanel content = new JPanel(new BorderLayout());
        JPanel btnPanel = new JPanel(new BorderLayout());
        JPanel rightPanel = new JPanel(new FlowLayout());
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        win.setContentPane(content);
        content.add(BorderLayout.SOUTH,btnPanel);
        btnPanel.add(BorderLayout.EAST,rightPanel);
        btnPanel.add(BorderLayout.WEST,createleftPanel());
        rightPanel.add(ok);
        rightPanel.add(cancel);
        win.setVisible(true);

    }
    //工厂方法!
    private static JPanel createleftPanel(){
        JPanel p = new JPanel(new FlowLayout());
        JButton help = new JButton("Help");
        //事件绑定，在动作发生时候执行（回调）指定的方法
        help.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了解帮助按钮了!");
            }
        });
        p.add(help);
        return p;
    }
}
