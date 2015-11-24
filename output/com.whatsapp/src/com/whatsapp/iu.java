// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import android.view.View$OnClickListener;

class iu implements View$OnClickListener
{
    final vb a;
    
    iu(final vb a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        aam.a(aq.TELL_A_FRIEND, ag.EMPTY_CONTACTS);
        App.a((Activity)this.a.a);
    }
}
