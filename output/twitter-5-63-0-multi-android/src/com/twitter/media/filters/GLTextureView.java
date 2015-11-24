// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import android.graphics.SurfaceTexture;
import android.app.ActivityManager;
import android.view.View$OnLayoutChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;

public class GLTextureView extends TextureView implements TextureView$SurfaceTextureListener
{
    private static final r a;
    private static int m;
    private final WeakReference b;
    private q c;
    private u d;
    private boolean e;
    private m f;
    private n g;
    private o h;
    private s i;
    private int j;
    private int k;
    private boolean l;
    
    static {
        a = new r(null);
    }
    
    public GLTextureView(final Context context) {
        super(context);
        this.b = new WeakReference((T)this);
        this.a(context);
    }
    
    public GLTextureView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new WeakReference((T)this);
        this.a(context);
    }
    
    private static String a(final int n) {
        switch (n) {
            default: {
                return "0x" + Integer.toHexString(n);
            }
            case 12288: {
                return "EGL_SUCCESS";
            }
            case 12289: {
                return "EGL_NOT_INITIALIZED";
            }
            case 12290: {
                return "EGL_BAD_ACCESS";
            }
            case 12291: {
                return "EGL_BAD_ALLOC";
            }
            case 12292: {
                return "EGL_BAD_ATTRIBUTE";
            }
            case 12293: {
                return "EGL_BAD_CONFIG";
            }
            case 12294: {
                return "EGL_BAD_CONTEXT";
            }
            case 12295: {
                return "EGL_BAD_CURRENT_SURFACE";
            }
            case 12296: {
                return "EGL_BAD_DISPLAY";
            }
            case 12297: {
                return "EGL_BAD_MATCH";
            }
            case 12298: {
                return "EGL_BAD_NATIVE_PIXMAP";
            }
            case 12299: {
                return "EGL_BAD_NATIVE_WINDOW";
            }
            case 12300: {
                return "EGL_BAD_PARAMETER";
            }
            case 12301: {
                return "EGL_BAD_SURFACE";
            }
            case 12302: {
                return "EGL_CONTEXT_LOST";
            }
        }
    }
    
    private void a() {
        if (this.c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }
    
    private void a(final Context context) {
        this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        this.addOnLayoutChangeListener((View$OnLayoutChangeListener)new h(this));
        GLTextureView.m = ((ActivityManager)context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion;
    }
    
    public void a(final SurfaceTexture surfaceTexture) {
        this.c.d();
    }
    
    public void a(final SurfaceTexture surfaceTexture, final int n, final int n2, final int n3) {
        this.c.a(n2, n3);
    }
    
    public void b() {
        this.c.c();
    }
    
    public void b(final SurfaceTexture surfaceTexture) {
        this.c.e();
    }
    
    public void c() {
        this.c.f();
    }
    
    public void d() {
        this.c.g();
    }
    
    protected void finalize() {
        try {
            if (this.c != null) {
                this.c.h();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public int getDebugFlags() {
        return this.j;
    }
    
    public boolean getPreserveEGLContextOnPause() {
        return this.l;
    }
    
    public int getRenderMode() {
        return this.c.b();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && this.d != null) {
            int b;
            if (this.c != null) {
                b = this.c.b();
            }
            else {
                b = 1;
            }
            this.c = new q(this.b);
            if (b != 1) {
                this.c.a(b);
            }
            this.c.start();
        }
        this.e = false;
    }
    
    protected void onDetachedFromWindow() {
        if (this.c != null) {
            this.c.h();
        }
        this.e = true;
        super.onDetachedFromWindow();
    }
    
    public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.a(surfaceTexture);
    }
    
    public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.b(surfaceTexture);
        return true;
    }
    
    public void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.a(surfaceTexture, 0, n, n2);
    }
    
    public void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
        this.b();
    }
    
    public void setDebugFlags(final int j) {
        this.j = j;
    }
    
    public void setEGLConfigChooser(final m f) {
        this.a();
        this.f = f;
    }
    
    public void setEGLConfigChooser(final boolean b) {
        this.setEGLConfigChooser(new v(this, b));
    }
    
    public void setEGLContextClientVersion(final int k) {
        this.a();
        this.k = k;
    }
    
    public void setEGLContextFactory(final n g) {
        this.a();
        this.g = g;
    }
    
    public void setEGLWindowSurfaceFactory(final o h) {
        this.a();
        this.h = h;
    }
    
    public void setGLWrapper(final s i) {
        this.i = i;
    }
    
    public void setPreserveEGLContextOnPause(final boolean l) {
        this.l = l;
    }
    
    public void setRenderMode(final int n) {
        this.c.a(n);
    }
    
    public void setRenderer(final u d) {
        this.a();
        if (this.f == null) {
            this.f = new v(this, true);
        }
        if (this.g == null) {
            this.g = new k(this, null);
        }
        if (this.h == null) {
            this.h = new l(null);
        }
        this.d = d;
        (this.c = new q(this.b)).start();
    }
}
