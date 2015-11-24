// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.util.Log;
import android.content.Intent;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

class GoogleCloudMessaging$1 extends Handler
{
    final GoogleCloudMessaging zzavY;
    
    GoogleCloudMessaging$1(final GoogleCloudMessaging zzavY, final Looper looper) {
        this.zzavY = zzavY;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("GCM", "Dropping invalid message");
        }
        final Intent intent = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
            GoogleCloudMessaging.zza(this.zzavY).add(intent);
            if (!zzb$zza.a) {
                return;
            }
        }
        if (!GoogleCloudMessaging.zza(this.zzavY, intent)) {
            intent.setPackage(GoogleCloudMessaging.zzb(this.zzavY).getPackageName());
            GoogleCloudMessaging.zzb(this.zzavY).sendBroadcast(intent);
        }
    }
}
