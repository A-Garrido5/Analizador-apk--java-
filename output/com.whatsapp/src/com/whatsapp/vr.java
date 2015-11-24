// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class vr implements Runnable
{
    final bi a;
    final long b;
    final vy c;
    
    vr(final vy c, final bi a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        vy.a(this.c, this.a, this.b);
    }
}
