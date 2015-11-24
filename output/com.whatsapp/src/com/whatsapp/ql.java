// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ql implements DialogInterface$OnClickListener
{
    final CallLogActivity a;
    
    ql(final CallLogActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.a(this.a, true, CallLogActivity.b(this.a).u);
    }
}
