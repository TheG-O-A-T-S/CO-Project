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
        super("The G.O.A.T.S. Benchmark");
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

        // left side panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(95, 158, 160));
        leftPanel.add(Box.createRigidArea(new Dimension(0, 20))); // top spacing
        leftPanel.add(algorithmButton1);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing between buttons
        leftPanel.add(algorithmButton2);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 10))); // spacing between buttons
        leftPanel.add(testAlgorithmButton);
        leftPanel.add(Box.createVerticalGlue()); // fill remaining space
        add(leftPanel, BorderLayout.WEST);

        // right side panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(95, 158, 160));
        ImageIcon imageIcon = new ImageIcon("src/main/java/com/example/coproject/res/goat1.png");
        // change size of the image
        Image image = imageIcon.getImage().getScaledInstance(400, 450, Image.SCALE_SMOOTH);
        rightPanel.add(new JLabel(new ImageIcon(image)));
        add(rightPanel, BorderLayout.EAST);

        // set background for the window
        getContentPane().setBackground(new Color(95, 158, 160));


        // show the main window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        //test
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
