// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import android.view.View;
import android.view.View$OnClickListener;

class a2_ implements View$OnClickListener
{
    final QuickContactActivity a;
    
    a2_(final QuickContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (App.a(QuickContactActivity.c(this.a), this.a, bq.QUICK_CONTACT_INFO)) {
            QuickContactActivity.a(this.a, false);
        }
    }
}
