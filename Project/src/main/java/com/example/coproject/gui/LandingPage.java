package com.example.coproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage extends JFrame implements ActionListener {
    private JLabel algorithmLabel;
    private JTextField algorithmField;
    private JButton algorithmButton;
    private JTextArea resultsArea;

    public LandingPage() {
        // set up the main window
        super("The G.O.A.T.S. Benchmark");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(800, 600));

        // create the GUI components
        algorithmLabel = new JLabel("Select algorithm:");
        algorithmField = new JTextField(20);
        algorithmButton = new JButton("Test algorithm");
        algorithmButton.addActionListener(this);
        resultsArea = new JTextArea(10, 30);
        resultsArea.setEditable(false);

        // add the GUI components to the main window
        JPanel panel = new JPanel();
        panel.add(algorithmLabel);
        panel.add(algorithmField);
        panel.add(algorithmButton);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultsArea), BorderLayout.CENTER);

        // show the main window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle button clicks
        if (e.getSource() == algorithmButton) {
            String algorithm = algorithmField.getText();
            String result = testGPUAlgorithm(algorithm);
            resultsArea.setText(result);
        }
    }

    private String testGPUAlgorithm(String algorithm) {
        // write the GPU testing algorithms here
        // return the results as a String
        return "";
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
