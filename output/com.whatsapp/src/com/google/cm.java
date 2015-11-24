// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class cm extends cB
{
    private final String b;
    private final boolean c;
    private final int d;
    
    cm(final int n, final String b) {
        super(n);
        this.b = b;
        this.c = false;
        this.d = 0;
    }
    
    cm(final int n, final String b, final int d) {
        super(n);
        this.c = true;
        this.d = d;
        this.b = b;
    }
    
    String a() {
        return this.b;
    }
    
    boolean b() {
        return this.c;
    }
    
    int c() {
        return this.d;
    }
}
