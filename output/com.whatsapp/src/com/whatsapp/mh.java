// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class mh implements Runnable
{
    final uf a;
    
    mh(final uf a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean s = this.a.b.s();
        this.a.b.w();
        if (s) {
            App.a(this.a.b.u, this.a.b.q, 2);
            if (!App.I) {
                return;
            }
        }
        App.y(this.a.b.u);
    }
}
