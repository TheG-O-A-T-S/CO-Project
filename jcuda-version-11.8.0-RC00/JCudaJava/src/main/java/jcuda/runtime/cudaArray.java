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

import jcuda.NativePointerObject;
import jcuda.driver.CUarray;

/**
 * Java port of a cudaArray
 *
 * @see jcuda.runtime.JCuda#cudaMallocArray
 * @see jcuda.runtime.JCuda#cudaMalloc3DArray
 * @see jcuda.runtime.JCuda#cudaFreeArray
 */
public class cudaArray extends NativePointerObject
{
    /**
     * Creates a new, uninitialized cudaArray
     */
    public cudaArray()
    {
    }

    /**
     * Creates a cudaArray for the given {@link CUarray}. This
     * corresponds to casting a CUarray to a cudaArray.
     *
     * @param array The other array
     */
    public cudaArray(CUarray array)
    {
        super(array);
    }

    /**
     * Returns a String representation of this object.
     *
     * @return A String representation of this object.
     */
    @Override
    public String toString()
    {
        return "cudaArray["+
            "nativePointer=0x"+Long.toHexString(getNativePointer())+"]";
    }
}
