// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;

public class GCMChangeReceiver extends BroadcastReceiver
{
    public static final IntentFilter a;
    
    static {
        (a = new IntentFilter()).addAction(PushService.b);
        GCMChangeReceiver.a.addAction(PushService.c);
        GCMChangeReceiver.a.addAction(PushService.a);
    }
    
    private void a(final Context context, final int n, final int n2, final Intent intent) {
        if (intent.getBooleanExtra("show_toast_message", false)) {
            Toast.makeText(context, n, n2).show();
        }
    }
    
    protected void a(final String s) {
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (GCMChangeReceiver.a.hasAction(action)) {
            switch (intent.getIntExtra("push_return_code", 3)) {
                default: {
                    this.a(context, 2131297467, 0, intent);
                    break;
                }
                case 1: {
                    this.a(context, 2131297468, 0, intent);
                    this.a(action);
                }
                case 2: {
                    this.a(context, 2131297469, 0, intent);
                }
            }
        }
    }
}
