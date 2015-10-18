// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class sc implements Runnable
{
    final int a;
    final String b;
    final long c;
    final vy d;
    final bi e;
    
    sc(final vy d, final bi e, final String b, final int a, final long c) {
        this.d = d;
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        vy.a(this.d, this.e, this.b, this.a, this.c);
    }
}
