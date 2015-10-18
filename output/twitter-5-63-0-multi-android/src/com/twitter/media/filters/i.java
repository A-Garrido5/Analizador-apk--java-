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
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGL10;

abstract class i implements m
{
    protected int[] a;
    final /* synthetic */ GLTextureView b;
    
    public i(final GLTextureView b, final int[] array) {
        this.b = b;
        this.a = this.a(array);
    }
    
    private int[] a(final int[] array) {
        if (this.b.k != 2) {
            return array;
        }
        final int length = array.length;
        final int[] array2 = new int[length + 2];
        System.arraycopy(array, 0, array2, 0, length - 1);
        array2[length - 1] = 12352;
        array2[length] = 4;
        array2[length + 1] = 12344;
        return array2;
    }
    
    @Override
    public EGLConfig a(final EGL10 egl10, final EGLDisplay eglDisplay) {
        final int[] array = { 0 };
        if (!egl10.eglChooseConfig(eglDisplay, this.a, (EGLConfig[])null, 0, array)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        final int n = array[0];
        if (n <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        final EGLConfig[] array2 = new EGLConfig[n];
        if (!egl10.eglChooseConfig(eglDisplay, this.a, array2, n, array)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        final EGLConfig a = this.a(egl10, eglDisplay, array2);
        if (a == null) {
            throw new IllegalArgumentException("No config chosen");
        }
        return a;
    }
    
    abstract EGLConfig a(final EGL10 p0, final EGLDisplay p1, final EGLConfig[] p2);
}
