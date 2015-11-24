// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.Notification;
import android.content.ComponentName;
import android.provider.Settings$Secure;
import android.os.Build$VERSION;
import java.util.HashSet;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Set;

public class NotificationManagerCompat
{
    private static final NotificationManagerCompat$Impl IMPL;
    private static final int SIDE_CHANNEL_BIND_FLAGS;
    private static Set sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static NotificationManagerCompat$SideChannelManager sSideChannelManager;
    private static final String[] z;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    
    static {
        final String[] z2 = new String[3];
        String s = "5)+\u001ek2%>\u0003d4(";
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
                        c2 = '\r';
                        break;
                    }
                    case 0: {
                        c2 = '[';
                        break;
                    }
                    case 1: {
                        c2 = 'F';
                        break;
                    }
                    case 2: {
                        c2 = '_';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ":(;\u0005b2\"q\u0004x+60\u0005yu3,\u0012^2\":4e:(1\u0012a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = ">(>\u0015a>\"\u0000\u0019b//9\u001en:26\u0018c\u0004*6\u0004y>(:\u0005~";
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
        sEnabledNotificationListenersLock = new Object();
        NotificationManagerCompat.sEnabledNotificationListenerPackages = new HashSet();
        sLock = new Object();
        if (Build$VERSION.SDK_INT >= 14) {
            IMPL = new NotificationManagerCompat$ImplIceCreamSandwich();
        }
        else if (Build$VERSION.SDK_INT >= 5) {
            IMPL = new NotificationManagerCompat$ImplEclair();
        }
        else {
            IMPL = new NotificationManagerCompat$ImplBase();
        }
        SIDE_CHANNEL_BIND_FLAGS = NotificationManagerCompat.IMPL.getSideChannelBindFlags();
    }
    
    private NotificationManagerCompat(final Context mContext) {
        this.mContext = mContext;
        this.mNotificationManager = (NotificationManager)this.mContext.getSystemService(NotificationManagerCompat.z[0]);
    }
    
    static int access$000() {
        return NotificationManagerCompat.SIDE_CHANNEL_BIND_FLAGS;
    }
    
    public static NotificationManagerCompat from(final Context context) {
        return new NotificationManagerCompat(context);
    }
    
    public static Set getEnabledListenerPackages(final Context context) {
        final int a = Fragment.a;
        final String string = Settings$Secure.getString(context.getContentResolver(), NotificationManagerCompat.z[2]);
        Label_0117: {
            if (string == null || string.equals(NotificationManagerCompat.sEnabledNotificationListeners)) {
                break Label_0117;
            }
            final String[] split = string.split(":");
            final HashSet sEnabledNotificationListenerPackages = new HashSet<String>(split.length);
            final int length = split.length;
            int i = 0;
            while (i < length) {
                final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                if (unflattenFromString != null) {
                    sEnabledNotificationListenerPackages.add(unflattenFromString.getPackageName());
                }
                ++i;
                if (a != 0) {
                    break;
                }
            }
            synchronized (NotificationManagerCompat.sEnabledNotificationListenersLock) {
                NotificationManagerCompat.sEnabledNotificationListenerPackages = sEnabledNotificationListenerPackages;
                NotificationManagerCompat.sEnabledNotificationListeners = string;
                return NotificationManagerCompat.sEnabledNotificationListenerPackages;
            }
        }
    }
    
    private void pushSideChannelQueue(final NotificationManagerCompat$Task notificationManagerCompat$Task) {
        synchronized (NotificationManagerCompat.sLock) {
            if (NotificationManagerCompat.sSideChannelManager == null) {
                NotificationManagerCompat.sSideChannelManager = new NotificationManagerCompat$SideChannelManager(this.mContext.getApplicationContext());
            }
            // monitorexit(NotificationManagerCompat.sLock)
            NotificationManagerCompat.sSideChannelManager.queueTask(notificationManagerCompat$Task);
        }
    }
    
    private static boolean useSideChannelForNotification(final Notification notification) {
        final Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(NotificationManagerCompat.z[1]);
    }
    
    public void cancel(final int n) {
        this.cancel(null, n);
    }
    
    public void cancel(final String s, final int n) {
        NotificationManagerCompat.IMPL.cancelNotification(this.mNotificationManager, s, n);
        if (Build$VERSION.SDK_INT <= 19) {
            this.pushSideChannelQueue(new NotificationManagerCompat$CancelTask(this.mContext.getPackageName(), n, s));
        }
    }
    
    public void notify(final int n, final Notification notification) {
        this.notify(null, n, notification);
    }
    
    public void notify(final String s, final int n, final Notification notification) {
        if (useSideChannelForNotification(notification)) {
            this.pushSideChannelQueue(new NotificationManagerCompat$NotifyTask(this.mContext.getPackageName(), n, s, notification));
            NotificationManagerCompat.IMPL.cancelNotification(this.mNotificationManager, s, n);
            if (Fragment.a == 0) {
                return;
            }
        }
        NotificationManagerCompat.IMPL.postNotification(this.mNotificationManager, s, n, notification);
    }
}
