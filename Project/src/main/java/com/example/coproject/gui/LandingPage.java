package com.example.coproject.gui;

import com.example.coproject.cuda_algorithms.CryptographyBenchmark;
import com.example.coproject.cuda_algorithms.MemoryBenchmark;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import  javax.sound.sampled.*;

public class LandingPage extends JFrame implements ActionListener {
    private JButton algorithmButton1;
    private JButton algorithmButton2;
    private JButton testAlgorithmButton;
    private CryptographyBenchmark benchmarkTest1 = new CryptographyBenchmark();
    private MemoryBenchmark benchmarkTest2 = new MemoryBenchmark();
    private System_info system_info = new System_info();

    public LandingPage() {
        // set up the main window
        super("G.O.A.T. TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(750, 600));
        // background color of the title 'The G.O.A.T.S ...'
        getRootPane().setBackground(new Color(95, 158, 160));
        setResizable(false);


        //BUTTONS

        ImageIcon button_img = new ImageIcon("src/main/java/com/example/coproject/res/button.png");
        Image img = button_img.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH);
        button_img = new ImageIcon(img);

        algorithmButton1 = new JButton();
        algorithmButton1.setIcon(button_img);
        algorithmButton1.setOpaque(true);
        algorithmButton1.setFocusable(false);
        algorithmButton1.setBackground(Color.GRAY);
        //algorithmButton1.setBorder(BorderFactory.createBevelBorder(1));
        algorithmButton1.setLayout(null);
        algorithmButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        algorithmButton1.setVerticalTextPosition(SwingConstants.CENTER);
        algorithmButton1.setBounds(100, 100, button_img.getIconWidth(), button_img.getIconHeight());
        algorithmButton1.setText("Cryptography");





        algorithmButton2 = new JButton();
        algorithmButton2.setIcon(button_img);
        algorithmButton2.setOpaque(true);
        algorithmButton2.setFocusable(false);
        algorithmButton2.setBackground(Color.GRAY);
//        algorithmButton2.setBorder(BorderFactory.createBevelBorder(1));
        algorithmButton2.setLayout(null);
        algorithmButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        algorithmButton2.setVerticalTextPosition(SwingConstants.CENTER);
        algorithmButton2.setBounds(300, 100, button_img.getIconWidth(), button_img.getIconHeight());
        algorithmButton2.setText("Memory");
//        algorithmButton2.setPreferredSize(new Dimension(10, 200));

        // change this one to whatever
//        testAlgorithmButton = new JButton("Test algorithm");
//        testAlgorithmButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        testAlgorithmButton.setOpaque(true);
//        testAlgorithmButton.setFocusable(false);
//        testAlgorithmButton.setBackground(Color.GRAY);
//        testAlgorithmButton.setBorder(BorderFactory.createBevelBorder(1));

        //top pannel
        JPanel topPannel = new JPanel();
        topPannel.setBackground(Color.black);
        topPannel.setPreferredSize(new Dimension(750,250));


        //OLD BANNER
//        ImageIcon imageIcon = new ImageIcon("src/main/java/com/example/coproject/res/goattest_banner.png");
//        Image image = imageIcon.getImage().getScaledInstance(750, 250, Image.SCALE_SMOOTH);
//        topPannel.add(new JLabel(new ImageIcon(image)));

        //NEW BANNER
        JLabel background_header = new JLabel("",
                new ImageIcon("src/main/java/com/example/coproject/res/goattest_banner.gif"), JLabel.CENTER);
        background_header.setBounds(0,0,750,250);
        topPannel.add(background_header);


        add(topPannel,BorderLayout.NORTH);

        // center panel
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.black);
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 110)); //30 is the horizontal gap and 20 is the vertical gap
        centerPanel.add(algorithmButton1);
        centerPanel.add(algorithmButton2);
//        centerPanel.add(testAlgorithmButton);
        add(centerPanel, BorderLayout.CENTER);

        // bottom panel
        JPanel bottomPannel = new JPanel();
        bottomPannel.setBackground(Color.black);
        add(bottomPannel, BorderLayout.SOUTH);
        bottomPannel.setPreferredSize(new Dimension(750,50));

        ImageIcon footer_pic = new ImageIcon("src/main/java/com/example/coproject/res/goattest_footer.png");
        Image image2 = footer_pic.getImage().getScaledInstance(750, 50, Image.SCALE_SMOOTH);

        JLabel background_footer = new JLabel("",
                new ImageIcon("src/main/java/com/example/coproject/res/goattest_footer.gif"),JLabel.CENTER);
        background_footer.setBounds(0,0,750,50);
        bottomPannel.add(background_footer);





        JLabel sys_info = new JLabel();
        // add gpu and maybe ram
        sys_info.setText("CPU: " + system_info.getCpu() + " OS: " + system_info.getOsName());
        sys_info.setHorizontalAlignment(JLabel.CENTER);
        sys_info.setVerticalAlignment(JLabel.TOP);
        bottomPannel.add(sys_info); // move it
//        bottomPannel.add(bottom_info);
//        bottomPannel.add(new JLabel(new ImageIcon(image2)));


//      set background for the window
//      getContentPane().setBackground(new Color(95, 158, 160));

        algorithmButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // transition to another screen and require an input string
                    String s = "Ana are mere";
                    long time = benchmarkTest1.computeEncryptionDecryption1(s);
                    topPannel.setVisible(false);
                    centerPanel.setVisible(false);
                    bottomPannel.setVisible(false);

                    JPanel panel1 = new JPanel();
                    panel1.setBackground(Color.white);
                    panel1.setPreferredSize(new Dimension(700, 400));

                    // add gif to panel1
                    ImageIcon gif = new ImageIcon("");
                    JLabel gifLabel = new JLabel(gif);
                    panel1.add(gifLabel);

                    // add text input to panel1
                    JTextField textField1 = new JTextField();
                    textField1.setPreferredSize(new Dimension(300, 30));
                    panel1.add(textField1);

                    // add panel1 to centerPanel
                    centerPanel.add(panel1);
                    panel1.setVisible(true);

                    // make the new pannels visible
                } catch (NullPointerException n) {

                }
            }
        });

        algorithmButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    long time = benchmarkTest2.computeAccessTime();
                    // transition to another screen
                    topPannel.setVisible(false);
                    centerPanel.setVisible(false);
                    bottomPannel.setVisible(false);

                    JPanel panel2 = new JPanel();
                    panel2.setBackground(Color.lightGray);
                    panel2.setPreferredSize(new Dimension(700, 400));

                    // add gif to panel2
                    ImageIcon gif = new ImageIcon("");
                    JLabel gifLabel = new JLabel(gif);
                    panel2.add(gifLabel);

                    // add text input to panel2
                    JTextField textField2 = new JTextField();
                    textField2.setPreferredSize(new Dimension(300, 30));
                    panel2.add(textField2);

                    // add panel2 to centerPanel
                    centerPanel.add(panel2);
                    panel2.setVisible(true);
                    // make the new pannels visible
                } catch (NullPointerException n) {

                }
            }
        });

        //set icon for window
        ImageIcon icon_logo = new ImageIcon("src/main/java/com/example/coproject/res/goattest_icon.png");
        setIconImage(icon_logo.getImage());





        // show the main window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
