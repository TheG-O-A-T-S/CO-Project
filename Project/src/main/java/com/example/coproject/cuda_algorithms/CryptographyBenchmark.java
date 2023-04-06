package com.example.coproject.cuda_algorithms;

import jcuda.*;
import jcuda.driver.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.*;

public class CryptographyBenchmark {
    public CryptographyBenchmark() {
        JCudaDriver.setExceptionsEnabled(true);
        JCudaDriver.cuInit(0);
        CUdevice device = new CUdevice();
        JCudaDriver.cuDeviceGet(device, 0);
        CUcontext context = new CUcontext();
        JCudaDriver.cuCtxCreate(context, 0, device);

        int dataSize = 10000000; // 10 million bytes
        byte[] data = new byte[dataSize];
        new Random().nextBytes(data);

        long start = System.currentTimeMillis();

        try {
            SecretKeySpec secretKey = new SecretKeySpec(new byte[16], "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(data);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        // create function to return this
        System.out.println("Time taken: " + (end - start) + "ms");

        JCudaDriver.cuCtxDestroy(context);
    }
}
