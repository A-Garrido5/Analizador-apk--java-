// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;

class ks implements zt
{
    final SetStatus a;
    
    ks(final SetStatus a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        if (s.length() > 0 && !s.equals(this.a.p.getText().toString())) {
            SetStatus.c(this.a).setOnClickListener((View$OnClickListener)null);
            this.a.e(s);
        }
    }
}
