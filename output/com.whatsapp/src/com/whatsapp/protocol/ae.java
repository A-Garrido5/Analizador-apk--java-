// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ae extends a
{
    final c2 a;
    final bf b;
    final Runnable c;
    
    ae(final bf b, final Runnable c, final c2 a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        if (this.a != null) {
            this.a.a(n);
        }
        this.b.w.e(n);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.c != null) {
            this.c.run();
        }
    }
}
