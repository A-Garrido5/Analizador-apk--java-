// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class InstanceIDListenerService$1 extends Handler
{
    final InstanceIDListenerService zzawZ;
    
    InstanceIDListenerService$1(final InstanceIDListenerService zzawZ, final Looper looper) {
        this.zzawZ = zzawZ;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        InstanceIDListenerService.zza(this.zzawZ, message, MessengerCompat.zzc(message));
    }
}
