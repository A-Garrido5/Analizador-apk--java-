// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.featureswitch.d;
import android.app.PendingIntent;
import android.app.AlarmManager;
import java.io.Serializable;
import com.twitter.library.api.PromotedContent;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.content.Context;
import com.twitter.library.client.App;

public class WebsiteDwellMonitor
{
    public static final String a;
    
    static {
        a = App.a(".website.dwell.time");
    }
    
    static ActivityManager$RunningAppProcessInfo a(final Context context) {
        final List runningAppProcesses = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (100 == activityManager$RunningAppProcessInfo.importance && am.b.contains(activityManager$RunningAppProcessInfo.processName)) {
                    return activityManager$RunningAppProcessInfo;
                }
            }
        }
        return null;
    }
    
    public static void a(final Context context, final Intent intent) {
        final WebsiteDwellMonitor$Dwell a = WebsiteDwellMonitor$Dwell.a(intent.getIntExtra("dwell", -1));
        final ActivityManager$RunningAppProcessInfo a2 = a(context);
        if (a != null && a2 != null) {
            final int intExtra = intent.getIntExtra("pid", -1);
            if (WebsiteDwellMonitor$Dwell.a == a || intExtra == a2.pid) {
                final c a3 = c.a(context);
                final PromotedContent promotedContent = (PromotedContent)intent.getSerializableExtra("promoted_content");
                final String stringExtra = intent.getStringExtra("url");
                a3.a(a.b(), promotedContent, stringExtra, null, null, null, null, null, null);
                final WebsiteDwellMonitor$Dwell c = a.c();
                if (c != null && c.e() > 0) {
                    a(context, new Intent(context, (Class)AppBroadcastReceiver.class).putExtra("promoted_content", (Serializable)promotedContent).putExtra("dwell", c.a()).putExtra("url", stringExtra).putExtra("pid", a2.pid).setAction(WebsiteDwellMonitor.a), c.e());
                }
            }
        }
    }
    
    private static void a(final Context context, final Intent intent, final int n) {
        ((AlarmManager)context.getSystemService("alarm")).set(0, 1000L * n + System.currentTimeMillis(), PendingIntent.getBroadcast(context, 0, intent, 134217728));
    }
    
    public static void a(final Context context, final PromotedContent promotedContent, final String s) {
        if (d.f("ad_formats_web_view_dwell_enabled")) {
            a(context, new Intent(context, (Class)AppBroadcastReceiver.class).putExtra("promoted_content", (Serializable)promotedContent).putExtra("dwell", WebsiteDwellMonitor$Dwell.a.a()).putExtra("url", s).putExtra("pid", -1).setAction(WebsiteDwellMonitor.a), WebsiteDwellMonitor$Dwell.a.e());
        }
    }
}
