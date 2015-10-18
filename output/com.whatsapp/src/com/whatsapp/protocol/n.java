// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class n extends a
{
    final bl a;
    final String b;
    final b9 c;
    final bf d;
    final c2 e;
    
    n(final bf d, final bl a, final String b, final c2 e, final b9 c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public void a(final int n) {
        if (this.e != null) {
            this.e.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.a != null) {
            this.a.a(this.b);
        }
    }
    
    @Override
    public void a(final Exception ex) {
        if (this.c != null) {
            this.c.a(ex);
        }
    }
}
