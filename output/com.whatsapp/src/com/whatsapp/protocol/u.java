// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class u extends a
{
    final bf a;
    final Runnable b;
    final c2 c;
    
    u(final bf a, final Runnable b, final c2 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final int n) {
        if (this.c != null) {
            this.c.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
