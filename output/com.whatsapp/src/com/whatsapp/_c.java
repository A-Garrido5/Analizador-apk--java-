// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class _c implements Runnable
{
    final adh a;
    
    _c(final adh a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        int n;
        if (this.a.c.s() && this.a.c.q != this.a.a) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.a.c.w();
        if (n != 0) {
            App.a(this.a.c.u, this.a.c.q, 2);
            if (!App.I) {
                return;
            }
        }
        App.y(this.a.c.u);
    }
}
