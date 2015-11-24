// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class w_ implements DialogInterface$OnClickListener
{
    final SetStatus a;
    
    w_(final SetStatus a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(3);
        SetStatus.r.clear();
        SetStatus.d(this.a);
        this.a.m.notifyDataSetChanged();
    }
}
