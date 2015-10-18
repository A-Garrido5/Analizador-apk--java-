// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.b9;

class g9 implements b9
{
    final SetStatus a;
    
    g9(final SetStatus a) {
        this.a = a;
    }
    
    @Override
    public void a(final Exception ex) {
        SetStatus.b(this.a);
    }
}
