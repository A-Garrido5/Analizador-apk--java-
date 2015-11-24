// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media.filters;

import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.GLES20;
import javax.microedition.khronos.opengles.GL10;
import android.os.Looper;
import android.os.Handler;
import android.graphics.Bitmap;
import android.net.Uri;
import android.content.Context;

public class b implements u
{
    private float a;
    private float b;
    private Context c;
    private Uri d;
    private Bitmap e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private float j;
    private int k;
    private Filters l;
    private int m;
    private int n;
    private d o;
    private Handler p;
    
    public b() {
        this.p = new Handler(Looper.getMainLooper());
        this.g = false;
        this.h = 0;
        this.b(0.5f);
        this.c(1.0f);
        this.l = null;
        this.c = null;
    }
    
    private void a(final Uri d, final Bitmap e, final boolean f) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.g = false;
    }
    
    private void e() {
        if (this.d != null || this.e != null) {
            if (this.k != 0) {
                this.l.a(this.k);
            }
            if (this.d != null) {
                this.k = this.l.a(this.d, 0, 0, this.f, 0, 0, 0, 0);
            }
            else {
                this.k = this.l.a(this.e, this.f);
            }
            if (this.k > 0) {
                this.g = true;
            }
        }
    }
    
    public void a() {
        if (this.k != 0) {
            this.l.a(this.k);
            this.k = 0;
            this.g = false;
        }
    }
    
    public void a(final float j) {
        this.j = j;
    }
    
    public void a(final int h) {
        this.h = h;
    }
    
    public void a(final Context c, final Filters l) {
        this.c = c;
        this.l = l;
    }
    
    public void a(final Bitmap bitmap, final boolean b) {
        if (!bitmap.equals(this.e) || b != this.f) {
            this.a(null, bitmap, b);
        }
    }
    
    public void a(final d o) {
        this.o = o;
    }
    
    @Override
    public void a(final GL10 gl10) {
        if (this.l == null) {
            return;
        }
        if (!this.g) {
            if (this.k != 0) {
                this.l.a(this.k);
                this.k = 0;
            }
            this.e();
            return;
        }
        this.l.a(this.h, this.k, this.c(), this.d(), this.i, this.j);
        this.p.post((Runnable)new c(this));
    }
    
    @Override
    public void a(final GL10 gl10, final int m, final int n) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, m, n);
        this.m = m;
        this.n = n;
    }
    
    @Override
    public void a(final GL10 gl10, final EGLConfig eglConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        gl10.glDisable(2929);
        gl10.glDisable(2884);
    }
    
    public int b() {
        return this.m;
    }
    
    public void b(final float a) {
        this.a = a;
    }
    
    public void b(final int i) {
        this.i = i;
    }
    
    public float c() {
        return this.a;
    }
    
    public void c(final float b) {
        this.b = b;
    }
    
    public float d() {
        return this.b;
    }
}
