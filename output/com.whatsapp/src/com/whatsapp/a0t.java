// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import com.whatsapp.util.co;

class a0t extends co
{
    final ContactsFragment b;
    
    a0t(final ContactsFragment b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        aam.a(aq.TELL_A_FRIEND, ag.EMPTY_CONTACTS);
        App.a(this.b.getActivity());
    }
}
