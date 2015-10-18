// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ExternalMediaManager$ExternalMediaStateReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        context.startService(intent.setClass(context, (Class)ExternalMediaManager.class));
    }
}
