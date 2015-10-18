// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnCancelListener;

final class a_4 implements DialogInterface$OnCancelListener
{
    final Activity a;
    
    a_4(final Activity a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.finish();
    }
}
