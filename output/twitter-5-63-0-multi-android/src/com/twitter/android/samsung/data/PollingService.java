// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import android.app.AlarmManager;
import com.twitter.android.samsung.single.i;
import android.os.IBinder;
import com.twitter.android.samsung.single.n;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.samsung.single.TwitterWidgetProvider;
import android.app.PendingIntent;
import android.app.Service;

@Deprecated
public class PollingService extends Service
{
    private PendingIntent a(final int n) {
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.c);
        intent.putExtra("appWidgetId", n);
        return PendingIntent.getBroadcast((Context)this, n, intent, 134217728);
    }
    
    public static void a(final Context context) {
        final int[] d = n.d(context);
        for (int i = 0; i < d.length; ++i) {
            a(context, d[i]);
        }
    }
    
    public static void a(final Context context, final int n) {
        final Intent intent = new Intent("com.twitter.android.polling.set_alarm");
        intent.putExtra("appWidgetId", n);
        intent.setClass(context, (Class)PollingService.class);
        context.startService(intent);
    }
    
    public static void b(final Context context) {
        final int[] d = n.d(context);
        for (int i = 0; i < d.length; ++i) {
            b(context, d[i]);
        }
    }
    
    public static void b(final Context context, final int n) {
        final Intent intent = new Intent("com.twitter.android.polling.kill_alarm");
        intent.putExtra("appWidgetId", n);
        intent.setClass(context, (Class)PollingService.class);
        context.startService(intent);
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        if (intent != null) {
            final int intExtra = intent.getIntExtra("appWidgetId", -1);
            final long c = i.c((Context)this, intExtra);
            if (intent.getAction().equals("com.twitter.android.polling.set_alarm") && c > 0L) {
                final AlarmManager alarmManager = (AlarmManager)this.getSystemService("alarm");
                final long n3 = 1000L * (c * 60L);
                alarmManager.setInexactRepeating(1, n3 + System.currentTimeMillis(), n3, this.a(intExtra));
            }
            else if (intent.getAction().equals("com.twitter.android.polling.kill_alarm") || c <= 0L) {
                ((AlarmManager)this.getSystemService("alarm")).cancel(this.a(intExtra));
            }
            else if (intent.getAction().equals("com.twitter.android.polling.stop_service")) {
                final int intExtra2 = intent.getIntExtra("initialStartId", -1);
                if (intExtra2 > -1) {
                    this.stopSelf(intExtra2);
                }
            }
        }
        return super.onStartCommand(intent, n, n2);
    }
}
