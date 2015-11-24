// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Build$VERSION;
import android.os.IBinder;
import android.content.Intent;
import android.app.Notification;
import android.app.Service;

public abstract class NotificationCompatSideChannelService extends Service
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u000ft\u001aVG\u0007~PW]\u001ej\u0011V\\@X7jl1T1pa(S=e|'U0{{'^;{k&[0jm\"";
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
                        c2 = '(';
                        break;
                    }
                    case 0: {
                        c2 = 'n';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = " u\nMN\u0007y\u001fPA\u0001t-ML\u000bY\u0016EF\u0000\u007f\u0012wM\u001cl\u0017GMT:+MLN";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Ns\r\u0004F\u0001n^E]\u001ar\u0011VA\u0014\u007f\u001a\u0004N\u0001h^TI\rq\u001fCMN";
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
    
    static void access$100(final NotificationCompatSideChannelService notificationCompatSideChannelService, final int n, final String s) {
        notificationCompatSideChannelService.checkPermission(n, s);
    }
    
    private void checkPermission(final int n, final String s) {
        final int a = Fragment.a;
        final String[] packagesForUid = this.getPackageManager().getPackagesForUid(n);
        final int length = packagesForUid.length;
        int i = 0;
        while (i < length) {
            final String s2 = packagesForUid[i];
            try {
                if (s2.equals(s)) {
                    return;
                }
            }
            catch (SecurityException ex) {
                throw ex;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        throw new SecurityException(NotificationCompatSideChannelService.z[1] + n + NotificationCompatSideChannelService.z[2] + s);
    }
    
    public abstract void cancel(final String p0, final int p1, final String p2);
    
    public abstract void cancelAll(final String p0);
    
    public abstract void notify(final String p0, final int p1, final String p2, final Notification p3);
    
    public IBinder onBind(final Intent intent) {
        try {
            final boolean equals = intent.getAction().equals(NotificationCompatSideChannelService.z[0]);
            final Object o = null;
            if (!equals) {
                return (IBinder)o;
            }
            final int n = Build$VERSION.SDK_INT;
            final int n2 = 19;
            if (n > n2) {
                return null;
            }
            return (IBinder)new NotificationCompatSideChannelService$NotificationSideChannelStub(this, null);
        }
        catch (SecurityException ex) {
            throw ex;
        }
        try {
            final int n = Build$VERSION.SDK_INT;
            final int n2 = 19;
            if (n > n2) {
                return null;
            }
        }
        catch (SecurityException ex2) {
            throw ex2;
        }
        final Object o = new NotificationCompatSideChannelService$NotificationSideChannelStub(this, null);
        return (IBinder)o;
    }
}
