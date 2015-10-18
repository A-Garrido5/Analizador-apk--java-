// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.Bundle;
import android.os.Messenger;
import android.os.HandlerThread;
import android.content.Context;
import android.os.Message;
import android.os.Looper;
import java.util.HashMap;
import android.os.Handler;

class f extends Handler
{
    private final HashMap a;
    
    f(final Looper looper, final HashMap a) {
        super(looper);
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final int arg1 = message.arg1;
        synchronized (this.a) {
            final g g = this.a.remove(arg1);
            // monitorexit(this.a)
            if (g != null) {
                b(g, message.getData());
            }
        }
    }
}
