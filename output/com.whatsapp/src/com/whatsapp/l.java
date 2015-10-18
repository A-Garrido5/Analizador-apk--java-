// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class l implements View$OnClickListener
{
    final HomeActivity a;
    
    l(final HomeActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        HomeActivity.a(this.a, true);
    }
}
