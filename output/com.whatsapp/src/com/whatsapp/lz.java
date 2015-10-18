// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class lz extends Handler
{
    final bi a;
    
    lz(final bi a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (bi.a(this.a) != null) {
            bi.a(this.a).a();
            this.sendEmptyMessageDelayed(0, (long)bi.e());
        }
    }
}
