// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;

class __ implements Runnable
{
    final TextView a;
    final aog b;
    
    __(final aog b, final TextView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setText((CharSequence)"");
    }
}
