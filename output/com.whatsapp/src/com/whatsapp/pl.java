// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import com.google.android.maps.MapView;
import android.os.Handler;

class pl extends Handler
{
    final MapView a;
    final awq b;
    
    pl(final awq b, final MapView a) {
        this.b = b;
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        Label_0053: {
            if (awq.a(this.b) == awq.c(this.b)) {
                awq.a(this.b, awq.b(this.b));
                if (!App.I) {
                    break Label_0053;
                }
            }
            awq.a(this.b, awq.c(this.b));
        }
        this.a.invalidate(awq.a(this.b).getBounds());
        this.sendEmptyMessageDelayed(0, 500L);
    }
}
