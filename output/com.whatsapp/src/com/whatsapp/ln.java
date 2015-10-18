// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;

class ln implements Runnable
{
    final List a;
    final c5 b;
    
    ln(final c5 b, final List a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.b.isCancelled()) {
            ContactInfo.a(this.b.a, this.a);
        }
    }
}
