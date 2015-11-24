// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import java.util.ArrayList;
import android.graphics.SurfaceTexture;
import android.app.ActivityManager;
import android.view.View$OnLayoutChangeListener;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import javax.microedition.khronos.opengles.GL10;

class r
{
    private static String a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private q f;
    
    static {
        r.a = "GLThreadManager";
    }
    
    private void c() {
        if (!this.b) {
            if (GLTextureView.m >= 131072) {
                this.d = true;
            }
            this.b = true;
        }
    }
    
    public void a(final q q) {
        synchronized (this) {
            q.b = true;
            if (this.f == q) {
                this.f = null;
            }
            this.notifyAll();
        }
    }
    
    public void a(final GL10 gl10) {
        boolean e = true;
        synchronized (this) {
            if (!this.c) {
                this.c();
                final String glGetString = gl10.glGetString(7937);
                if (GLTextureView.m < 131072) {
                    this.d = (!glGetString.startsWith("Q3Dimension MSM7500 ") && e);
                    this.notifyAll();
                }
                if (this.d) {
                    e = false;
                }
                this.e = e;
                this.c = true;
            }
        }
    }
    
    public boolean a() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public boolean b() {
        synchronized (this) {
            this.c();
            return !this.d;
        }
    }
    
    public boolean b(final q f) {
        if (this.f == f || this.f == null) {
            this.f = f;
            this.notifyAll();
        }
        else {
            this.c();
            if (!this.d) {
                if (this.f != null) {
                    this.f.i();
                }
                return false;
            }
        }
        return true;
    }
    
    public void c(final q q) {
        if (this.f == q) {
            this.f = null;
        }
        this.notifyAll();
    }
}
