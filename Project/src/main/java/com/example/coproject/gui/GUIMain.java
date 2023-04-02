package com.example.coproject.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUIMain extends JFrame {
    private JFrame frame;
    private JLabel fpsLabel;
    private long lastTime;
    private int frameCount;

    public GUIMain() {
        // Asta e numele care apare la GUI, il schimbati voi
        frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // aici poti sa schimbi marimea frame-ului
        frame.setSize(1280, 1080);
        frame.setLocationRelativeTo(null);

        // Asta e ca sa afisezi fps, momentan e numa asa, nu se foloseste de cv algoritm
        // Poti sa schimbi cum arata si unde e plasat, oricum o sa avem nevoie mai incolo sa-l afisam nu la inceput
        fpsLabel = new JLabel("FPS: 0");
        fpsLabel.setFont(new Font("Arial", Font.BOLD, 24));
        fpsLabel.setForeground(Color.WHITE);

        // asa adaugi un label in frame
        frame.getContentPane().add(fpsLabel);

        lastTime = System.nanoTime();
        frameCount = 0;

        updateLoop();
    }

    private void updateLoop() {
        long currentTime = System.nanoTime();
        long elapsedTime = currentTime - lastTime;
        lastTime = currentTime;

        double fps = 1.0 / (elapsedTime / 1000000000.0);
        fpsLabel.setText("FPS: " + (int)fps);

        frameCount++;

        // asta e ca sa-i dea update dupa un anumit timp
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                updateLoop();
            }
        });
    }
    
    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUIMain GUIMain = new GUIMain();
        GUIMain.show();
    }
}