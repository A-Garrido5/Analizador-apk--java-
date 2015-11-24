// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class ud extends Handler
{
    final ny a;
    
    ud(final ny a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        this.sendMessage(this.obtainMessage());
    }
}
