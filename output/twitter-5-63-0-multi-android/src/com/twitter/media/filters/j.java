// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class j extends i
{
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    final /* synthetic */ GLTextureView i;
    private int[] j;
    
    public j(final GLTextureView i, final int c, final int d, final int e, final int f, final int g, final int h) {
        this.i = i;
        super(i, new int[] { 12324, c, 12323, d, 12322, e, 12321, f, 12325, g, 12326, h, 12344 });
        this.j = new int[1];
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private int a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig, final int n, int n2) {
        if (egl10.eglGetConfigAttrib(eglDisplay, eglConfig, n, this.j)) {
            n2 = this.j[0];
        }
        return n2;
    }
    
    public EGLConfig a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig[] array) {
        for (final EGLConfig eglConfig : array) {
            final int a = this.a(egl10, eglDisplay, eglConfig, 12325, 0);
            final int a2 = this.a(egl10, eglDisplay, eglConfig, 12326, 0);
            if (a >= this.g && a2 >= this.h) {
                final int a3 = this.a(egl10, eglDisplay, eglConfig, 12324, 0);
                final int a4 = this.a(egl10, eglDisplay, eglConfig, 12323, 0);
                final int a5 = this.a(egl10, eglDisplay, eglConfig, 12322, 0);
                final int a6 = this.a(egl10, eglDisplay, eglConfig, 12321, 0);
                if (a3 == this.c && a4 == this.d && a5 == this.e && a6 == this.f) {
                    return eglConfig;
                }
            }
        }
        return null;
    }
}
