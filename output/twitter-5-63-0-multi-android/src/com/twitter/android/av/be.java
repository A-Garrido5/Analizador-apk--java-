// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

class be extends Handler
{
    private WeakReference a;
    
    private be(final bb bb) {
        super(Looper.getMainLooper());
        this.a = new WeakReference((T)bb);
    }
    
    public void handleMessage(final Message message) {
        final bb bb = (bb)this.a.get();
        if (bb != null && bb.b() != null) {
            switch (message.what) {
                case 2: {
                    bb.b().p();
                }
            }
        }
    }
}
