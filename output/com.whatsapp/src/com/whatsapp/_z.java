// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class _z implements DialogInterface$OnClickListener
{
    final int[] a;
    final String b;
    final Conversation c;
    final int d;
    
    _z(final Conversation c, final int[] a, final String b, final int d) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Conversation.a(this.c, this.a[n], this.b, this.d);
    }
}
