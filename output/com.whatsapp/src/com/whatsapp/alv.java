// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class alv implements View$OnClickListener
{
    final MediaView a;
    final ah3 b;
    
    alv(final MediaView a, final ah3 b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        view.setOnClickListener((View$OnClickListener)this.b);
        MediaView.a(this.a, !MediaView.k(this.a));
    }
}
