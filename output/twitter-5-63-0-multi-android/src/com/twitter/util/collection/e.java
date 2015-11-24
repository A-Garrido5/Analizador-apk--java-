// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

public class e
{
    private f[] a;
    private int b;
    private int c;
    private float d;
    
    public e() {
        this(20, 0.75f);
    }
    
    public e(final int n) {
        this(n, 0.75f);
    }
    
    public e(int n, final float d) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + n);
        }
        if (d <= 0.0f) {
            throw new IllegalArgumentException("Illegal Load: " + d);
        }
        if (n == 0) {
            n = 1;
        }
        this.d = d;
        this.a = new f[n];
        this.c = (int)(d * n);
    }
    
    public Object a(final int n) {
        final f[] a = this.a;
        for (f d = a[(Integer.MAX_VALUE & n) % a.length]; d != null; d = d.d) {
            if (d.a == n) {
                return d.c;
            }
        }
        return null;
    }
    
    public Object a(final int n, final Object c) {
        f[] array = this.a;
        int n2 = (n & Integer.MAX_VALUE) % array.length;
        for (f d = array[n2]; d != null; d = d.d) {
            if (d.a == n) {
                final Object c2 = d.c;
                d.c = c;
                return c2;
            }
        }
        if (this.b >= this.c) {
            this.a();
            array = this.a;
            n2 = (n & Integer.MAX_VALUE) % array.length;
        }
        array[n2] = new f(n, n, c, array[n2]);
        ++this.b;
        return null;
    }
    
    protected void a() {
        int length = this.a.length;
        final f[] a = this.a;
        final int n = 1 + length * 2;
        final f[] a2 = new f[n];
        this.c = (int)(n * this.d);
        this.a = a2;
        while (true) {
            final int n2 = length - 1;
            if (length <= 0) {
                break;
            }
            f d;
            for (f f = a[n2]; f != null; f = d) {
                d = f.d;
                final int n3 = (Integer.MAX_VALUE & f.a) % n;
                f.d = a2[n3];
                a2[n3] = f;
            }
            length = n2;
        }
    }
}
