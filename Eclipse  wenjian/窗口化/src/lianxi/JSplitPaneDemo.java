package lianxi;

import java.awt.Button;

import java.awt.Dimension;

import javax.swing.JButton;

import javax.swing.JPanel;

import javax.swing.JSplitPane;

import javax.swing.JFrame;

public class JSplitPaneDemo {

    public JSplitPaneDemo(){

        JButton b1=new JButton("水平分割");

        JButton b2=new JButton("垂直分割");

        JButton b3=new JButton("OK");

        JButton b4=new JButton("Cancel");

        JPanel j1=new JPanel();

        JPanel j2=new JPanel();

        j1.add(b1);

        j1.add(b2);

        j2.add(b3);

        j2.add(b4);

        JSplitPane jsp=new JSplitPane();

        jsp.setDividerLocation(100);

        jsp.setDividerSize(3);

        jsp.setPreferredSize(new Dimension(800, 600));

        jsp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);

        jsp.setOneTouchExpandable(true);

        jsp.setLeftComponent(j1);

        jsp.setRightComponent(j2);

        JFrame frame=new JFrame("分隔面板示例");

      frame.setContentPane(jsp);

      frame.setVisible(true);

      frame.pack();   

    }

    public static void main(String[] args) {

        new JSplitPaneDemo();

    }

    

}