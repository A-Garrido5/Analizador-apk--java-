// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Handler;
import android.content.IntentFilter;
import android.os.Build$VERSION;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;

final class AvailabilityTimeoutAlarmBroadcastReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "{7XN\u0018p9A\u0013\u000eh(\u001b\u0001\u0003y*XN.N\u0019|,.Z\u0014p?;Q\u0015p/:L";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'o';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = 'X';
                        break;
                    }
                    case 2: {
                        c2 = '5';
                        break;
                    }
                    case 3: {
                        c2 = '`';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "{7XN\u0018p9A\u0013\u000eh(\u001b\u0010\nj5\\\u0013\u001cq7[N-J\u0017t$,Y\u000ba";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "{7XN\u0018p9A\u0013\u000eh(\u001b\u0001\u0003y*XN.N\u0019|,.Z\u0014p?;Q\u0015p/:L";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "{7XN\u0018p9A\u0013\u000eh(";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "y(EO\u001fj=F\u0005\u0001{=T\u0016\u000eq4T\u0002\u0003}wA\t\u0002}7@\u0014";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "y4T\u0012\u0002";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "y4T\u0012\u0002";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private Intent a() {
        return new Intent(AvailabilityTimeoutAlarmBroadcastReceiver.z[2]).setPackage(AvailabilityTimeoutAlarmBroadcastReceiver.z[3]);
    }
    
    void a(final Context context) {
        final long n = 15000L + System.currentTimeMillis();
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, this.a(), 0);
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService(AvailabilityTimeoutAlarmBroadcastReceiver.z[6]);
        if (Build$VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, n, broadcast);
            if (!App.I) {
                return;
            }
        }
        alarmManager.set(0, n, broadcast);
    }
    
    void b(final Context context) {
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, this.a(), 536870912);
        if (broadcast != null) {
            ((AlarmManager)context.getSystemService(AvailabilityTimeoutAlarmBroadcastReceiver.z[5])).cancel(broadcast);
        }
    }
    
    public void c(final Context context) {
        context.registerReceiver((BroadcastReceiver)this, new IntentFilter(AvailabilityTimeoutAlarmBroadcastReceiver.z[0]), AvailabilityTimeoutAlarmBroadcastReceiver.z[1], (Handler)null);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(AvailabilityTimeoutAlarmBroadcastReceiver.z[4]);
        if (App.au != 1) {
            App.au = 3;
            App.ad();
        }
    }
}
