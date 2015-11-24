// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;

class ar extends a
{
    final bf a;
    final c2 b;
    final Runnable c;
    
    ar(final bf a, final Runnable c, final c2 b) {
        this.a = a;
        this.c = c;
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
        bf.a(this.a, c0, new Vector());
        bf.b(this.a).a();
        if (this.c != null) {
            this.c.run();
        }
    }
}
