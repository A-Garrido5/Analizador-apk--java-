// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.m;
import com.whatsapp.protocol.b2;

final class aqp implements Runnable
{
    private final b2 a;
    final asa b;
    private final b2[] c;
    private final byte[] d;
    private final int e;
    
    aqp(final asa b, final byte[] d, final int e, final b2[] c, final b2 a) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.a(this.d, m.a(this.e), (byte)5, this.c, this.a);
    }
}
