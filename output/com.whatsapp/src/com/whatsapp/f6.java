// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class f6 implements DialogInterface$OnClickListener
{
    final DialogToastPreferenceActivity a;
    
    f6(final DialogToastPreferenceActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(500);
    }
}
