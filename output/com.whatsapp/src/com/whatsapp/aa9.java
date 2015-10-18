// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.m;
import com.whatsapp.protocol.b2;

final class aa9 implements Runnable
{
    private final int a;
    private final b2[] b;
    private final byte[] c;
    private final b2 d;
    final ro e;
    
    aa9(final ro e, final int a, final byte[] c, final b2[] b, final b2 d) {
        this.e = e;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    @Override
    public void run() {
        App.a(this.c, m.a(this.a), (byte)5, this.b, this.d);
        if (this.e.a != null) {
            App.b(this.e.a);
        }
    }
}
