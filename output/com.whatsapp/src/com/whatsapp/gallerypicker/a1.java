// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

class a1
{
    long a;
    int b;
    bj c;
    private final aa d;
    private int e;
    
    public a1(final aa d, final int b) {
        this.e = -1;
        this.d = d;
        this.b = b;
    }
    
    public boolean a() {
        if (this.e >= -1 + this.d.e()) {
            return false;
        }
        final aa d = this.d;
        final int e = 1 + this.e;
        this.e = e;
        this.c = d.a(e);
        this.a = this.c.c();
        return true;
    }
}
