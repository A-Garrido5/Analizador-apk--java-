// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class aq_ implements View$OnClickListener
{
    final ViewSharedContactActivity a;
    
    aq_(final ViewSharedContactActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ViewSharedContactActivity.b(this.a);
    }
}
