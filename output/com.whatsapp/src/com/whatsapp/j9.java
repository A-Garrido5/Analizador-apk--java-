// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnCancelListener;

final class j9 implements DialogInterface$OnCancelListener
{
    final int a;
    final Activity b;
    
    j9(final Activity b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.b.removeDialog(this.a);
    }
}
