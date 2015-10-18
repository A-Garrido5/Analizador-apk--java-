// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

class a
{
    final /* synthetic */ AdaptiveTweetMediaView a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    
    public a(final AdaptiveTweetMediaView a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public int a() {
        return this.e;
    }
    
    public void a(final int c, final int d, final int e, final float n) {
        this.e = e;
        this.f = (int)Math.rint(this.e / n);
        this.c = c;
        this.d = d;
        this.g = (this.e - (-1 + this.c) * this.b) / this.c;
        this.h = (this.f - (-1 + this.d) * this.b) / this.d;
    }
    
    public void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        int n6;
        if (n2 + n4 == this.c) {
            n6 = this.e - n2 * (this.g + this.b);
        }
        else {
            n6 = n4 * this.g + this.b * (n4 - 1);
        }
        int n7;
        if (n3 + n5 == this.d) {
            n7 = this.f - n3 * (this.h + this.b);
        }
        else {
            n7 = n5 * this.h + this.b * (n5 - 1);
        }
        this.a.a(n, n6, n7);
    }
    
    public void a(final MediaImageView mediaImageView, final int n, final int n2) {
        final int n3 = n * (this.g + this.b);
        final int n4 = n2 * (this.h + this.b);
        this.a.a(mediaImageView, n3, n4, n3 + mediaImageView.getMeasuredWidth(), n4 + mediaImageView.getMeasuredHeight());
    }
    
    public int b() {
        return this.f;
    }
}
