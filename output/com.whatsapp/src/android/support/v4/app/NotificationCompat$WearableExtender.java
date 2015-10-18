// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.os.Bundle;
import java.util.Collection;
import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import java.util.ArrayList;

public final class NotificationCompat$WearableExtender implements NotificationCompat$Extender
{
    private static final String[] z;
    private ArrayList mActions;
    private Bitmap mBackground;
    private int mContentActionIndex;
    private int mContentIcon;
    private int mContentIconGravity;
    private int mCustomContentHeight;
    private int mCustomSizePreset;
    private PendingIntent mDisplayIntent;
    private int mFlags;
    private int mGravity;
    private int mHintScreenTimeout;
    private ArrayList mPages;
    
    static {
        final String[] z2 = new String[13];
        String s = "<JgbF9Z]|^=M`";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = '#';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
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
                    s = ";LzfO6W]qE6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ">OuuY";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "9@`{E6P";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ";LzfO6W]qE6dfs\\1Wm";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "?QudC,Z";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ":BwyM*La|N";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "(BswY";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ";LzfO6WUq^1Lz[D<Fl";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ";VgfE5`{|^=M`ZO1D|f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "0Jzfy;QqwD\fJywE-W";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "9Mp`E1G:eO9QupF=\rQJ~\u001dmG[e\u0016p";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ";VgfE5p}hO\bQqaO,";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public NotificationCompat$WearableExtender() {
        this.mActions = new ArrayList();
        this.mFlags = 1;
        this.mPages = new ArrayList();
        this.mContentIconGravity = 8388613;
        this.mContentActionIndex = -1;
        this.mCustomSizePreset = 0;
        this.mGravity = 80;
    }
    
    private void setFlag(final int n, final boolean b) {
        if (b) {
            this.mFlags |= n;
            if (Fragment.a == 0) {
                return;
            }
        }
        this.mFlags &= ~n;
    }
    
    public NotificationCompat$WearableExtender addAction(final NotificationCompat$Action notificationCompat$Action) {
        this.mActions.add(notificationCompat$Action);
        return this;
    }
    
    public NotificationCompat$WearableExtender addPage(final Notification notification) {
        this.mPages.add(notification);
        return this;
    }
    
    public NotificationCompat$WearableExtender clone() {
        final NotificationCompat$WearableExtender notificationCompat$WearableExtender = new NotificationCompat$WearableExtender();
        notificationCompat$WearableExtender.mActions = new ArrayList(this.mActions);
        notificationCompat$WearableExtender.mFlags = this.mFlags;
        notificationCompat$WearableExtender.mDisplayIntent = this.mDisplayIntent;
        notificationCompat$WearableExtender.mPages = new ArrayList(this.mPages);
        notificationCompat$WearableExtender.mBackground = this.mBackground;
        notificationCompat$WearableExtender.mContentIcon = this.mContentIcon;
        notificationCompat$WearableExtender.mContentIconGravity = this.mContentIconGravity;
        notificationCompat$WearableExtender.mContentActionIndex = this.mContentActionIndex;
        notificationCompat$WearableExtender.mCustomSizePreset = this.mCustomSizePreset;
        notificationCompat$WearableExtender.mCustomContentHeight = this.mCustomContentHeight;
        notificationCompat$WearableExtender.mGravity = this.mGravity;
        notificationCompat$WearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
        return notificationCompat$WearableExtender;
    }
    
    public Object clone() {
        return this.clone();
    }
    
    @Override
    public NotificationCompat$Builder extend(final NotificationCompat$Builder notificationCompat$Builder) {
        final Bundle bundle = new Bundle();
        if (!this.mActions.isEmpty()) {
            bundle.putParcelableArrayList(NotificationCompat$WearableExtender.z[3], NotificationCompat.access$200().getParcelableArrayListForActions(this.mActions.toArray(new NotificationCompat$Action[this.mActions.size()])));
        }
        if (this.mFlags != 1) {
            bundle.putInt(NotificationCompat$WearableExtender.z[2], this.mFlags);
        }
        if (this.mDisplayIntent != null) {
            bundle.putParcelable(NotificationCompat$WearableExtender.z[0], (Parcelable)this.mDisplayIntent);
        }
        if (!this.mPages.isEmpty()) {
            bundle.putParcelableArray(NotificationCompat$WearableExtender.z[7], (Parcelable[])this.mPages.toArray(new Notification[this.mPages.size()]));
        }
        if (this.mBackground != null) {
            bundle.putParcelable(NotificationCompat$WearableExtender.z[6], (Parcelable)this.mBackground);
        }
        if (this.mContentIcon != 0) {
            bundle.putInt(NotificationCompat$WearableExtender.z[1], this.mContentIcon);
        }
        if (this.mContentIconGravity != 8388613) {
            bundle.putInt(NotificationCompat$WearableExtender.z[4], this.mContentIconGravity);
        }
        if (this.mContentActionIndex != -1) {
            bundle.putInt(NotificationCompat$WearableExtender.z[8], this.mContentActionIndex);
        }
        if (this.mCustomSizePreset != 0) {
            bundle.putInt(NotificationCompat$WearableExtender.z[12], this.mCustomSizePreset);
        }
        if (this.mCustomContentHeight != 0) {
            bundle.putInt(NotificationCompat$WearableExtender.z[9], this.mCustomContentHeight);
        }
        if (this.mGravity != 80) {
            bundle.putInt(NotificationCompat$WearableExtender.z[5], this.mGravity);
        }
        if (this.mHintScreenTimeout != 0) {
            bundle.putInt(NotificationCompat$WearableExtender.z[10], this.mHintScreenTimeout);
        }
        notificationCompat$Builder.getExtras().putBundle(NotificationCompat$WearableExtender.z[11], bundle);
        return notificationCompat$Builder;
    }
    
    public NotificationCompat$WearableExtender setBackground(final Bitmap mBackground) {
        this.mBackground = mBackground;
        return this;
    }
    
    public NotificationCompat$WearableExtender setHintShowBackgroundOnly(final boolean b) {
        this.setFlag(4, b);
        return this;
    }
    
    public NotificationCompat$WearableExtender setStartScrollBottom(final boolean b) {
        this.setFlag(8, b);
        return this;
    }
}
