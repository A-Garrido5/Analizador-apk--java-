// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class a
{
    private EGLSurface a;
    private EGLDisplay b;
    private EGL10 c;
    private EGLContext d;
    private boolean e;
    private boolean f;
    
    public boolean a() {
        int n = 1;
        this.c = (EGL10)EGLContext.getEGL();
        if (this.c != null) {
            this.b = this.c.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.b != null) {
                final int[] array = new int[2];
                final int[] array2 = { 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12352, 4, 12344 };
                this.c.eglInitialize(this.b, array);
                final EGLConfig[] array3 = new EGLConfig[n];
                this.c.eglChooseConfig(this.b, array2, array3, n, new int[n]);
                final EGLConfig eglConfig = array3[0];
                final EGLContext eglCreateContext = this.c.eglCreateContext(this.b, eglConfig, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
                if (this.c.eglGetError() == 12288) {
                    this.d = eglCreateContext;
                    this.a = this.c.eglCreatePbufferSurface(this.b, eglConfig, new int[] { 12375, 4, 12374, 4, 12344 });
                    if (this.a == EGL10.EGL_NO_SURFACE || this.c.eglGetError() != 12288) {
                        n = 0;
                    }
                    return n != 0;
                }
            }
        }
        return false;
    }
    
    public EGLContext b() {
        return this.d;
    }
    
    public boolean c() {
        if (this.e) {
            throw new RuntimeException("Unbalanced calls to makeCurrent/unsetCurrent!");
        }
        this.f = false;
        boolean b;
        if (!this.d.equals(this.c.eglGetCurrentContext())) {
            final boolean eglMakeCurrent = this.c.eglMakeCurrent(this.b, this.a, this.a, this.d);
            b = false;
            if (eglMakeCurrent) {
                final int eglGetError = this.c.eglGetError();
                b = false;
                if (eglGetError == 12288) {
                    b = true;
                }
            }
            this.f = true;
        }
        else {
            b = true;
        }
        if (b) {
            this.e = true;
        }
        return b;
    }
    
    public boolean d() {
        this.e = false;
        return !this.f || (this.c.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT) && this.c.eglGetError() == 12288);
    }
    
    public void e() {
        this.c.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        this.c.eglDestroySurface(this.b, this.a);
        this.c.eglDestroyContext(this.b, this.d);
        this.c.eglTerminate(this.b);
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
