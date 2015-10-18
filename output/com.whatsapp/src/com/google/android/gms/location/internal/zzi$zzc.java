// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location.internal;

import android.os.Message;
import android.util.Log;
import android.location.Location;
import com.google.android.gms.common.internal.zzu;
import android.os.Looper;
import com.google.android.gms.location.LocationListener;
import android.os.Handler;
import com.google.android.gms.location.zzd$zza;

class zzi$zzc extends zzd$zza
{
    private Handler zzayO;
    
    zzi$zzc(final LocationListener locationListener, final Looper looper) {
        if (looper == null) {
            zzu.zza(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        }
        zzi$zzb zzayO;
        if (looper == null) {
            zzayO = new zzi$zzb(locationListener);
        }
        else {
            zzayO = new zzi$zzb(locationListener, looper);
        }
        this.zzayO = zzayO;
    }
    
    public void onLocationChanged(final Location obj) {
        if (this.zzayO == null) {
            Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
            return;
        }
        final Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = obj;
        this.zzayO.sendMessage(obtain);
    }
    
    public void release() {
        this.zzayO = null;
    }
}
