// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.graphics.Bitmap;

public final class NotificationCompat$CarExtender implements NotificationCompat$Extender
{
    private static final String[] z;
    private int mColor;
    private Bitmap mLargeIcon;
    private NotificationCompat$CarExtender$UnreadConversation mUnreadConversation;
    
    static {
        final String[] z2 = new String[4];
        String s = "0\u0019QM\u001e>\u0005N`";
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
                        c2 = '}';
                        break;
                    }
                    case 0: {
                        c2 = 'Q';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = '!';
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
                    s = "=\bSu\u0018\u000e\u0000B}\u0013";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2\bSM\u001e>\u0007Ww\u000f\"\bU{\u0012?";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "0\u0007E`\u00128\r\u000fq\u001c#GdJ)\u0014'r[2\u001f:";
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
    
    public NotificationCompat$CarExtender() {
        this.mColor = 0;
    }
    
    @Override
    public NotificationCompat$Builder extend(final NotificationCompat$Builder notificationCompat$Builder) {
        if (Build$VERSION.SDK_INT < 21) {
            return notificationCompat$Builder;
        }
        final Bundle bundle = new Bundle();
        if (this.mLargeIcon != null) {
            bundle.putParcelable(NotificationCompat$CarExtender.z[1], (Parcelable)this.mLargeIcon);
        }
        if (this.mColor != 0) {
            bundle.putInt(NotificationCompat$CarExtender.z[0], this.mColor);
        }
        if (this.mUnreadConversation != null) {
            bundle.putBundle(NotificationCompat$CarExtender.z[2], NotificationCompat.access$200().getBundleForUnreadConversation(this.mUnreadConversation));
        }
        notificationCompat$Builder.getExtras().putBundle(NotificationCompat$CarExtender.z[3], bundle);
        return notificationCompat$Builder;
    }
    
    public NotificationCompat$CarExtender setColor(final int mColor) {
        this.mColor = mColor;
        return this;
    }
    
    public NotificationCompat$CarExtender setLargeIcon(final Bitmap mLargeIcon) {
        this.mLargeIcon = mLargeIcon;
        return this;
    }
    
    public NotificationCompat$CarExtender setUnreadConversation(final NotificationCompat$CarExtender$UnreadConversation mUnreadConversation) {
        this.mUnreadConversation = mUnreadConversation;
        return this;
    }
}
