// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.k;
import android.content.Context;
import com.whatsapp.contact.f;
import com.whatsapp.contact.h;

class ox implements Runnable
{
    final ContactPicker a;
    final boolean b;
    
    ox(final ContactPicker a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (App.aV >= 1) {
            ContactPicker.l(this.a);
        }
        final Context applicationContext = this.a.getApplicationContext();
        h h;
        if (this.b) {
            h = com.whatsapp.contact.h.INTERACTIVE_FULL;
        }
        else {
            h = com.whatsapp.contact.h.INTERACTIVE_DELTA;
        }
        final k d = f.d(applicationContext, h);
        if (App.aV >= 1) {
            ContactPicker.l(this.a);
        }
        ContactPicker.k(this.a).post((Runnable)new a8k(this, d));
    }
}
