package com.example.coproject.cuda_algorithms;

public class AlgoTesting {
    public static void main(String[] args) {
        CryptographyBenchmark benchmark1 = new CryptographyBenchmark();
        MemoryBenchmark benchmark2 = new MemoryBenchmark();

        benchmark1.computeEncryptionDecryption();
        benchmark2.computeAccessTime(); 

    }
}
