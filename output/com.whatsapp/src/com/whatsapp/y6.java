// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class y6 extends yq
{
    final ao2 c;
    
    y6(final ao2 c, final String s, final boolean b) {
        this.c = c;
        super(s, b);
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        if (n > 0) {
            ao2.a(this.c, n);
        }
        ao2.e(this.c);
    }
    
    @Override
    public void b(final int n) {
        super.b(n);
    }
}
