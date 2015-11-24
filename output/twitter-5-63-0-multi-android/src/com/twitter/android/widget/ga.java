// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;

class ga implements RadioGroup$OnCheckedChangeListener
{
    final /* synthetic */ TwitterAccessPreference a;
    
    ga(final TwitterAccessPreference a) {
        this.a = a;
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        this.a.c.setEnabled(n == 2131887329);
    }
}
