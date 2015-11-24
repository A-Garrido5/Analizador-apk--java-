// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c2;

class ir implements c2
{
    final SetStatus a;
    
    ir(final SetStatus a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        SetStatus.b(this.a);
    }
}
