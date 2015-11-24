// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

class c implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ DataChargesActivity a;
    
    c(final DataChargesActivity a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        if (b) {
            i.a((Context)this.a);
            return;
        }
        i.b((Context)this.a);
    }
}
