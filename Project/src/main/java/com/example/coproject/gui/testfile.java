package com.example.coproject.gui;
import  javax.swing.*;
import java.awt.*;

public class testfile {
    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a
        //				third dimension for positioning components
        //				ex. depth, Z-index

        JLabel label1= new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(0,0,500,500);

        JLabel label2= new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100,100,200,200);
        label2.setLayout(new BorderLayout());

        JButton buton1 = new JButton("LOOOOOOOOOOLOLOLOLO");
        buton1.setOpaque(true);
        buton1.setFocusable(true);
        buton1.setBackground(Color.CYAN);
        buton1.setVisible(true);
        label2.add(buton1);


        JLabel label3= new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        //layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JPanel testhead = new JPanel();
        testhead.setBackground(Color.GREEN);


        JFrame frame = new JFrame("JLayeredPane");

        frame.add(testhead,BorderLayout.NORTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
