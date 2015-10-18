// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class ac extends a
{
    final Runnable a;
    final c2 b;
    final bf c;
    
    ac(final bf c, final Runnable a, final c2 b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        if (this.b != null) {
            this.b.a(n);
        }
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        if (this.a != null) {
            this.a.run();
        }
    }
}
