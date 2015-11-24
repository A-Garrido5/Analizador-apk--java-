// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface$OnMultiChoiceClickListener;

class a implements DialogInterface$OnMultiChoiceClickListener
{
    final WaMultiSelectListPreference a;
    
    a(final WaMultiSelectListPreference a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n, final boolean b) {
        WaMultiSelectListPreference.a(this.a)[n] = b;
    }
}
