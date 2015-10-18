// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.location.Location;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import com.google.android.gms.location.g;
import android.os.Handler;

class cb extends Handler
{
    private final g a;
    
    public cb(final g a) {
        this.a = a;
    }
    
    public cb(final g a, final Looper looper) {
        super(looper);
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
            }
            case 1: {
                this.a.a(new Location((Location)message.obj));
            }
        }
    }
}
