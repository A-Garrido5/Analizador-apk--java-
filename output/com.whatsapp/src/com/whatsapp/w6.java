// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class w6 implements Runnable
{
    final boolean a;
    final vo b;
    
    w6(final vo b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.a) {
            this.b.a.w();
        }
        App.y(this.b.a.u);
    }
}
