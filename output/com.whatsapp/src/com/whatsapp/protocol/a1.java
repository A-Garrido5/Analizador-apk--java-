// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class a1 extends a
{
    final b9 a;
    final Runnable b;
    final c2 c;
    final bf d;
    
    a1(final bf d, final Runnable b, final c2 c, final b9 a) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
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
    
    @Override
    public void a(final Exception ex) {
        if (this.a != null) {
            this.a.a(ex);
        }
    }
}
