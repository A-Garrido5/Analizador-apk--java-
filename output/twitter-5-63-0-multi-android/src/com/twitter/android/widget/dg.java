// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

class dg extends Handler
{
    private final WeakReference a;
    
    dg(final dk dk) {
        this.a = new WeakReference((T)dk);
    }
    
    public void handleMessage(final Message message) {
        final dk dk = (dk)this.a.get();
        if (dk != null) {
            dk.hide();
        }
    }
}
