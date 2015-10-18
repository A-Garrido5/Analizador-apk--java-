// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util.transcode;

import android.annotation.TargetApi;
import javax.microedition.khronos.egl.EGLConfig;
import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

class b implements SurfaceTexture$OnFrameAvailableListener
{
    private static final boolean a;
    private final SurfaceTexture b;
    private final Surface c;
    private final c d;
    private EGL10 e;
    private EGLDisplay f;
    private EGLContext g;
    private EGLSurface h;
    private final Object i;
    private boolean j;
    
    static {
        a = Log.isLoggable("OutputSurface", 3);
    }
    
    b() {
        this(0, 0);
    }
    
    b(final int n, final int n2) {
        this.i = new Object();
        if (n > 0 && n2 > 0) {
            this.a(n, n2);
            this.d();
        }
        (this.d = new c()).b();
        if (com.twitter.library.media.util.transcode.b.a) {
            Log.d("OutputSurface", String.format("textureID = %d", this.d.a()));
        }
        (this.b = new SurfaceTexture(this.d.a())).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
        this.c = new Surface(this.b);
    }
    
    @TargetApi(17)
    private void a(final int n, final int n2) {
        this.e = (EGL10)EGLContext.getEGL();
        this.f = this.e.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (!this.e.eglInitialize(this.f, (int[])null)) {
            throw new RuntimeException("unable to initialize EGL10");
        }
        final int[] array = { 12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344 };
        final EGLConfig[] array2 = { null };
        if (!this.e.eglChooseConfig(this.f, array, array2, 1, new int[1])) {
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        this.g = this.e.eglCreateContext(this.f, array2[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
        a(this.e, "eglCreateContext");
        if (this.g == null) {
            throw new RuntimeException("null context");
        }
        this.h = this.e.eglCreatePbufferSurface(this.f, array2[0], new int[] { 12375, n, 12374, n2, 12344 });
        a(this.e, "eglCreatePbufferSurface");
        if (this.h == null) {
            throw new RuntimeException("surface was null");
        }
    }
    
    private static void a(final EGL10 egl10, final String s) {
        boolean b = false;
        while (true) {
            final int eglGetError = egl10.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            Log.e("OutputSurface", s + ": EGL error: 0x" + Integer.toHexString(eglGetError));
            b = true;
        }
        if (b) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }
    
    private void d() {
        if (this.e == null) {
            throw new RuntimeException("not configured for makeCurrent");
        }
        a(this.e, "before makeCurrent");
        if (!this.e.eglMakeCurrent(this.f, this.h, this.h, this.g)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }
    
    public void a() {
        if (this.e != null) {
            if (this.e.eglGetCurrentContext().equals(this.g)) {
                this.e.eglMakeCurrent(this.f, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            }
            this.e.eglDestroySurface(this.f, this.h);
            this.e.eglDestroyContext(this.f, this.g);
        }
        this.c.release();
        this.f = null;
        this.g = null;
        this.h = null;
        this.e = null;
    }
    
    public void a(final int n) {
        this.d.a(this.b, n);
    }
    
    public void a(final String s) {
        this.d.a(s);
    }
    
    public Surface b() {
        return this.c;
    }
    
    public void c() {
        synchronized (this.i) {
            while (!this.j) {
                this.i.wait(500L);
                if (!this.j) {
                    throw new TranscoderException(false, "Surface frame wait timed out", null);
                }
            }
        }
        this.j = false;
        // monitorexit(o)
        this.d.b("before updateTexImage");
        this.b.updateTexImage();
    }
    
    public void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        if (com.twitter.library.media.util.transcode.b.a) {
            Log.d("OutputSurface", "new frame available");
        }
        synchronized (this.i) {
            if (this.j) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
        this.j = true;
        this.i.notifyAll();
    }
    // monitorexit(o)
}
