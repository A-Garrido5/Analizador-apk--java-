// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class l implements o
{
    @Override
    public EGLSurface a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final Object o) {
        try {
            return egl10.eglCreateWindowSurface(eglDisplay, eglConfig, o, (int[])null);
        }
        catch (IllegalArgumentException ex) {
            Log.e("GLSurfaceView", "eglCreateWindowSurface", (Throwable)ex);
            return null;
        }
    }
    
    @Override
    public void a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLSurface eglSurface) {
        egl10.eglDestroySurface(eglDisplay, eglSurface);
    }
}
