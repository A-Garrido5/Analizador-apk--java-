// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class ra extends Handler
{
    final up a;
    
    ra(final up a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (up.a(this.a) != null) {
            if (up.a(this.a).f()) {
                up.a(this.a, this.a.d());
                this.sendEmptyMessageDelayed(0, 50L);
                return;
            }
            if (!up.c(this.a)) {
                this.a.m();
            }
        }
    }
}
