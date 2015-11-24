// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gcm;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.content.BroadcastReceiver;

public class GCMBroadcastReceiver extends BroadcastReceiver
{
    private static final boolean a;
    private static boolean b;
    
    static {
        a = Log.isLoggable("GCMBroadcastReceiver", 3);
        GCMBroadcastReceiver.b = false;
    }
    
    static final String b(final Context context) {
        return context.getPackageName() + ".GCMIntentService";
    }
    
    protected String a(final Context context) {
        return b(context);
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (GCMBroadcastReceiver.a) {
            Log.v("GCMBroadcastReceiver", "onReceive: " + intent.getAction());
        }
        if (!GCMBroadcastReceiver.b) {
            GCMBroadcastReceiver.b = true;
            final String name = this.getClass().getName();
            if (!name.equals(GCMBroadcastReceiver.class.getName())) {
                com.google.android.gcm.b.a(name);
            }
        }
        final String a = this.a(context);
        if (GCMBroadcastReceiver.a) {
            Log.v("GCMBroadcastReceiver", "GCM IntentService class: " + a);
        }
        GCMBaseIntentService.a(context, intent, a);
        if (this.isOrderedBroadcast()) {
            this.setResult(-1, (String)null, (Bundle)null);
        }
    }
}
