// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.f;
import com.whatsapp.contact.h;

class _k implements Runnable
{
    final ViewSharedContactActivity a;
    
    _k(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        f.d(this.a.getApplicationContext(), h.INTERACTIVE_DELTA);
    }
}
