// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.graphics.SurfaceTexture;
import android.app.ActivityManager;
import android.view.View$OnLayoutChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import java.io.Writer;
import android.opengl.GLDebugHelper;
import javax.microedition.khronos.opengles.GL;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class p
{
    EGL10 a;
    EGLDisplay b;
    EGLSurface c;
    EGLConfig d;
    EGLContext e;
    private WeakReference f;
    
    public p(final WeakReference f) {
        this.f = f;
    }
    
    private void a(final String s) {
        a(s, this.a.eglGetError());
    }
    
    public static void a(final String s, final int n) {
        throw new RuntimeException(b(s, n));
    }
    
    public static void a(final String s, final String s2, final int n) {
        Log.w(s, b(s2, n));
    }
    
    public static String b(final String s, final int n) {
        return s + " failed: " + a(n);
    }
    
    private void g() {
        if (this.c != null && this.c != EGL10.EGL_NO_SURFACE) {
            this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            final GLTextureView glTextureView = (GLTextureView)this.f.get();
            if (glTextureView != null) {
                glTextureView.h.a(this.a, this.b, this.c);
            }
            this.c = null;
        }
    }
    
    public void a() {
        this.a = (EGL10)EGLContext.getEGL();
        this.b = this.a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (this.b == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (!this.a.eglInitialize(this.b, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        final GLTextureView glTextureView = (GLTextureView)this.f.get();
        if (glTextureView == null) {
            this.d = null;
            this.e = null;
        }
        else {
            this.d = glTextureView.f.a(this.a, this.b);
            this.e = glTextureView.g.a(this.a, this.b, this.d);
        }
        if (this.e == null || this.e == EGL10.EGL_NO_CONTEXT) {
            this.e = null;
            this.a("createContext");
        }
        this.c = null;
    }
    
    public boolean b() {
        if (this.a == null) {
            throw new RuntimeException("egl not initialized");
        }
        if (this.b == null) {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (this.d == null) {
            throw new RuntimeException("mEglConfig not initialized");
        }
        this.g();
        final GLTextureView glTextureView = (GLTextureView)this.f.get();
        if (glTextureView != null) {
            this.c = glTextureView.h.a(this.a, this.b, this.d, glTextureView.getSurfaceTexture());
        }
        else {
            this.c = null;
        }
        if (this.c == null || this.c == EGL10.EGL_NO_SURFACE) {
            if (this.a.eglGetError() == 12299) {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        if (!this.a.eglMakeCurrent(this.b, this.c, this.c, this.e)) {
            a("EGLHelper", "eglMakeCurrent", this.a.eglGetError());
            return false;
        }
        return true;
    }
    
    GL c() {
        GL gl = this.e.getGL();
        final GLTextureView glTextureView = (GLTextureView)this.f.get();
        if (glTextureView != null) {
            if (glTextureView.i != null) {
                gl = glTextureView.i.a(gl);
            }
            if ((0x3 & glTextureView.j) != 0x0) {
                final int n = 0x1 & glTextureView.j;
                int n2 = 0;
                if (n != 0) {
                    n2 = 1;
                }
                Writer writer;
                if ((0x2 & glTextureView.j) != 0x0) {
                    writer = new t();
                }
                else {
                    writer = null;
                }
                gl = GLDebugHelper.wrap(gl, n2, writer);
            }
        }
        return gl;
    }
    
    public int d() {
        if (!this.a.eglSwapBuffers(this.b, this.c)) {
            return this.a.eglGetError();
        }
        return 12288;
    }
    
    public void e() {
        this.g();
    }
    
    public void f() {
        if (this.e != null) {
            final GLTextureView glTextureView = (GLTextureView)this.f.get();
            if (glTextureView != null) {
                glTextureView.g.a(this.a, this.b, this.e);
            }
            this.e = null;
        }
        if (this.b != null) {
            this.a.eglTerminate(this.b);
            this.b = null;
        }
    }
}
