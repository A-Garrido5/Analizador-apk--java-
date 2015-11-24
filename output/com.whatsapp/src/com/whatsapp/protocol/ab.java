// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ab extends a
{
    final c2 a;
    final b9 b;
    final Runnable c;
    final bf d;
    
    ab(final bf d, final Runnable c, final c2 a, final b9 b) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.a != null) {
            this.a.a(n);
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
