// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.cq;

class a64 implements zt
{
    final q9 a;
    
    a64(final q9 a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        if (s.length() == 0) {
            return;
        }
        App.aq.m(s);
        App.b(s);
        ProfileInfoActivity.d(this.a.a).setText(cq.c(s, (Context)this.a.a));
    }
}
