package com.example.coproject.gui;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLUtil;

public class System_info {
    private static final String osName = System.getProperty("os.name");
    private static final String cpu = System.getenv("PROCESSOR_IDENTIFIER");
    private static String GPUNAME;
    private static final double ram = Runtime.getRuntime().totalMemory() / (1024.0 * 1024.0);

    public String getOsName() {
        return osName;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        try {
            String filePath = "./foo.txt";
            // Use "dxdiag /t" variant to redirect output to a given file
            ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","dxdiag","/t",filePath);
            System.out.println("-- Executing dxdiag command --");
            Process p = pb.start();
            p.waitFor();

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println(String.format("-- Printing %1$1s info --",filePath));

            int n = 1;

            while((line = br.readLine()) != null){
                if(line.trim().startsWith("Card name:")){

                    GPUNAME=line.trim();
                    GPUNAME=GPUNAME.replace("Card name:",  " ");
                    System.out.println(GPUNAME);
                    if (n == 2) {
                        break;
                    }
                    n++;
                }

                // if the pc doesn't have an integrated gpu in the cpu break earlier
                if (line.trim().startsWith("Sound Devices")) break;

            }
        }
        catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

        return GPUNAME;
    }

    public static void main(String[] args) {

        System.out.println("osName = " + osName);
        System.out.println("cpu: " + cpu);
//        System.out.println("gpu: " + gpu);
        System.out.println("ram: " + ram + " MB");
    }
}
