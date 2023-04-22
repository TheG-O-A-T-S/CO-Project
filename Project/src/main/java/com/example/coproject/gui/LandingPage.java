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

        algorithmButton1 = new JButton("Cryptography");
        algorithmButton1.setBackground(Color.GRAY);
        algorithmButton1.setOpaque(true);

        algorithmButton2 = new JButton("Memory");
        algorithmButton2.setBackground(Color.GRAY);
        algorithmButton2.setOpaque(true);

        testAlgorithmButton = new JButton("Test algorithm");
        testAlgorithmButton.addActionListener(this);
        testAlgorithmButton.setBackground(Color.GRAY);
        testAlgorithmButton.setOpaque(true);

        // add the GUI components to the main window
        JPanel panel = new JPanel();
        panel.setBackground(new Color(95, 158, 160));
        panel.add(algorithmButton1);
        panel.add(algorithmButton2);
        panel.add(testAlgorithmButton);
        add(panel, BorderLayout.NORTH);
        getContentPane().setBackground(new Color(95, 158, 160));

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
