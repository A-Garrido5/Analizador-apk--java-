// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class adh implements Runnable
{
    final int a;
    final ie b;
    final a_9 c;
    
    adh(final ie b, final a_9 c, final int a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        int v;
        if (this.c.v != this.a) {
            v = 0;
        }
        else {
            v = this.c.v;
        }
        final int q = this.c.q;
        final int a = this.a;
        int q2 = 0;
        if (q == a) {
            q2 = this.c.q;
        }
        this.c.a(v, q2);
        App.Y.b(this.c.u);
        App.a7.b(this.c.u);
        App.aq.a5().post((Runnable)new _c(this));
    }
}
