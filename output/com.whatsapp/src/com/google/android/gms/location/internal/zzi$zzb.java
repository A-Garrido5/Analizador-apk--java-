// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.util.Log;
import android.location.Location;
import android.os.Message;
import android.os.Looper;
import com.google.android.gms.location.LocationListener;
import android.os.Handler;

class zzi$zzb extends Handler
{
    private final LocationListener zzayQ;
    
    public zzi$zzb(final LocationListener zzayQ) {
        this.zzayQ = zzayQ;
    }
    
    public zzi$zzb(final LocationListener zzayQ, final Looper looper) {
        super(looper);
        this.zzayQ = zzayQ;
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            case 1: {
                this.zzayQ.onLocationChanged(new Location((Location)message.obj));
                if (zzj.c != 0) {
                    break;
                }
                return;
            }
        }
        Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
    }
}
