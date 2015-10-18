// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class a8 extends a
{
    final Runnable a;
    final bf b;
    final c2 c;
    
    a8(final bf b, final Runnable a, final c2 c) {
        this.b = b;
        this.a = a;
        this.c = c;
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
}
