// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.graphics.Color;

public class ae
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private float[] e;
    
    ae(final int n, final int d) {
        this.a = Color.red(n);
        this.b = Color.green(n);
        this.c = Color.blue(n);
        this.d = d;
    }
    
    ae(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int a() {
        return Color.rgb(this.a, this.b, this.c);
    }
    
    public float[] b() {
        if (this.e == null) {
            this.e = new float[3];
            Color.RGBToHSV(this.a, this.b, this.c, this.e);
        }
        return this.e;
    }
    
    public int c() {
        return this.d;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " #" + Integer.toHexString(this.a()) + ". count: " + this.d;
    }
}
