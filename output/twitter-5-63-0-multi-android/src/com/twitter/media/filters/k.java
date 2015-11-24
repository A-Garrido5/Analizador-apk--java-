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
import android.util.Log;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

class k implements n
{
    final /* synthetic */ GLTextureView a;
    private int b;
    
    private k(final GLTextureView a) {
        this.a = a;
        this.b = 12440;
    }
    
    @Override
    public EGLContext a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLConfig eglConfig) {
        int[] array = { this.b, this.a.k, 12344 };
        final EGLContext egl_NO_CONTEXT = EGL10.EGL_NO_CONTEXT;
        if (this.a.k == 0) {
            array = null;
        }
        return egl10.eglCreateContext(eglDisplay, eglConfig, egl_NO_CONTEXT, array);
    }
    
    @Override
    public void a(final EGL10 egl10, final EGLDisplay eglDisplay, final EGLContext eglContext) {
        if (!egl10.eglDestroyContext(eglDisplay, eglContext)) {
            Log.e("DefaultContextFactory", "display:" + eglDisplay + " context: " + eglContext);
            p.a("eglDestroyContex", egl10.eglGetError());
        }
    }
}
