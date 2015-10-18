// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class rx implements View$OnClickListener
{
    final a_9 a;
    final kj b;
    
    rx(final kj b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.a.l.remove(this.a);
        this.b.notifyDataSetChanged();
        this.b.a.i();
    }
}
