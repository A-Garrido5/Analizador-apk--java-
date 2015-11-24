// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class ey implements View$OnClickListener
{
    final DialogToastPreferenceActivity a;
    
    ey(final DialogToastPreferenceActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
