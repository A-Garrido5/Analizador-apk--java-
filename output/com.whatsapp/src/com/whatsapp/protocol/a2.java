// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class a2 extends a
{
    final bf a;
    final c2 b;
    final Runnable c;
    
    a2(final bf a, final Runnable c, final c2 b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.c != null) {
            this.c.run();
        }
    }
}
