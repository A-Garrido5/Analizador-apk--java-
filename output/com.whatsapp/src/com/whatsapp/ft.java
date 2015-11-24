// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;

class ft implements Runnable
{
    final TextView a;
    final aog b;
    
    ft(final aog b, final TextView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setText((CharSequence)"");
    }
}
