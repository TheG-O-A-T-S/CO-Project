/*
 * JCuda - Java bindings for NVIDIA CUDA driver and runtime API
 *
 * Copyright (c) 2009-2015 Marco Hutter - http://www.jcuda.org
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package jcuda.runtime;

/**
 * CUDA limits.<br />
 * <br />
 * Most comments are taken from the CUDA reference manual.<br />
 */
public class cudaLimit
{
    /**
     * GPU thread stack size
     */
    public static final int cudaLimitStackSize      = 0x00;

    /**
     * GPU printf/fprintf FIFO size
     */
    public static final int cudaLimitPrintfFifoSize = 0x01;

    /**
     * GPU malloc heap size
     */
    public static final int cudaLimitMallocHeapSize = 0x02;

    /**
     * GPU device runtime synchronize depth
     */
    public static final int cudaLimitDevRuntimeSyncDepth          = 0x03;

    /**
     * GPU device runtime pending launch count
     */
    public static final int cudaLimitDevRuntimePendingLaunchCount = 0x04;

    /** 
     * A value between 0 and 128 that indicates the maximum fetch 
     * granularity of L2 (in Bytes). This is a hint 
     */
    public static final int cudaLimitMaxL2FetchGranularity        = 0x05;

    /**
     * A size in bytes for L2 persisting lines cache size 
     */
    public static final int cudaLimitPersistingL2CacheSize        = 0x06;
    
    /**
     * Returns the String identifying the given cudaLimit
     *
     * @param n The cudaLimit
     * @return The String identifying the given cudaLimit
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case cudaLimitStackSize: return "cudaLimitStackSize";
            case cudaLimitPrintfFifoSize: return "cudaLimitPrintfFifoSize";
            case cudaLimitMallocHeapSize: return "cudaLimitMallocHeapSize";
            case cudaLimitDevRuntimeSyncDepth: return "cudaLimitDevRuntimeSyncDepth";
            case cudaLimitDevRuntimePendingLaunchCount: return "cudaLimitDevRuntimePendingLaunchCount";
            case cudaLimitMaxL2FetchGranularity: return "cudaLimitMaxL2FetchGranularity";
            case cudaLimitPersistingL2CacheSize: return "cudaLimitPersistingL2CacheSize";
        }
        return "INVALID cudaLimit: "+n;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private cudaLimit()
    {
    }

};

