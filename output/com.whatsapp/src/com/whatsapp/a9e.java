// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a9e implements DialogInterface$OnClickListener
{
    final ContactPicker a;
    
    a9e(final ContactPicker a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.removeDialog(4);
        this.a.startActivity(new Intent((Context)this.a, (Class)AccountInfoActivity.class));
    }
}
