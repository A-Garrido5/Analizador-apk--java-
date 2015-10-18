// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.support.v4.app.NotificationManagerCompat;
import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.Main;
import android.support.v4.app.NotificationCompat$Builder;
import android.text.format.Formatter;
import com.whatsapp.App;
import android.content.Context;

public class bq
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "?fA\u0011a(qC\u0011a.qAQw3gX\u0017|upZ\rx)dR\u001dvz";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'Z';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = '3';
                        break;
                    }
                    case 3: {
                        c2 = '~';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?fA";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "?fA\u0011a(qC\u0011a.qAQa?d\\\fg?fA\u0011a";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static void a(final Context context) {
        a(context, context.getString(2131231087, new Object[] { Formatter.formatFileSize(context, App.u()) }));
    }
    
    public static void a(final Context context, final int n) {
        final long u = App.u();
        final long n2 = lcmp(u, 10485760L);
        String formatFileSize = null;
        if (n2 < 0) {
            formatFileSize = Formatter.formatFileSize(context, u);
            Log.i(bq.z[0] + formatFileSize);
        }
        if (formatFileSize != null) {
            a(context, context.getString(n) + " " + context.getString(2131231084, new Object[] { formatFileSize }));
            if (!Log.l) {
                return;
            }
        }
        a(context, context.getString(n));
    }
    
    public static void a(final Context context, final String contentText) {
        Log.i(bq.z[2]);
        final NotificationCompat$Builder notificationCompat$Builder = new NotificationCompat$Builder(context);
        notificationCompat$Builder.setCategory(bq.z[1]);
        notificationCompat$Builder.setPriority(1);
        final String string = context.getString(2131231080);
        final String string2 = context.getString(2131231081);
        notificationCompat$Builder.setSmallIcon(2130838964);
        notificationCompat$Builder.setTicker(string);
        notificationCompat$Builder.setContentTitle(string2);
        notificationCompat$Builder.setContentText(contentText);
        notificationCompat$Builder.setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, (Class)Main.class), 268435456));
        NotificationManagerCompat.from(context).notify(2, notificationCompat$Builder.getNotification());
    }
}
