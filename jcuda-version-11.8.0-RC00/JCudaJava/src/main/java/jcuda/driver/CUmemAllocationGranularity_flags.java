/*
 * JCuda - Java bindings for NVIDIA CUDA driver and runtime API
 *
 * Copyright (c) 2009-2018 Marco Hutter - http://www.jcuda.org
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
* Flag for requesting different optimal and required granularities for an allocation.
*/
public class CUmemAllocationGranularity_flags
{
    /**
     * Minimum required granularity for allocation 
     */
    public static final int CU_MEM_ALLOC_GRANULARITY_MINIMUM = 0x0;
    /**
     * Recommended granularity for allocation for best performance 
     */
    public static final int CU_MEM_ALLOC_GRANULARITY_RECOMMENDED = 0x1;

    /**
     * Private constructor to prevent instantiation
     */
    private CUmemAllocationGranularity_flags()
    {
        // Private constructor to prevent instantiation
    }

    /**
     * Returns a string representation of the given constant
     *
     * @return A string representation of the given constant
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CU_MEM_ALLOC_GRANULARITY_MINIMUM: return "CU_MEM_ALLOC_GRANULARITY_MINIMUM";
            case CU_MEM_ALLOC_GRANULARITY_RECOMMENDED: return "CU_MEM_ALLOC_GRANULARITY_RECOMMENDED";
        }
        return "INVALID CUmemAllocationGranularity_flags: "+n;
    }
}

