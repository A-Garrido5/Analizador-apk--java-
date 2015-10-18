// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

class cx
{
    private static final cy a;
    private boolean b;
    private int[] c;
    private cy[] d;
    private int e;
    
    static {
        a = new cy();
    }
    
    public cx() {
        this(10);
    }
    
    public cx(final int n) {
        this.b = false;
        final int b = this.b(n);
        this.c = new int[b];
        this.d = new cy[b];
        this.e = 0;
    }
    
    private boolean a(final int[] array, final int[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    private boolean a(final cy[] array, final cy[] array2, final int n) {
        for (int i = 0; i < n; ++i) {
            if (!array[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    
    private int b(final int n) {
        return this.c(n * 4) / 4;
    }
    
    private int c(int n) {
        for (int i = 4; i < 32; ++i) {
            if (n <= -12 + (1 << i)) {
                n = -12 + (1 << i);
                break;
            }
        }
        return n;
    }
    
    private void c() {
        final int e = this.e;
        final int[] c = this.c;
        final cy[] d = this.d;
        int i = 0;
        int e2 = 0;
        while (i < e) {
            final cy cy = d[i];
            if (cy != cx.a) {
                if (i != e2) {
                    c[e2] = c[i];
                    d[e2] = cy;
                    d[i] = null;
                }
                ++e2;
            }
            ++i;
        }
        this.b = false;
        this.e = e2;
    }
    
    public int a() {
        if (this.b) {
            this.c();
        }
        return this.e;
    }
    
    public cy a(final int n) {
        if (this.b) {
            this.c();
        }
        return this.d[n];
    }
    
    public boolean b() {
        return this.a() == 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (!(o instanceof cx)) {
                return false;
            }
            final cx cx = (cx)o;
            if (this.a() != cx.a()) {
                return false;
            }
            if (!this.a(this.c, cx.c, this.e) || !this.a(this.d, cx.d, this.e)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.b) {
            this.c();
        }
        int n = 17;
        for (int i = 0; i < this.e; ++i) {
            n = 31 * (n * 31 + this.c[i]) + this.d[i].hashCode();
        }
        return n;
    }
}
