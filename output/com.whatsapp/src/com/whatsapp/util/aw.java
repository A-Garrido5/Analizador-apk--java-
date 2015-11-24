// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.drawable.Drawable;
import java.io.File;

public class aw
{
    private final File a;
    private int b;
    private int c;
    private Drawable d;
    private long e;
    private Drawable f;
    
    public aw(final File a) {
        this.e = 1048576L;
        this.b = 4;
        this.a = a;
    }
    
    static int a(final aw aw) {
        return aw.c;
    }
    
    static Drawable b(final aw aw) {
        return aw.d;
    }
    
    static File c(final aw aw) {
        return aw.a;
    }
    
    static int d(final aw aw) {
        return aw.b;
    }
    
    static Drawable e(final aw aw) {
        return aw.f;
    }
    
    static long f(final aw aw) {
        return aw.e;
    }
    
    public aw a(final int c) {
        this.c = c;
        return this;
    }
    
    public aw a(final long e) {
        this.e = e;
        return this;
    }
    
    public aw a(final Drawable f) {
        this.f = f;
        return this;
    }
    
    public b7 a() {
        return new b7(this, null);
    }
    
    public aw b(final Drawable d) {
        this.d = d;
        return this;
    }
}
