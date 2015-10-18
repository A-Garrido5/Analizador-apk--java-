// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c2;

class ahx implements c2
{
    final DeleteAccount a;
    
    ahx(final DeleteAccount a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        DeleteAccount.a(this.a).sendEmptyMessage(3);
    }
}
