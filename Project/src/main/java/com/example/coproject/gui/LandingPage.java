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
    public int counter;

    public LandingPage() {
        // set up the main window
        super("G.O.A.T. TEST");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(750, 600));
        // background color of the title 'The G.O.A.T.S ...'
        getRootPane().setBackground(new Color(95, 158, 160));
        setResizable(false);


        //BUTTONS

        // ! schimba aici poza de la buton ca arata urat rau
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

        // set font size for button text
        Font buttonFont = new Font("Arial", Font.BOLD, 16); // adjust size as needed
        algorithmButton1.setFont(buttonFont);
        algorithmButton2.setFont(buttonFont);

        // make photo background fit the entire button size
        algorithmButton1.setBorderPainted(false);
        algorithmButton1.setContentAreaFilled(false);
        algorithmButton1.setIconTextGap(0);
        algorithmButton2.setBorderPainted(false);
        algorithmButton2.setContentAreaFilled(false);
        algorithmButton2.setIconTextGap(0);

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
                    topPannel.setVisible(false);
                    centerPanel.setVisible(false);
                    bottomPannel.setVisible(false);

                    JPanel topPanel1 = new JPanel();
                    topPanel1.setBackground(Color.lightGray);
                    topPanel1.setPreferredSize(new Dimension(700, 100));
                    topPanel1.add(background_header);
                    add(topPanel1, BorderLayout.NORTH);

                    JPanel centerPanel1 = new JPanel();
                    centerPanel1.setBackground(Color.black); // set background to black
                    centerPanel1.setLayout(new BoxLayout(centerPanel1, BoxLayout.PAGE_AXIS));
                    centerPanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
                    centerPanel1.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // Add horizontal padding

// add text explaining what needs to be done
                    JLabel textLabel = new JLabel("Input a string for the goat to encrypt:");
                    textLabel.setPreferredSize(new Dimension(300, 30));
                    textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                    textLabel.setForeground(Color.white); // set text color to white
                    centerPanel1.add(textLabel);
                    centerPanel1.add(Box.createRigidArea(new Dimension(0, 10)));

// add text input to panel1
                    JTextField textField1 = new JTextField();
                    textField1.setPreferredSize(new Dimension(50, 20));
                    textField1.setAlignmentX(Component.CENTER_ALIGNMENT);
                    centerPanel1.add(textField1);
                    centerPanel1.add(Box.createRigidArea(new Dimension(0, 50)));

                    ImageIcon button_img = new ImageIcon("src/main/java/com/example/coproject/res/button.png");
                    Image img = button_img.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH);
                    button_img = new ImageIcon(img);

// add buttons to panel1
                    JPanel buttonsPanel = new JPanel();
                    buttonsPanel.setBackground(Color.black);
                    buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.LINE_AXIS));
                    buttonsPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

                    JButton plusButton = new JButton("+");
                    plusButton.setIcon(button_img);
                    plusButton.setOpaque(true);
                    plusButton.setFocusable(false);

                    plusButton.setLayout(null);
                    plusButton.setHorizontalTextPosition(SwingConstants.CENTER);
                    plusButton.setVerticalTextPosition(SwingConstants.CENTER);
                    plusButton.setBounds(300, 100, button_img.getIconWidth(), button_img.getIconHeight());

// set font size for button text
                    Font buttonFont = new Font("Arial", Font.BOLD, 16); // adjust size as needed
                    plusButton.setFont(buttonFont);

// make photo background fit the entire button size
                    plusButton.setBorderPainted(false);
                    plusButton.setContentAreaFilled(false);
                    plusButton.setIconTextGap(0);
                    plusButton.setPreferredSize(new Dimension(30, 60)); // Set size for + button
                    plusButton.setAlignmentX(Component.CENTER_ALIGNMENT);
                    counter = 1;

//  add counter label to button
                    JLabel counterLabel = new JLabel("Compute algorithm " + String.valueOf(counter) + " time");
                    counterLabel.setBounds(0, 0, 300, 20);
                    counterLabel.setForeground(Color.white);
                    counterLabel.setFont(buttonFont);
                    plusButton.add(counterLabel);

                    plusButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            counter++;
                            counterLabel.setText("Compute algorithm " + String.valueOf(counter) + " times"); // updated counter label text
                        }
                    });

                    buttonsPanel.add(plusButton);

                    centerPanel1.add(buttonsPanel);
                    centerPanel1.add(Box.createVerticalGlue());
                    centerPanel1.add(Box.createRigidArea(new Dimension(0, 100)));

                    ImageIcon start_button_img = new ImageIcon("src/main/java/com/example/coproject/res/start_button.png");
                    Image img_start = start_button_img.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH);
                    start_button_img = new ImageIcon(img_start);

                    // add start button to panel1
                    JButton startButton = new JButton("");
                    startButton.setIcon(start_button_img);
                    startButton.setOpaque(true);
                    startButton.setFocusable(false);
                    startButton.setLayout(null);
                    startButton.setHorizontalTextPosition(SwingConstants.CENTER);
                    startButton.setVerticalTextPosition(SwingConstants.CENTER);
                    startButton.setBounds(300, 100, start_button_img.getIconWidth(), start_button_img.getIconHeight());
                    startButton.setBorderPainted(false);
                    startButton.setContentAreaFilled(false);
                    startButton.setIconTextGap(0);
                    startButton.setPreferredSize(new Dimension(30, 60)); // Set size
                    startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
                    centerPanel1.add(startButton);
                    centerPanel1.add(Box.createVerticalGlue());

                    add(centerPanel1, BorderLayout.CENTER);

                    JPanel bottomPanel1 = new JPanel();
                    bottomPanel1.setBackground(Color.black);
                    bottomPanel1.setPreferredSize(new Dimension(700, 50));
                    bottomPanel1.add(background_footer);
                    add(bottomPanel1, BorderLayout.SOUTH);

                    // first warm up the benchmark
                    for (int i = 0; i < 20; i++) {
                        benchmarkTest1.computeEncryptionDecryption1("");
                    }

                    ImageIcon finalButton_img = button_img;
                    startButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            // Disable center panel
                            centerPanel1.setVisible(false);

                            // Create new panel with loading gif
                            JPanel loadingPanel = new JPanel();
                            loadingPanel.setBackground(Color.black);
                            loadingPanel.setLayout(new BoxLayout(loadingPanel, BoxLayout.PAGE_AXIS));
                            loadingPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
                            loadingPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // Add horizontal padding

                            // Add loading gif to panel
                            ImageIcon loadingIcon = new ImageIcon("path/to/loading.gif");
                            JLabel loadingLabel = new JLabel(loadingIcon);
                            loadingPanel.add(loadingLabel);

                            // Add panel to frame
                            add(loadingPanel, BorderLayout.CENTER);



                            long score;
                            int constant = 500000;
                            String inputString = textField1.getText();
                            long totalTime = 0;
                            for (int i = 0; i < counter; i++) {
                                long time = benchmarkTest1.computeEncryptionDecryption1(inputString);
                                totalTime += time;
                            }

                            totalTime /= 1000;

                            score = (counter * ((inputString.length() / constant) + 1) * constant) / totalTime;

                            // Switch to another screen after 1 * counter seconds
                            Timer timer = new Timer(1000 * counter, new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    // Remove loading panel
                                    remove(loadingPanel);

                                    // Add new panel
                                    JPanel newPanel = new JPanel();
                                    newPanel.setBackground(Color.black);
                                    newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));

                                    // Display the score
                                    JLabel textLabel = new JLabel("Your score: " + score);
                                    textLabel.setPreferredSize(new Dimension(300, 30));
                                    textLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                                    textLabel.setForeground(Color.white); // set text color to white
                                    newPanel.add(Box.createRigidArea(new Dimension(0, 50))); // add spacing
                                    newPanel.add(textLabel);
                                    newPanel.add(Box.createRigidArea(new Dimension(0, 50))); // add spacing

                                    // Add return button
                                    JButton returnButton = new JButton("Return");
                                    returnButton.setIcon(finalButton_img);
                                    returnButton.setOpaque(true);
                                    returnButton.setFocusable(false);

                                    // Set button size and position
                                    int buttonWidth = 200;
                                    int buttonHeight = 80;
                                    int x = (newPanel.getWidth() - buttonWidth) / 2;
                                    int y = (newPanel.getHeight() - buttonHeight) / 2;
                                    returnButton.setBounds(x, y, buttonWidth, buttonHeight);

                                    // Set button text properties
                                    Font buttonFont = new Font("Arial", Font.BOLD, 24); // adjust size as needed
                                    returnButton.setFont(buttonFont);
                                    returnButton.setHorizontalTextPosition(SwingConstants.CENTER);
                                    returnButton.setVerticalTextPosition(SwingConstants.CENTER);

                                    // Set button background and border
                                    returnButton.setBorderPainted(false);
                                    returnButton.setContentAreaFilled(false);
                                    returnButton.setIconTextGap(0);
                                    returnButton.setAlignmentX(Component.CENTER_ALIGNMENT);

                                    newPanel.add(returnButton);
                                    add(newPanel, BorderLayout.CENTER);

                                    // Refresh frame
                                    revalidate();
                                    repaint();

                                    // return to main screen
                                    returnButton.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            topPanel1.setVisible(false);
                                            newPanel.setVisible(false);
                                            bottomPanel1.setVisible(false);

                                            topPannel.setVisible(true);
                                            centerPanel.setVisible(true);
                                            bottomPannel.setVisible(true);
                                        }
                                    });

                                }
                            });
                            timer.setRepeats(false);
                            timer.start();




                            // System.out.println(inputString);
                        }
                    });

                    // modify such that the user can choose how many times to perform the algorithm
                    // score = timesComputed * lenOfString / time

                } catch (NullPointerException n) {

                }
            }
        });

        algorithmButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // numElements = the block of memory to be accessed
                    // change this from a textfield or something
                    int numElements = 1000;
                    long time = benchmarkTest2.computeAccessTime(1000);
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

                    // score = timesComputed * blockOfMemory / time
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
