// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Message;
import android.util.Log;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.g;
import android.os.Handler;
import com.google.android.gms.location.m;

class cc extends m
{
    private Handler a;
    
    cc(final g g, final Looper looper) {
        cb a;
        if (looper == null) {
            a = new cb(g);
        }
        else {
            a = new cb(g, looper);
        }
        this.a = a;
    }
    
    public void a() {
        this.a = null;
    }
    
    public void a(final Location obj) {
        if (this.a == null) {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        }
        final Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        this.a.sendMessage(obtain);
    }
}
