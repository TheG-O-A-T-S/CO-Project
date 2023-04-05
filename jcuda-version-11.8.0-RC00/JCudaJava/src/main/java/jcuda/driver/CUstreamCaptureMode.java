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

package jcuda.driver;

/**
 * Possible modes for stream capture thread interactions. For more details see
 * ::cuStreamBeginCapture and ::cuThreadExchangeStreamCaptureMode
 */
public class CUstreamCaptureMode
{
    /**
     * This is the default mode. 
     */
    public static final int CU_STREAM_CAPTURE_MODE_GLOBAL = 0;
    
    /**
     * Local capture mode 
     */
    public static final int CU_STREAM_CAPTURE_MODE_THREAD_LOCAL = 1;
    
    /**
     * Relaxed capture mode 
     */
    public static final int CU_STREAM_CAPTURE_MODE_RELAXED = 2;
    
    /**
     * Returns the String identifying the given CUstreamCaptureMode
     *
     * @param n The CUstreamCaptureMode
     * @return The String identifying the given CUstreamCaptureMode
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CU_STREAM_CAPTURE_MODE_GLOBAL: return "CU_STREAM_CAPTURE_MODE_GLOBAL";
            case CU_STREAM_CAPTURE_MODE_THREAD_LOCAL: return "CU_STREAM_CAPTURE_MODE_THREAD_LOCAL";
            case CU_STREAM_CAPTURE_MODE_RELAXED: return "CU_STREAM_CAPTURE_MODE_RELAXED";
        }
        return "INVALID CUstreamCaptureMode: "+n;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private CUstreamCaptureMode()
    {
    }

}
