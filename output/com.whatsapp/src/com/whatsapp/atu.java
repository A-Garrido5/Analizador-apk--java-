// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class atu implements Runnable
{
    final Voip$DefaultSignalingCallback a;
    final bi b;
    
    atu(final Voip$DefaultSignalingCallback a, final bi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        App.a(this.b);
    }
}
