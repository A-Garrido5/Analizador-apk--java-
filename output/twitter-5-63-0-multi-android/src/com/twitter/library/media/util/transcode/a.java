// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import android.opengl.EGLExt;
import android.opengl.EGLConfig;
import android.util.Log;
import android.opengl.EGL14;
import android.view.Surface;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.annotation.TargetApi;

@TargetApi(18)
public class a
{
    private EGLDisplay a;
    private EGLContext b;
    private EGLSurface c;
    private Surface d;
    
    public a(final Surface d) {
        this.d = d;
        this.d();
    }
    
    private void a(final String s) {
        boolean b = false;
        while (true) {
            final int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Log.e("InputSurface", s + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            b = true;
        }
        if (b) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }
    
    private void d() {
        this.a = EGL14.eglGetDisplay(0);
        if (this.a == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        final int[] array = new int[2];
        if (!EGL14.eglInitialize(this.a, array, 0, array, 1)) {
            this.a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        final int[] array2 = { 12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344 };
        final EGLConfig[] array3 = { null };
        if (!EGL14.eglChooseConfig(this.a, array2, 0, array3, 0, array3.length, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.b = EGL14.eglCreateContext(this.a, array3[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
        this.a("eglCreateContext");
        if (this.b == null) {
            throw new RuntimeException("null context");
        }
        this.c = EGL14.eglCreateWindowSurface(this.a, array3[0], (Object)this.d, new int[] { 12344 }, 0);
        this.a("eglCreateWindowSurface");
        if (this.c == null) {
            throw new RuntimeException("surface was null");
        }
    }
    
    public void a() {
        if (EGL14.eglGetCurrentContext().equals((Object)this.b)) {
            EGL14.eglMakeCurrent(this.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.a, this.c);
        EGL14.eglDestroyContext(this.a, this.b);
        this.d.release();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public void a(final long n) {
        EGLExt.eglPresentationTimeANDROID(this.a, this.c, n);
    }
    
    public void b() {
        if (!EGL14.eglMakeCurrent(this.a, this.c, this.c, this.b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }
    
    public boolean c() {
        return EGL14.eglSwapBuffers(this.a, this.c);
    }
}
