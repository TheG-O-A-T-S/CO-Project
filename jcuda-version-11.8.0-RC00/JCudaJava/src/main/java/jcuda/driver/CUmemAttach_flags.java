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
 * CUDA Mem Attach Flags
 */
public class CUmemAttach_flags
{
    /**
     * Memory can be accessed by any stream on any device
     */
    public static final int CU_MEM_ATTACH_GLOBAL = 0x1;

    /**
     * Memory cannot be accessed by any stream on any device
     */
    public static final int CU_MEM_ATTACH_HOST   = 0x2;

    /**
     * Memory can only be accessed by a single stream on the
     * associated device
     */
    public static final int CU_MEM_ATTACH_SINGLE = 0x4;

    /**
     * Returns the String identifying the given CUmemAttach_flags
     *
     * @param n The CUmemAttach_flags
     * @return The String identifying the given CUmemAttach_flags
     */
    public static String stringFor(int n)
    {
        if (n == 0)
        {
            return "INVALID CUmemAttach_flags: "+n;
        }
        String result = "";
        if ((n & CU_MEM_ATTACH_GLOBAL) != 0) result += "CU_MEM_ATTACH_GLOBAL ";
        if ((n & CU_MEM_ATTACH_HOST) != 0) result += "CU_MEM_ATTACH_HOST ";
        if ((n & CU_MEM_ATTACH_SINGLE) != 0) result += "CU_MEM_ATTACH_SINGLE ";
        return result;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private CUmemAttach_flags()
    {
    }

}
