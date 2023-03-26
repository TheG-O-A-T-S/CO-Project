package com.example.coproject;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GPUTest extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private JLabel fpsLabel;
    private long startTime;
    private int frameCount;
    private Random rand;

    public GPUTest() {
        super("GPU Test");

        fpsLabel = new JLabel("FPS: ");
        add(fpsLabel, BorderLayout.NORTH);

        Timer timer = new Timer(16, e -> {
            updateFPS();
        });
        timer.start();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setVisible(true);

        startTime = System.nanoTime();
        rand = new Random();
    }

    private void updateFPS() {
        long currentTime = System.nanoTime();
        double elapsedTime = (currentTime - startTime) / 1_000_000_000.0;
        double fps = frameCount / elapsedTime;
        fpsLabel.setText("FPS: " + String.format("%.2f", fps));
        frameCount = 0;
        startTime = currentTime;
    }

    public static void main(String[] args) {
        new GPUTest();
    }
}