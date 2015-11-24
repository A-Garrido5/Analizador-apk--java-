// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.os.Bundle;
import android.support.v4.app.NotificationCompat$Action$Builder;
import android.support.v4.app.NotificationCompat$Action;
import android.database.Cursor;
import android.support.v4.app.NotificationCompat$Extender;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import android.text.TextUtils;
import com.whatsapp.s0;
import android.support.v4.app.RemoteInput$Builder;
import android.support.v4.app.RemoteInput;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.Notification;
import android.os.Build$VERSION;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import com.whatsapp.App;
import android.support.v4.app.NotificationCompat$WearableExtender;
import android.graphics.Bitmap;
import com.whatsapp.protocol.bi;
import android.content.Intent;
import android.app.PendingIntent;
import com.whatsapp.a_9;
import android.content.Context;
import android.app.IntentService;

public final class AndroidWear extends IntentService
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "rV";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00192\u0002D\u0019\u001189A\u0013\u0019.9@\u0019\u0011?\u0003i\u001f\u0016,\u0013B";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u00192\u0002D\u0019\u001189A\u0013\u0019.9@\u0019\u0011?\u0003i\u001f\u0016,\u0013B";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "5\u001d4})*\u0019'r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "5\u001d4})*\u0019'r";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "92\u0002D\u0019\u001181S\u0017\n";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public AndroidWear() {
        super(AndroidWear.z[5]);
    }
    
    public static PendingIntent a(final Context context, final a_9 a_9) {
        return PendingIntent.getService(context, 0, new Intent((String)null, a_9.h(), context, (Class)AndroidWear.class), 0);
    }
    
    public static NotificationCompat$WearableExtender a(final Context context, final a_9 a_9, final boolean b, final bi bi, final boolean b2, final Bitmap background) {
        final NotificationCompat$WearableExtender notificationCompat$WearableExtender = new NotificationCompat$WearableExtender();
        if (b && bi != null && bi.I == 1 && bi.N != null) {
            notificationCompat$WearableExtender.addPage(b());
        }
        if (!App.q()) {
            notificationCompat$WearableExtender.addPage(d(context, a_9));
        }
        notificationCompat$WearableExtender.addAction(e(context, a_9));
        if (b2) {
            notificationCompat$WearableExtender.setBackground(background);
        }
        return notificationCompat$WearableExtender;
    }
    
    private static void a(final String s) {
        final boolean a = PopupNotification.A;
        final String[] stringArray = App.aq.getResources().getStringArray(2131689472);
        if (s.equals(stringArray[0])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_SMILEEMOJI, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[1])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_YES, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[2])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_NO, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[3])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_ONMYWAY, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[4])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_OK, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[5])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_SEEYOUSOON, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[6])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_HAHA, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[7])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_LOL, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[8])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_NICE, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[9])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_SORRYCANTTALK, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[10])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_SADEMOJI, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        if (s.equals(stringArray[11])) {
            a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_THANKS, Integer.valueOf(1));
            if (!a) {
                return;
            }
        }
        a5.a((Context)App.aq, a1.ANDROID_WEAR_RESPONSE_VOICE, Integer.valueOf(1));
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 18;
    }
    
    private static Notification b() {
        return new NotificationCompat$WearableExtender().setHintShowBackgroundOnly(true).extend(new NotificationCompat$Builder((Context)App.aq)).build();
    }
    
    public static PendingIntent b(final Context context, final a_9 a_9) {
        return PendingIntent.getService(context, 0, new Intent(AndroidWear.z[4], a_9.h(), context, (Class)AndroidWear.class), 0);
    }
    
    public static RemoteInput c(final Context context, final a_9 a_9) {
        return new RemoteInput$Builder(AndroidWear.z[1]).setLabel(context.getString(2131231605, new Object[] { a_9.a(context) })).setChoices(context.getResources().getStringArray(2131689472)).build();
    }
    
    private static Notification d(final Context context, final a_9 a_9) {
        CharSequence charSequence = "";
        final Cursor a = App.ak.a(a_9.u, 20, (s0)null);
        Label_0155: {
            if (a == null) {
                break Label_0155;
            }
            try {
                if (a.moveToLast()) {
                    if (App.ak.x(a_9.u)) {
                        charSequence = TextUtils.concat(new CharSequence[] { charSequence, "\u2026" });
                    }
                    do {
                        final CharSequence a2 = y.a(context, App.ak.a(a, a_9.u), a_9, false, true);
                        if (a2 != "") {
                            if (charSequence != "") {
                                charSequence = TextUtils.concat(new CharSequence[] { charSequence, AndroidWear.z[0] });
                            }
                            charSequence = TextUtils.concat(new CharSequence[] { charSequence, a2 });
                        }
                    } while (a.moveToPrevious());
                }
                a.close();
                return new NotificationCompat$Builder((Context)App.aq).setStyle(new NotificationCompat$BigTextStyle().bigText(charSequence)).extend(new NotificationCompat$WearableExtender().setStartScrollBottom(true)).build();
            }
            finally {
                a.close();
            }
        }
    }
    
    private static NotificationCompat$Action e(final Context context, final a_9 a_9) {
        final RemoteInput c = c(context, a_9);
        return new NotificationCompat$Action$Builder(2130838769, c.getLabel(), a(context, a_9)).addRemoteInput(c).build();
    }
    
    protected void onHandleIntent(final Intent intent) {
        if (intent != null) {
            final Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent != null) {
                final a_9 a = App.S.a(intent.getData());
                final String string = resultsFromIntent.getCharSequence(AndroidWear.z[2]).toString();
                App.aq.a5().post((Runnable)new p(this, a, string));
                a(string);
                if (!PopupNotification.A) {
                    return;
                }
            }
            if (AndroidWear.z[3].equals(intent.getAction())) {
                App.aq.a5().post((Runnable)new aq(this, App.S.a(intent.getData())));
            }
        }
    }
}
