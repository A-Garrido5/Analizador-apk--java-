// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.aa;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class ag implements View$OnClickListener
{
    final LocationPicker2 a;
    
    ag(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        App.a((Context)this.a, LocationPicker2.t(this.a), LocationPicker2.p(this.a));
        LocationPicker2.a(this.a, aa.CUSTOM_LOCATION);
        this.a.finish();
    }
}
