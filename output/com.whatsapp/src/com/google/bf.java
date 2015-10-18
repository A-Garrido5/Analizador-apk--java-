// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

abstract class bf
{
    private static final bf[] a;
    
    static {
        a = new bf[] { new ba(null), new bF(null), new bs(null), new bZ(null), new b_(null), new bN(null), new bh(null), new bD(null) };
    }
    
    private bf() {
    }
    
    bf(final f_ f_) {
        this();
    }
    
    static bf a(final int n) {
        if (n >= 0) {
            if (n <= 7) {
                return bf.a[n];
            }
        }
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return bf.a[n];
    }
    
    final void a(final L l, final int n) {
        final int e = bE.e;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                return;
            }
            int n3 = 0;
            int n4 = 0;
            while (true) {
                Label_0048: {
                    if (n3 >= n) {
                        break Label_0048;
                    }
                    try {
                        if (this.a(n2, n3)) {
                            l.c(n3, n2);
                        }
                        ++n3;
                        if (e == 0) {
                            continue;
                        }
                        n4 = n2 + 1;
                        if (e != 0) {
                            return;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                break;
            }
            n2 = n4;
        }
    }
    
    abstract boolean a(final int p0, final int p1);
}
