// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a6f implements DialogInterface$OnClickListener
{
    final String a;
    final EnterPhoneNumber b;
    
    a6f(final EnterPhoneNumber b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.removeDialog(22);
        this.b.g(this.a);
    }
}
