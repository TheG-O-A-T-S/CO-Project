/*
 * JCuda - Java bindings for NVIDIA CUDA driver and runtime API
 *
 * Copyright (c) 2009-2016 Marco Hutter - http://www.jcuda.org
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
 * CUDA device P2P attributes
 */
public class cudaDeviceP2PAttr
{
    /**
     * A relative value indicating the performance of the link between two devices 
     */
    public static final int cudaDevP2PAttrPerformanceRank              = 1;

    /**
     * Peer access is enabled 
     */
    public static final int cudaDevP2PAttrAccessSupported              = 2;
    
    /**
     * Native atomic operation over the link supported 
     */
    public static final int cudaDevP2PAttrNativeAtomicSupported        = 3;  

    /**
     * Returns the String identifying the given cudaDeviceP2PAttr
     *
     * @param k The cudaDeviceP2PAttr
     * @return The String identifying the given cudaDeviceP2PAttr
     */
    public static String stringFor(int k)
    {
        switch (k)
        {
            case cudaDevP2PAttrPerformanceRank : return "cudaDevP2PAttrPerformanceRank";
            case cudaDevP2PAttrAccessSupported : return "cudaDevP2PAttrAccessSupported";
            case cudaDevP2PAttrNativeAtomicSupported : return "cudaDevP2PAttrNativeAtomicSupported";
        }
        return "INVALID cudaDeviceP2PAttr: "+k;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private cudaDeviceP2PAttr()
    {

    }
};
