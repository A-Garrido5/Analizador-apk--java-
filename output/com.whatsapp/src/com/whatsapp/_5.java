// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

class _5 implements DialogInterface$OnCancelListener
{
    final BroadcastDetails a;
    
    _5(final BroadcastDetails a) {
        this.a = a;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        this.a.removeDialog(3);
    }
}
