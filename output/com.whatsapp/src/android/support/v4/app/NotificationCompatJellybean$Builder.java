// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.app.PendingIntent;
import android.widget.RemoteViews;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import android.app.Notification$Builder;

public class NotificationCompatJellybean$Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{
    public static boolean a;
    private static final String[] z;
    private Notification$Builder b;
    private List mActionExtrasList;
    private final Bundle mExtras;
    
    static {
        final String[] z2 = new String[6];
        String s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o#\u0014f\u0018.,2j\u00053#\u0004";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o1\u0018`\u0005\n'\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o%\u0005}\u00041\t\u0012k";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o+\u0004U\u0003.7\u0007A\u0004,/\u0016`\b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o.\u0018q\u0010-\r\u0019~\b";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = " ,\u0013`\u001e(&Ya\u000412\u0018`\u0005o7\u0004w\"(&\u0012Q\u0019 ,\u0019w\u001d";
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
    
    public NotificationCompatJellybean$Builder(final Context context, final Notification notification, final CharSequence contentTitle, final CharSequence contentText, final CharSequence contentInfo, final RemoteViews remoteViews, final int number, final PendingIntent contentIntent, final PendingIntent pendingIntent, final Bitmap largeIcon, final int n, final int n2, final boolean b, final boolean usesChronometer, final int priority, final CharSequence subText, final boolean b2, final Bundle bundle, final String s, final boolean b3, final String s2) {
        this.mActionExtrasList = new ArrayList();
        this.b = new Notification$Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((0x2 & notification.flags) != 0x0).setOnlyAlertOnce((0x8 & notification.flags) != 0x0).setAutoCancel((0x10 & notification.flags) != 0x0).setDefaults(notification.defaults).setContentTitle(contentTitle).setContentText(contentText).setSubText(subText).setContentInfo(contentInfo).setContentIntent(contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent, (0x80 & notification.flags) != 0x0).setLargeIcon(largeIcon).setNumber(number).setUsesChronometer(usesChronometer).setPriority(priority).setProgress(n, n2, b);
        this.mExtras = new Bundle();
        if (bundle != null) {
            this.mExtras.putAll(bundle);
        }
        if (b2) {
            this.mExtras.putBoolean(NotificationCompatJellybean$Builder.z[4], true);
        }
        Label_0350: {
            if (s != null) {
                this.mExtras.putString(NotificationCompatJellybean$Builder.z[2], s);
                if (b3) {
                    this.mExtras.putBoolean(NotificationCompatJellybean$Builder.z[3], true);
                    if (NotificationCompatBase$Action.a == 0) {
                        break Label_0350;
                    }
                }
                this.mExtras.putBoolean(NotificationCompatJellybean$Builder.z[5], true);
            }
        }
        if (s2 != null) {
            this.mExtras.putString(NotificationCompatJellybean$Builder.z[1], s2);
        }
    }
    
    @Override
    public void addAction(final NotificationCompatBase$Action notificationCompatBase$Action) {
        this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.b, notificationCompatBase$Action));
    }
    
    public Notification build() {
        final int a = NotificationCompatBase$Action.a;
        final Notification build = this.b.build();
        final Bundle extras = NotificationCompatJellybean.getExtras(build);
        final Bundle bundle = new Bundle(this.mExtras);
        for (final String s : this.mExtras.keySet()) {
            if (extras.containsKey(s)) {
                bundle.remove(s);
            }
            if (a != 0) {
                break;
            }
        }
        extras.putAll(bundle);
        final SparseArray buildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
        if (buildActionExtrasMap != null) {
            NotificationCompatJellybean.getExtras(build).putSparseParcelableArray(NotificationCompatJellybean$Builder.z[0], buildActionExtrasMap);
        }
        return build;
    }
    
    @Override
    public Notification$Builder getBuilder() {
        return this.b;
    }
}
