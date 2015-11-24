// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class uf implements Runnable
{
    final ie a;
    final a_9 b;
    
    uf(final ie a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.b.a = 0L;
        App.S.a(this.b);
        App.Y.b(this.b.u);
        App.a7.b(this.b.u);
        App.aq.a5().post((Runnable)new mh(this));
    }
}
