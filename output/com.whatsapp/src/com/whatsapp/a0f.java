// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a0f implements DialogInterface$OnClickListener
{
    final RecordAudio a;
    
    a0f(final RecordAudio a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(0);
        this.a.finish();
    }
}
