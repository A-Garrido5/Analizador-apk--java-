// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.os.Handler$Callback;

class _e implements Handler$Callback
{
    final VoipActivity a;
    
    _e(final VoipActivity a) {
        this.a = a;
    }
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return true;
            }
            case 1: {
                VoipActivity.a(this.a);
                return true;
            }
        }
    }
}
