// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class zf implements ao
{
    final MediaData a;
    final bi b;
    Runnable c;
    final ek d;
    
    zf(final ek d, final bi b, final MediaData a) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = new aw9(this);
    }
    
    @Override
    public boolean a(final int n) {
        this.a.progress = n;
        ao1.b(this.d.a).post(this.c);
        return false;
    }
}
