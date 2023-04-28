package com.example.coproject.cuda_algorithms;

import jcuda.*;
import jcuda.driver.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.*;

public class CryptographyBenchmark {
    public long computeEncryptionDecryption1(String inputString){
        JCudaDriver.setExceptionsEnabled(true);
        JCudaDriver.cuInit(0);
        CUdevice device = new CUdevice();
        JCudaDriver.cuDeviceGet(device, 0);
        CUcontext context = new CUcontext();
        JCudaDriver.cuCtxCreate(context, 0, device);

        String encryptedString = null;

        long start = System.nanoTime();

        try {
            // Convert the input string to a byte array
            byte[] inputData = inputString.getBytes();

            // Generate a random 128-bit key
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey secretKey = keyGen.generateKey();

            // Encrypt the input data using AES encryption
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedData = cipher.doFinal(inputData);

            // Convert the encrypted data to a string for output
            encryptedString = new String(encryptedData);

            // Decrypt the encrypted data using AES decryption
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedData = cipher.doFinal(encryptedData);

            // Convert the decrypted data to a string for output
            String decryptedString = new String(decryptedData);

            // Verify that the decrypted data matches the original input
            if (!decryptedString.equals(inputString)) {
                System.err.println("Decryption failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();

        System.out.println("Time taken: " + (end - start) + "ns");

        JCudaDriver.cuCtxDestroy(context);

        return end - start;
    }
}
