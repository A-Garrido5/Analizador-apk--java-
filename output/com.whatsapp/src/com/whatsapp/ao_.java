// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.contact.f;
import com.whatsapp.contact.h;

class ao_ implements Runnable
{
    final App a;
    final h b;
    
    ao_(final App a, final h b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        f.d((Context)App.aq, this.b);
    }
}
