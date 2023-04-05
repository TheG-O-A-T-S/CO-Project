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

#ifndef JCUDA_COMMON
#define JCUDA_COMMON

#ifdef _WIN32
#  define WINDOWS_LEAN_AND_MEAN
#  define NOMINMAX
#  include <windows.h>
#endif

#include <stdlib.h>
#include <jni.h>
#include <cuda_runtime.h>
#include <cuda_gl_interop.h>
#include <cuda_profiler_api.h>
#include <cuda.h>

#include "Logger.hpp"
#include "JNIUtils.hpp"
#include "PointerUtils.hpp"
#include "CallbackUtils.hpp"

// The JVM, used for attaching threads in callbacks, and initialized
// in JNI_OnLoad
JavaVM *globalJvm;

#define JCUDA_INTERNAL_ERROR 0x80000001

#endif