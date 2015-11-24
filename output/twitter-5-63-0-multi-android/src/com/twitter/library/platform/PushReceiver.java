// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.content.Context;
import com.google.android.gcm.GCMBroadcastReceiver;

public class PushReceiver extends GCMBroadcastReceiver
{
    @Override
    protected String a(final Context context) {
        return PushService.class.getName();
    }
}
