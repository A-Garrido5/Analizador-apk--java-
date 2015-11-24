// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.util.SparseArray;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.app.PendingIntent;
import android.widget.RemoteViews;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import android.app.Notification$Builder;

public class NotificationCompatKitKat$Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{
    public static boolean a;
    private static final String[] z;
    private Notification$Builder b;
    private List mActionExtrasList;
    private Bundle mExtras;
    
    static {
        final String[] z2 = new String[7];
        String s = "'m;Js/gqKi6s0Jhhj,\u007fn)v/ki+n>Je";
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
                        c2 = '\u001c';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '\u0003';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = '8';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "'m;Js/gqKi6s0Jhhv,]O/g:{t'm1]p";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'m;Js/gqHy)s3]";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "'m;Js/gqKi6s0Jhhd-Wi6H:A";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "'m;Js/gqKi6s0Jhhp0Jh\rf&";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "'m;Js/gqKi6s0Jhho0[}*L1Te";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "'m;Js/gqKi6s0Jhhb<Lu)m\u001a@h4b,";
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
    
    public NotificationCompatKitKat$Builder(final Context context, final Notification notification, final CharSequence contentTitle, final CharSequence contentText, final CharSequence contentInfo, final RemoteViews remoteViews, final int number, final PendingIntent contentIntent, final PendingIntent pendingIntent, final Bitmap largeIcon, final int n, final int n2, final boolean b, final boolean showWhen, final boolean usesChronometer, final int priority, final CharSequence subText, final boolean b2, final ArrayList list, final Bundle bundle, final String s, final boolean b3, final String s2) {
        final int a = NotificationCompatBase$Action.a;
        this.mActionExtrasList = new ArrayList();
        this.b = new Notification$Builder(context).setWhen(notification.when).setShowWhen(showWhen).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((0x2 & notification.flags) != 0x0).setOnlyAlertOnce((0x8 & notification.flags) != 0x0).setAutoCancel((0x10 & notification.flags) != 0x0).setDefaults(notification.defaults).setContentTitle(contentTitle).setContentText(contentText).setSubText(subText).setContentInfo(contentInfo).setContentIntent(contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent, (0x80 & notification.flags) != 0x0).setLargeIcon(largeIcon).setNumber(number).setUsesChronometer(usesChronometer).setPriority(priority).setProgress(n, n2, b);
        this.mExtras = new Bundle();
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        if (list != null && !list.isEmpty()) {
            this.mExtras.putStringArray(NotificationCompatKitKat$Builder.z[2], (String[])list.toArray(new String[list.size()]));
        }
        if (b2) {
            this.mExtras.putBoolean(NotificationCompatKitKat$Builder.z[5], true);
        }
        Label_0408: {
            if (s != null) {
                this.mExtras.putString(NotificationCompatKitKat$Builder.z[3], s);
                if (b3) {
                    this.mExtras.putBoolean(NotificationCompatKitKat$Builder.z[0], true);
                    if (a == 0) {
                        break Label_0408;
                    }
                    ++RemoteInputCompatBase$RemoteInput.a;
                }
                this.mExtras.putBoolean(NotificationCompatKitKat$Builder.z[1], true);
            }
        }
        if (s2 != null) {
            this.mExtras.putString(NotificationCompatKitKat$Builder.z[4], s2);
        }
    }
    
    @Override
    public void addAction(final NotificationCompatBase$Action notificationCompatBase$Action) {
        this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, notificationCompatBase$Action));
    }
    
    public Notification build() {
        final SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
        if (buildActionExtrasMap != null) {
            this.mExtras.putSparseParcelableArray(NotificationCompatKitKat$Builder.z[6], buildActionExtrasMap);
        }
        this.b.setExtras(this.mExtras);
        return this.b.build();
    }
    
    @Override
    public Notification$Builder getBuilder() {
        return this.b;
    }
}
