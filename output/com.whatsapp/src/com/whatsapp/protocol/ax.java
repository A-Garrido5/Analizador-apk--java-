// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ax extends a
{
    final bf a;
    final b9 b;
    final Runnable c;
    final c2 d;
    
    ax(final bf a, final Runnable c, final c2 d, final b9 b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.d != null) {
            this.d.a(n);
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
        if (this.b != null) {
            this.b.a(ex);
        }
    }
}
