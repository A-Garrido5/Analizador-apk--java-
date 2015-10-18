// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class adt implements Runnable
{
    final m1 a;
    
    adt(final m1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.b(this.a.a, Conversation.V(this.a.a), this.a.a.s.u, true);
            App.ak.G(this.a.a.s.u);
            this.a.a.aI.post((Runnable)new bj(this));
        }
        catch (InterruptedException ex) {}
    }
}
