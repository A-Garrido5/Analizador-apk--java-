// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import com.whatsapp.util.co;

class a0j extends co
{
    final ConversationsFragment b;
    
    a0j(final ConversationsFragment b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        aam.a(aq.TELL_A_FRIEND, ag.EMPTY_CONVERSATIONS);
        App.a(this.b.getActivity());
    }
}
