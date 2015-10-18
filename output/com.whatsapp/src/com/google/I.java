// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class I
{
    private final cs a;
    private final cs b;
    private final int c;
    
    private I(final cs a, final cs b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    I(final cs cs, final cs cs2, final int n, final bK bk) {
        this(cs, cs2, n);
    }
    
    public int a() {
        return this.c;
    }
    
    cs b() {
        return this.b;
    }
    
    cs c() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final boolean b = hK.b;
        final String string = this.a + "/" + this.b + '/' + this.c;
        if (fN.a != 0) {
            hK.b = !b;
        }
        return string;
    }
}
