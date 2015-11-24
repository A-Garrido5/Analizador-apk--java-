// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ag extends a
{
    final bf a;
    final c2 b;
    final Runnable c;
    final b9 d;
    
    ag(final bf a, final Runnable c, final c2 b, final b9 d) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
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
    
    @Override
    public void a(final Exception ex) {
        if (this.d != null) {
            this.d.a(ex);
        }
    }
}
