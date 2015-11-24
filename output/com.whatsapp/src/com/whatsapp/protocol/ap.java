// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ap extends a
{
    final int a;
    final bf b;
    final String c;
    
    ap(final bf b, final int a, final String c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a(final int n) {
        this.b.w.a(n, this.a, this.c);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
    }
}
