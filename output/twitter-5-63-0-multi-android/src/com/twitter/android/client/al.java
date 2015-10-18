// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class al extends Handler
{
    public al(final Looper looper) {
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        this.post((Runnable)message.obj);
    }
}
