package com.example.coproject.cuda_algorithms;

import jcuda.Pointer;
import jcuda.Sizeof;
import jcuda.runtime.JCuda;
import jcuda.runtime.cudaMemcpyKind;
import jcuda.driver.CUdeviceptr;
import jcuda.driver.JCudaDriver;
import jcuda.driver.CUcontext;
import jcuda.driver.CUdevice;
import java.util.ArrayList;

public class MemoryBenchmark {
    public long computeAccessTime(int numElements){
        // Initialize the JCuda runtime and driver
        JCuda.setExceptionsEnabled(true);
        JCudaDriver.setExceptionsEnabled(true);
        JCudaDriver.cuInit(0);

        // Select the first available CUDA device
        CUdevice device = new CUdevice();
        JCudaDriver.cuDeviceGet(device, 0);

        // Create a CUDA context
        CUcontext context = new CUcontext();
        JCudaDriver.cuCtxCreate(context, 0, device);

        // Allocate memory on the GPU device
        int elementSize = Sizeof.INT;
        int memSize = numElements * elementSize;
        CUdeviceptr d_mem = new CUdeviceptr();
        JCudaDriver.cuMemAlloc(d_mem, memSize);

        // Write data to the GPU memory
        int[] h_data = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            h_data[i] = i;
        }
        Pointer p_data = Pointer.to(h_data);
        JCudaDriver.cuMemcpyHtoD(d_mem, p_data, memSize);

        // Read data from the GPU memory
        int[] h_result = new int[numElements];
        Pointer p_result = Pointer.to(h_result);
        long startTime = System.nanoTime();
        JCudaDriver.cuMemcpyDtoH(p_result, d_mem, memSize);
        long endTime = System.nanoTime();
        long accessTime = endTime - startTime;

        // Free the GPU memory
        JCudaDriver.cuMemFree(d_mem);

        System.out.println("GPU memory access time: " + accessTime + " ns");

        // Destroy the CUDA context

        JCudaDriver.cuCtxDestroy(context);

        return accessTime;
    }
}
