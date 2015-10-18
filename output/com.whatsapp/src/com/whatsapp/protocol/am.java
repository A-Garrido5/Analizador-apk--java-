// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

class am extends a
{
    final Runnable a;
    final bf b;
    
    am(final bf b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final c0 c0) {
        bf.d(this.b).f();
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        bf.d(this.b).f();
        if (this.a != null) {
            this.a.run();
        }
    }
}
