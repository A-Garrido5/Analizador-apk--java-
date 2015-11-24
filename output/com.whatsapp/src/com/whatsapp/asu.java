// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class asu implements DialogInterface$OnClickListener
{
    final HomeActivity a;
    
    asu(final HomeActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        HomeActivity.b(this.a);
    }
}
