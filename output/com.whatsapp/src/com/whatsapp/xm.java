// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.text.NumberFormat;
import android.widget.TextView;

class xm implements Runnable
{
    final c5 a;
    final int b;
    
    xm(final c5 a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.a.isCancelled()) {
            ((TextView)this.a.a.findViewById(2131755386)).setText((CharSequence)NumberFormat.getInstance().format(this.b));
        }
    }
}
