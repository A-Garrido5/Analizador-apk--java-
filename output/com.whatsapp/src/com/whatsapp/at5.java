// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.contact.k;
import android.content.Context;
import com.whatsapp.contact.f;
import com.whatsapp.contact.h;

class at5 implements Runnable
{
    final ContactsFragment a;
    final boolean b;
    
    at5(final ContactsFragment a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (App.aV >= 1) {
            ContactsFragment.l(this.a);
        }
        final App aq = App.aq;
        h h;
        if (this.b) {
            h = com.whatsapp.contact.h.INTERACTIVE_FULL;
        }
        else {
            h = com.whatsapp.contact.h.INTERACTIVE_DELTA;
        }
        final k d = f.d((Context)aq, h);
        if (App.aV >= 1) {
            ContactsFragment.l(this.a);
        }
        ContactsFragment.k(this.a).post((Runnable)new aot(this, d));
    }
}
