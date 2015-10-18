// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class m extends a
{
    final c2 a;
    final Runnable b;
    final b9 c;
    final bf d;
    
    m(final bf d, final Runnable b, final c2 a, final b9 c) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
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
    
    @Override
    public void a(final Exception ex) {
        if (this.c != null) {
            this.c.a(ex);
        }
    }
}
