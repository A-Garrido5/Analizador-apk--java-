// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DeviceStorageLowReceiver extends BroadcastReceiver
{
    private boolean a;
    
    public DeviceStorageLowReceiver() {
        this.a = false;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if ("android.intent.action.DEVICE_STORAGE_LOW".equals(intent.getAction())) {
            this.a = true;
        }
    }
}
