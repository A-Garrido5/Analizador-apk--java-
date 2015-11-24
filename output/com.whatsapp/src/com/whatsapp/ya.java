// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ya implements DialogInterface$OnClickListener
{
    final int a;
    final AccountInfoActivity b;
    
    ya(final AccountInfoActivity b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(this.a);
    }
}
