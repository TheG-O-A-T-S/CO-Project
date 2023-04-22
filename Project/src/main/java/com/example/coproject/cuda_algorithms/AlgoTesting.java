package com.example.coproject.cuda_algorithms;

public class AlgoTesting {
    public static void main(String[] args) {
        CryptographyBenchmark benchmark1 = new CryptographyBenchmark();
        MemoryBenchmark benchmark2 = new MemoryBenchmark();

        // after the first call the time drops a lot and after the third it evens to around the same number
        for (int i = 0; i < 10; i++) {
            benchmark1.computeEncryptionDecryption();
            benchmark2.computeAccessTime();
        }

    }
}
