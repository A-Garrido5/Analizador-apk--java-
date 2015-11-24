// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.TimerTask;

class ahb extends TimerTask
{
    final a9 a;
    
    ahb(final a9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.aq.a5().post((Runnable)new av(this));
    }
}
