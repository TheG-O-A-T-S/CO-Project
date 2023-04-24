package com.example.coproject.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import  javax.sound.sampled.*;

public class LandingPage extends JFrame implements ActionListener {
    private JButton algorithmButton1;
    private JButton algorithmButton2;
    private JButton testAlgorithmButton;

    public LandingPage() {
        // set up the main window
        super("G.O.A.T. TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(750, 600));
        // background color of the title 'The G.O.A.T.S ...'
        getRootPane().setBackground(new Color(95, 158, 160));
        setResizable(false);


        //BUTTONS

        algorithmButton1 = new JButton("Cryptography");
        algorithmButton1.setBackground(Color.GRAY);
        algorithmButton1.setOpaque(true);
        algorithmButton1.setFocusable(false);
        algorithmButton1.setBackground(Color.RED);
        algorithmButton1.setBorder(BorderFactory.createBevelBorder(1));

        algorithmButton2 = new JButton("Memory");
        algorithmButton2.setBackground(Color.GRAY);
        algorithmButton2.setOpaque(true);
        algorithmButton2.setFocusable(false);
        algorithmButton2.setBackground(Color.RED);
        algorithmButton2.setBorder(BorderFactory.createBevelBorder(1));

        // change this one to whatever
        testAlgorithmButton = new JButton("Test algorithm");
        testAlgorithmButton.addActionListener(this);
        testAlgorithmButton.setBackground(Color.GRAY);
        testAlgorithmButton.setOpaque(true);
        testAlgorithmButton.setFocusable(false);
        testAlgorithmButton.setBackground(Color.RED);
        testAlgorithmButton.setBorder(BorderFactory.createBevelBorder(1));

        //top pannel
        JPanel topPannel = new JPanel();
        topPannel.setBackground(Color.black);
        topPannel.setPreferredSize(new Dimension(750,250));

        ImageIcon imageIcon = new ImageIcon("src/main/java/com/example/coproject/res/goattest_banner.png");
        Image image = imageIcon.getImage().getScaledInstance(750, 250, Image.SCALE_SMOOTH);
        topPannel.add(new JLabel(new ImageIcon(image)));


        add(topPannel,BorderLayout.NORTH);

        // center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.black);
        centerPanel.setLayout(new GridLayout(3,1,50,50));
        centerPanel.add(algorithmButton1);
        centerPanel.add(algorithmButton2);
        centerPanel.add(testAlgorithmButton);
        add(centerPanel,BorderLayout.CENTER);

        //bottom panel
        JPanel bottomPannel = new JPanel();
        bottomPannel.setBackground(Color.black);
        add(bottomPannel,BorderLayout.SOUTH);
        bottomPannel.setPreferredSize(new Dimension(750,50));

        ImageIcon footer_pic = new ImageIcon("src/main/java/com/example/coproject/res/goattest_footer.png");
        Image image2 = footer_pic.getImage().getScaledInstance(750, 50, Image.SCALE_SMOOTH);


        JLabel bottom_info = new JLabel();
        bottom_info.setText("CPU: GPU: RAM: OS:");
        bottom_info.setHorizontalAlignment(JLabel.LEFT); //??????dc nu merge
        bottom_info.setVerticalAlignment(JLabel.TOP);
        bottomPannel.add(bottom_info);
        bottomPannel.add(new JLabel(new ImageIcon(image2)));

        //test layered pane

//        JLayeredPane layeredPane = new JLayeredPane();
//        layeredPane.setBackground(Color.CYAN);
//        add(layeredPane);



        // set background for the window
//        getContentPane().setBackground(new Color(95, 158, 160));

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

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException,LineUnavailableException {
        // create and show the GUI


        //Music test
        File file = new File("src/main/java/com/example/coproject/res/goattest_OST.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();



        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LandingPage();
            }
        });
    }
}
