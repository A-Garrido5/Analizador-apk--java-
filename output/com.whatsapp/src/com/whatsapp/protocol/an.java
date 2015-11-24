// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class an extends a
{
    final b9 a;
    final c2 b;
    final Runnable c;
    final String d;
    final bf e;
    
    an(final bf e, final Runnable c, final c2 b, final String d, final b9 a) {
        this.e = e;
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
        this.e.w.a(n, this.d);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.c != null) {
            this.c.run();
        }
    }
    
    @Override
    public void a(final Exception ex) {
        if (this.a != null) {
            this.a.a(ex);
        }
    }
}
