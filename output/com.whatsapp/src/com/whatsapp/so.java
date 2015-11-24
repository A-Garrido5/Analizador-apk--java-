// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class so implements View$OnClickListener
{
    final LocationPicker a;
    
    so(final LocationPicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        LocationPicker.n(this.a).runOnFirstFix((Runnable)new q6(this));
    }
}
