// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

class w
{
    private int a;
    private int b;
    
    private w() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }
    
    private int b(final int a) {
        if (this.a == Integer.MIN_VALUE) {
            this.a = a;
        }
        return this.a;
    }
    
    public int a(final int b) {
        int n;
        if (this.b != Integer.MIN_VALUE) {
            n = b - this.b;
        }
        else {
            n = b;
        }
        this.b = b;
        return n;
    }
    
    public int a(final int n, final float n2) {
        if (Math.abs(n) > 0) {
            return this.a((int)Math.ceil(n2 * this.b(n)));
        }
        return 0;
    }
    
    public void a() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }
}
