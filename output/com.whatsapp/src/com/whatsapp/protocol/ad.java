// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ad extends a
{
    final c2 a;
    final Runnable b;
    final bf c;
    
    ad(final bf c, final Runnable b, final c2 a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.a != null) {
            this.a.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.b != null) {
            this.b.run();
        }
    }
}
