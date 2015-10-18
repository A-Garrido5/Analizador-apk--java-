// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

public class ImageHelper$Image
{
    private int a;
    private int b;
    private ImageHelper$Image$AnimationType c;
    
    public ImageHelper$Image(final int n, final int n2) {
        this(n, n2, ImageHelper$Image$AnimationType.b);
    }
    
    public ImageHelper$Image(final int a, final int b, final ImageHelper$Image$AnimationType c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public ImageHelper$Image$AnimationType c() {
        return this.c;
    }
}
