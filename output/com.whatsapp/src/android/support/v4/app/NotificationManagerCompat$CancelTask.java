// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

class NotificationManagerCompat$CancelTask implements NotificationManagerCompat$Task
{
    private static final String[] z;
    final boolean all;
    final int id;
    final String packageName;
    final String tag;
    
    static {
        final String[] z2 = new String[5];
        String s = "obhG\f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '6';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000#o@S/\u0016`P]\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "ob`OZy";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "3#bHW$'OB[&x";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "obuBQy";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public NotificationManagerCompat$CancelTask(final String packageName, final int id, final String tag) {
        this.packageName = packageName;
        this.id = id;
        this.tag = tag;
        this.all = false;
    }
    
    @Override
    public void send(final INotificationSideChannel notificationSideChannel) {
        if (this.all) {
            notificationSideChannel.cancelAll(this.packageName);
            if (Fragment.a == 0) {
                return;
            }
        }
        notificationSideChannel.cancel(this.packageName, this.id, this.tag);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(NotificationManagerCompat$CancelTask.z[1]);
        sb.append(NotificationManagerCompat$CancelTask.z[3]).append(this.packageName);
        sb.append(NotificationManagerCompat$CancelTask.z[0]).append(this.id);
        sb.append(NotificationManagerCompat$CancelTask.z[4]).append(this.tag);
        sb.append(NotificationManagerCompat$CancelTask.z[2]).append(this.all);
        sb.append("]");
        return sb.toString();
    }
}
