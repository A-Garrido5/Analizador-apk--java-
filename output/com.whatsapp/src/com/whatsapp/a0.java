// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.bi;
import android.view.View$OnClickListener;

class a0 implements View$OnClickListener
{
    final bi a;
    final MediaView b;
    
    a0(final MediaView b, final bi a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        MediaView.a(this.b, this.a, 0);
    }
}
