// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class lf implements View$OnClickListener
{
    final ViewSharedContactActivity a;
    
    lf(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
