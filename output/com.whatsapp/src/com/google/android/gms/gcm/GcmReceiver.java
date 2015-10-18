// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.gcm;

import android.util.Base64;
import android.os.Build$VERSION;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.support.v4.content.WakefulBroadcastReceiver;

public class GcmReceiver extends WakefulBroadcastReceiver
{
    private static String zzavK;
    
    static {
        GcmReceiver.zzavK = "google.com/iid";
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean a = zzb$zza.a;
        intent.setComponent((ComponentName)null);
        intent.setPackage(context.getPackageName());
        if (Build$VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction()) || GcmReceiver.zzavK.equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        final String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Label_0147: {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
                this.zzc(context, intent);
                if (!a) {
                    break Label_0147;
                }
                final boolean a2 = com.google.android.gms.iid.zzb$zza.a;
                boolean a3 = false;
                if (!a2) {
                    a3 = true;
                }
                com.google.android.gms.iid.zzb$zza.a = a3;
            }
            WakefulBroadcastReceiver.startWakefulService(context, intent);
        }
        if (this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }
    
    public void zzc(final Context context, final Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }
}
