// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler;

class zs extends Handler
{
    final TouchImageView a;
    
    zs(final TouchImageView a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        if (System.currentTimeMillis() - 45L >= TouchImageView.a(this.a)) {
            TouchImageView.v = 2;
            TouchImageView.o = -1.0f;
        }
    }
}
