// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class f implements n
{
    private a a;
    
    public f(final a a) {
        this.a = a;
    }
    
    @Override
    public EGLContext a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig) {
        if (this.a != null) {
            return this.a.b();
        }
        return null;
    }
    
    @Override
    public void a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLContext eglContext) {
    }
}
