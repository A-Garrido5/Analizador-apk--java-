// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class q5 implements View$OnClickListener
{
    final MediaView a;
    
    q5(final MediaView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        MediaView.a(this.a, !MediaView.k(this.a));
    }
}
