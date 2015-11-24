// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.NotificationManagerCompat;
import android.app.PendingIntent;
import android.app.Notification;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class App$33 extends BroadcastReceiver
{
    private static final String[] z;
    final App a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\rHi|F\t_p @\u001eYm:[\u0002J|'F\u0015\u0017o6F\u0005^p6P";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '4';
                        break;
                    }
                    case 0: {
                        c2 = 'l';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '\u0019';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\rHi|F\t_p @\u001eYm:[\u0002J|'F\u0015\u0017m:Y\tWl'";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    App$33(final App a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(App$33.z[1]);
        if (App.c((Context)App.aq) != 3) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String string = this.a.getString(2131231881);
            final String string2 = this.a.getString(2131231883);
            final String string3 = this.a.getString(2131231882);
            final Notification notification = new Notification(2130838963, (CharSequence)string, currentTimeMillis);
            notification.defaults = 3;
            notification.flags = 16;
            final Context applicationContext = this.a.getApplicationContext();
            notification.setLatestEventInfo(applicationContext, (CharSequence)string2, (CharSequence)string3, PendingIntent.getActivity(applicationContext, 0, new Intent(applicationContext, (Class)Main.class), 268435456));
            NotificationManagerCompat.from((Context)this.a).notify(1, notification);
            if (!App.I) {
                return;
            }
        }
        Log.i(App$33.z[0]);
    }
}
