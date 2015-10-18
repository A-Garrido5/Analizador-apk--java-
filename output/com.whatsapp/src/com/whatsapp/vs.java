// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class vs implements DialogInterface$OnClickListener
{
    final int a;
    final pr b;
    
    vs(final pr b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        pr.a(this.b).removeDialog(this.a);
        pr.a(this.b).showDialog(106);
    }
}
