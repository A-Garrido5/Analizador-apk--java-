// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

class x extends Handler
{
    private final WeakReference a;
    
    public x(final Tooltip tooltip) {
        super(Looper.getMainLooper());
        this.a = new WeakReference((T)tooltip);
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            case 1: {
                final Tooltip tooltip = (Tooltip)this.a.get();
                if (tooltip != null) {
                    tooltip.a(true);
                    return;
                }
                break;
            }
        }
    }
}
