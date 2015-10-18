// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

public interface o
{
    EGLSurface a(final EGL10 p0, final EGLDisplay p1, final EGLConfig p2, final Object p3);
    
    void a(final EGL10 p0, final EGLDisplay p1, final EGLSurface p2);
}
