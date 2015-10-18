// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class av extends a
{
    final Runnable a;
    final b9 b;
    final c2 c;
    final bf d;
    
    av(final bf d, final Runnable a, final c2 c, final b9 b) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.c != null) {
            this.c.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.a != null) {
            this.a.run();
        }
    }
    
    @Override
    public void a(final Exception ex) {
        if (this.b != null) {
            this.b.a(ex);
        }
    }
}
