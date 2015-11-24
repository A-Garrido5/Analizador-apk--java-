// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c2;

class a0v implements c2
{
    final ChangeNumber a;
    
    a0v(final ChangeNumber a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        ChangeNumber.a(this.a).sendEmptyMessage(3);
    }
}
