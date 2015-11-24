// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AccountsChangedReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        new b(context).execute((Object[])new Void[0]);
    }
}
