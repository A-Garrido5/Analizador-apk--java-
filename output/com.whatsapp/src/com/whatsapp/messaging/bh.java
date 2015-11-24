// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.ba;
import com.whatsapp.protocol.b4;
import com.whatsapp.protocol.b_;

class bh implements b_
{
    final ae a;
    
    bh(final ae a) {
        this.a = a;
    }
    
    @Override
    public b4 a(final byte[] array, final byte[] array2) {
        return new ba(array, array2);
    }
}
