// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification;

class NotificationManagerCompat$NotifyTask implements NotificationManagerCompat$Task
{
    private static final String[] z;
    final int id;
    final Notification notif;
    final String packageName;
    final String tag;
    
    static {
        final String[] z2 = new String[4];
        String s = "6?D]] ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = '0';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "TpDU\\cKQOQA";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "6?YX\u0000";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "j~SW[}z~]W\u007f%";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public NotificationManagerCompat$NotifyTask(final String packageName, final int id, final String tag, final Notification notif) {
        this.packageName = packageName;
        this.id = id;
        this.tag = tag;
        this.notif = notif;
    }
    
    @Override
    public void send(final INotificationSideChannel notificationSideChannel) {
        notificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(NotificationManagerCompat$NotifyTask.z[1]);
        sb.append(NotificationManagerCompat$NotifyTask.z[3]).append(this.packageName);
        sb.append(NotificationManagerCompat$NotifyTask.z[2]).append(this.id);
        sb.append(NotificationManagerCompat$NotifyTask.z[0]).append(this.tag);
        sb.append("]");
        return sb.toString();
    }
}
