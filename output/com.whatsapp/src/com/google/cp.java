// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cp
{
    static final int a;
    static final int b;
    static final int c;
    static final int d;
    
    static {
        b = a(1, 3);
        a = a(1, 4);
        d = a(2, 0);
        c = a(3, 2);
    }
    
    static int a(final int n) {
        return n & 0x7;
    }
    
    static int a(final int n, final int n2) {
        return n2 | n << 3;
    }
    
    public static int b(final int n) {
        return n >>> 3;
    }
}
