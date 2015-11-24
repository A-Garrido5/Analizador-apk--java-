// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.text.NumberFormat;
import android.widget.TextView;

class a0w implements Runnable
{
    final int a;
    final a63 b;
    
    a0w(final a63 b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.b.isCancelled()) {
            ((TextView)this.b.a.findViewById(2131755386)).setText((CharSequence)NumberFormat.getInstance().format(this.a));
        }
    }
}
