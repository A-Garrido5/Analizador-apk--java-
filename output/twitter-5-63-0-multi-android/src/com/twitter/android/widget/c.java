// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.PointF;

public class c
{
    public static final Runnable a;
    private final PointF b;
    private Runnable c;
    private xm d;
    
    static {
        a = new d();
    }
    
    public c() {
        this(xm.a);
    }
    
    public c(final xm d) {
        this.b = new PointF();
        this.d = d;
    }
    
    public c a(final Runnable c) {
        this.c = c;
        return this;
    }
    
    public xm a() {
        return this.d;
    }
    
    public void a(final PointF pointF) {
        this.b.set(pointF);
    }
    
    public Runnable b() {
        if (this.c == null) {
            return com.twitter.android.widget.c.a;
        }
        return this.c;
    }
}
