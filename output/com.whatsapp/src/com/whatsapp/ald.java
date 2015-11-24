// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface;
import java.util.ArrayList;
import android.content.DialogInterface$OnClickListener;

class ald implements DialogInterface$OnClickListener
{
    final ArrayList a;
    final BroadcastDetails b;
    
    ald(final BroadcastDetails b, final ArrayList a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n < this.a.size()) {
            BroadcastDetails.a(this.b, BroadcastDetails.e(this.b), this.a.get(n));
        }
        this.b.removeDialog(3);
    }
}
