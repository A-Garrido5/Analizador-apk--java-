// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class xl extends Handler
{
    xl(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        App.a.stop();
    }
}
