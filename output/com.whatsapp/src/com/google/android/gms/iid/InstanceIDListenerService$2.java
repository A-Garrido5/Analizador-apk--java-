// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class InstanceIDListenerService$2 extends BroadcastReceiver
{
    final InstanceIDListenerService zzawZ;
    
    InstanceIDListenerService$2(final InstanceIDListenerService zzawZ) {
        this.zzawZ = zzawZ;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (Log.isLoggable("InstanceID", 3)) {
            intent.getStringExtra("registration_id");
            Log.d("InstanceID", "Received GSF callback using dynamic receiver: " + intent.getExtras());
        }
        this.zzawZ.zzn(intent);
        this.zzawZ.stop();
    }
}
