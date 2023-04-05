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
 * Online compilation targets.<br />
 * <br />
 * Most comments are taken from the CUDA reference manual.<br />
 *
 * @see JCudaDriver#cuModuleLoadDataEx
 */
public class CUjit_target
{

    /**
     * Compute device class 1.0
     */
    public static final int CU_TARGET_COMPUTE_10 = 10;

    /**
     * Compute device class 1.1
     */
    public static final int CU_TARGET_COMPUTE_11 = 11;

    /**
     * Compute device class 1.2
     */
    public static final int CU_TARGET_COMPUTE_12 = 12;

    /**
     * Compute device class 1.3
     */
    public static final int CU_TARGET_COMPUTE_13 = 13;

    /**
     * Compute device class 2.0
     */
    public static final int CU_TARGET_COMPUTE_20 = 20;

    /**
     * Compute device class 2.1
     */
    public static final int CU_TARGET_COMPUTE_21 = 21;

    /**
     * Compute device class 3.0
     */
    public static final int CU_TARGET_COMPUTE_30 = 30;

    /**
     * Compute device class 3.2
     */
    public static final int CU_TARGET_COMPUTE_32 = 32;

    /**
     * Compute device class 3.5
     */
    public static final int CU_TARGET_COMPUTE_35 = 35;

    /**
     * Compute device class 3.7
     */
    public static final int CU_TARGET_COMPUTE_37 = 37;

    /**
     * Compute device class 5.0
     */
    public static final int CU_TARGET_COMPUTE_50 = 50;

    /**
     * Compute device class 5.2
     */
    public static final int CU_TARGET_COMPUTE_52 = 52;

    /**
     * Compute device class 5.3
     */
    public static final int CU_TARGET_COMPUTE_53 = 53;

    /**
     * Compute device class 6.0.
     */
    public static final int CU_TARGET_COMPUTE_60 = 60;

    /**
     * Compute device class 6.1.
     */
    public static final int CU_TARGET_COMPUTE_61 = 61;

    /**
     * Compute device class 6.2.
     */
    public static final int CU_TARGET_COMPUTE_62 = 62;

    /**
     * Compute device class 7.0.
     */
    public static final int CU_TARGET_COMPUTE_70 = 70;

    /**
     * Compute device class 7.2.
     */
    public static final int CU_TARGET_COMPUTE_72 = 72;

    /**
     * Compute device class 7.3.
     * 
     * @deprecated Removed as of CUDA 10
     */
    public static final int CU_TARGET_COMPUTE_73 = 73;
    
    /**
     * Compute device class 7.5.
     */
    public static final int CU_TARGET_COMPUTE_75 = 75;

    /**
     * Compute device class 8.0.
     */
    public static final int CU_TARGET_COMPUTE_80 = 80;
    
    /**
     * Compute device class 8.6.
     */
    public static final int CU_TARGET_COMPUTE_86 = 86;
    
    /**
     * Compute device class 8.7.
     */
    public static final int CU_TARGET_COMPUTE_87 = 87;
    
    /**
     * Compute device class 8.9.
     */
    public static final int CU_TARGET_COMPUTE_89 = 89;
    
    /**
     * Compute device class 9.0.
     */
    public static final int CU_TARGET_COMPUTE_90 = 90;
    
    /**
     * Returns the String identifying the given CUjit_target
     *
     * @param n The CUjit_target
     * @return The String identifying the given CUjit_target
     */
    public static String stringFor(int n)
    {
        switch (n)
        {
            case CU_TARGET_COMPUTE_10: return "CU_TARGET_COMPUTE_10";
            case CU_TARGET_COMPUTE_11: return "CU_TARGET_COMPUTE_11";
            case CU_TARGET_COMPUTE_12: return "CU_TARGET_COMPUTE_12";
            case CU_TARGET_COMPUTE_13: return "CU_TARGET_COMPUTE_13";
            case CU_TARGET_COMPUTE_20: return "CU_TARGET_COMPUTE_20";
            case CU_TARGET_COMPUTE_21: return "CU_TARGET_COMPUTE_21";
            case CU_TARGET_COMPUTE_30: return "CU_TARGET_COMPUTE_30";
            case CU_TARGET_COMPUTE_32: return "CU_TARGET_COMPUTE_32";
            case CU_TARGET_COMPUTE_35: return "CU_TARGET_COMPUTE_35";
            case CU_TARGET_COMPUTE_37: return "CU_TARGET_COMPUTE_37";
            case CU_TARGET_COMPUTE_50: return "CU_TARGET_COMPUTE_50";
            case CU_TARGET_COMPUTE_52: return "CU_TARGET_COMPUTE_52";
            case CU_TARGET_COMPUTE_53: return "CU_TARGET_COMPUTE_53";
            case CU_TARGET_COMPUTE_60: return "CU_TARGET_COMPUTE_60";
            case CU_TARGET_COMPUTE_61: return "CU_TARGET_COMPUTE_61";
            case CU_TARGET_COMPUTE_62: return "CU_TARGET_COMPUTE_62";
            case CU_TARGET_COMPUTE_70: return "CU_TARGET_COMPUTE_70";
            case CU_TARGET_COMPUTE_72: return "CU_TARGET_COMPUTE_72";
            case CU_TARGET_COMPUTE_73: return "CU_TARGET_COMPUTE_73";
            case CU_TARGET_COMPUTE_75: return "CU_TARGET_COMPUTE_75";
            case CU_TARGET_COMPUTE_80: return "CU_TARGET_COMPUTE_80";
            case CU_TARGET_COMPUTE_86: return "CU_TARGET_COMPUTE_86";
            case CU_TARGET_COMPUTE_87: return "CU_TARGET_COMPUTE_87";
            case CU_TARGET_COMPUTE_89: return "CU_TARGET_COMPUTE_89";
            case CU_TARGET_COMPUTE_90: return "CU_TARGET_COMPUTE_90";
        }
        return "INVALID CUjit_target: "+n;
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private CUjit_target()
    {
    }

}

