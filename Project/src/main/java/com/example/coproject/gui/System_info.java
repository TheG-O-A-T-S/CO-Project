package com.example.coproject.gui;


public class System_info {
    private static final String osName = System.getProperty("os.name");
    private static final String cpu = System.getenv("PROCESSOR_IDENTIFIER");
//    private static final String gpu =  org.lwjgl.opengl.GL11.glGetString(org.lwjgl.opengl.GL11.GL_RENDERER);
    private static final double ram = Runtime.getRuntime().totalMemory() / (1024.0 * 1024.0);

    public String getOsName() {
        return osName;
    }

    public String getCpu() {
        return cpu;
    }

    public static void main(String[] args) {

        System.out.println("osName = " + osName);
        System.out.println("cpu: " + cpu);
//        System.out.println("gpu: " + gpu);
        System.out.println("ram: " + ram + " MB");

    }
}
