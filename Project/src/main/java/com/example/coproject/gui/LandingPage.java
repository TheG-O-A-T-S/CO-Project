package com.example.coproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage extends JFrame implements ActionListener {
    private JButton algorithmButton1;
    private JButton algorithmButton2;
    private JButton testAlgorithmButton;

    public LandingPage() {
        // set up the main window
        super("G.O.A.T. TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));
        // background color of the title 'The G.O.A.T.S ...'
        getRootPane().setBackground(new Color(95, 158, 160));

        algorithmButton1 = new JButton("Cryptography");
        algorithmButton1.setBackground(Color.GRAY);
        algorithmButton1.setOpaque(true);

        algorithmButton2 = new JButton("Memory");
        algorithmButton2.setBackground(Color.GRAY);
        algorithmButton2.setOpaque(true);

        // change this one to whatever
        testAlgorithmButton = new JButton("Test algorithm");
        testAlgorithmButton.addActionListener(this);
        testAlgorithmButton.setBackground(Color.GRAY);
        testAlgorithmButton.setOpaque(true);

        //top pannel
        JPanel topPannel = new JPanel();
        topPannel.setBackground(Color.magenta);
        ImageIcon imageIcon = new ImageIcon("src/main/java/com/example/coproject/res/goattest_logo.png");
        Image image = imageIcon.getImage().getScaledInstance(400, 450, Image.SCALE_SMOOTH);
        topPannel.add(new JLabel(new ImageIcon(image)));
        add(topPannel,BorderLayout.NORTH);

        // center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.RED);
        centerPanel.add(algorithmButton1);
        centerPanel.add(algorithmButton2);
        centerPanel.add(testAlgorithmButton);
        add(centerPanel,BorderLayout.CENTER);

        //bottom panel
        JPanel bottomPannel = new JPanel();
        bottomPannel.setBackground(Color.green);
        add(bottomPannel,BorderLayout.SOUTH);


        // set background for the window
        getContentPane().setBackground(new Color(95, 158, 160));

        //set icon for window

        ImageIcon icon_logo = new ImageIcon("src/main/java/com/example/coproject/res/goattest_icon.png");
        setIconImage(icon_logo.getImage());



        // show the main window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle button clicks
        if (e.getSource() == testAlgorithmButton) {

        }
    }

    public static void main(String[] args) {
        // create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LandingPage();
            }
        });
    }
}
