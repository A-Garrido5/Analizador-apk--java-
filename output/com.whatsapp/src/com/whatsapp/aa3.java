// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class aa3 implements DialogInterface$OnClickListener
{
    final Activity a;
    final String b;
    
    aa3(final Activity a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.a(this.a, false, this.b);
    }
}
