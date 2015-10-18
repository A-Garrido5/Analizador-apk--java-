// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

final class l
{
    private final l[] a;
    private final int b;
    private final int c;
    
    l() {
        this.a = new l[256];
        this.b = 0;
        this.c = 0;
    }
    
    l(final int b, final int n) {
        this.a = null;
        this.b = b;
        int c = n & 0x7;
        if (c == 0) {
            c = 8;
        }
        this.c = c;
    }
}
