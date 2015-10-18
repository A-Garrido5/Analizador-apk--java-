// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b9;

class ux implements b9
{
    final String a;
    final p9 b;
    
    ux(final p9 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final Exception ex) {
        l7.a(this.a, 500);
    }
}
