// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class vo implements Runnable
{
    final a_9 a;
    
    vo(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        boolean b = true;
        final boolean b2 = this.a.v == -1 && this.a.q == -1 && b;
        if (this.a.v != 0 || this.a.q != 0) {
            b = false;
        }
        this.a.z();
        this.a.a(-1, -1);
        App.Y.b(this.a.u);
        App.a7.b(this.a.u);
        if (!b2) {
            App.aq.a5().post((Runnable)new w6(this, b));
        }
    }
}
