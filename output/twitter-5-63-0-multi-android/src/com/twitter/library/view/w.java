// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.view.ViewConfiguration;
import android.text.Layout;
import android.view.View;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class w extends Handler
{
    private final u a;
    
    public w(final u a) {
        super(Looper.getMainLooper());
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                throw new IllegalArgumentException("Unknown message!");
            }
            case 1: {
                this.a.a(true);
            }
            case 2: {
                this.a.a(false);
            }
            case 3: {
                this.a.a();
            }
        }
    }
}
