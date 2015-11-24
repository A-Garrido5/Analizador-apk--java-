// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.os.Bundle;
import android.app.RemoteInput$Builder;
import android.app.RemoteInput;

class NotificationCompatApi21
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\n\u0000\u0012\u00182\u0015\u00024";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\u000b5\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011\u0007 \u000f$\u0011\u000f \u001a";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\b\u000b>\u00196\u0002\u000b>";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0017\u000b \u0005#\u00001$\u0004'\u0010\u001a";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0015\u000f?\u001e>\u0006\u0007=\u000b9\u0011\u001d";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0004\u001b9\u00028\u0017";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\n\u0000\u0012\u00182\u0004\n";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static RemoteInput fromCompatRemoteInput(final RemoteInputCompatBase$RemoteInput remoteInputCompatBase$RemoteInput) {
        return new RemoteInput$Builder(remoteInputCompatBase$RemoteInput.getResultKey()).setLabel(remoteInputCompatBase$RemoteInput.getLabel()).setChoices(remoteInputCompatBase$RemoteInput.getChoices()).setAllowFreeFormInput(remoteInputCompatBase$RemoteInput.getAllowFreeFormInput()).addExtras(remoteInputCompatBase$RemoteInput.getExtras()).build();
    }
    
    static Bundle getBundleForUnreadConversation(final NotificationCompatBase$UnreadConversation notificationCompatBase$UnreadConversation) {
        final int a = NotificationCompatBase$Action.a;
        if (notificationCompatBase$UnreadConversation == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        final String[] participants = notificationCompatBase$UnreadConversation.getParticipants();
        String s = null;
        if (participants != null) {
            final int length = notificationCompatBase$UnreadConversation.getParticipants().length;
            s = null;
            if (length > 1) {
                s = notificationCompatBase$UnreadConversation.getParticipants()[0];
            }
        }
        final Parcelable[] array = new Parcelable[notificationCompatBase$UnreadConversation.getMessages().length];
        int i = 0;
        while (i < array.length) {
            final Bundle bundle2 = new Bundle();
            bundle2.putString(NotificationCompatApi21.z[1], notificationCompatBase$UnreadConversation.getMessages()[i]);
            bundle2.putString(NotificationCompatApi21.z[6], s);
            array[i] = (Parcelable)bundle2;
            ++i;
            if (a != 0) {
                break;
            }
        }
        bundle.putParcelableArray(NotificationCompatApi21.z[3], array);
        final RemoteInputCompatBase$RemoteInput remoteInput = notificationCompatBase$UnreadConversation.getRemoteInput();
        if (remoteInput != null) {
            bundle.putParcelable(NotificationCompatApi21.z[4], (Parcelable)fromCompatRemoteInput(remoteInput));
        }
        bundle.putParcelable(NotificationCompatApi21.z[0], (Parcelable)notificationCompatBase$UnreadConversation.getReplyPendingIntent());
        bundle.putParcelable(NotificationCompatApi21.z[7], (Parcelable)notificationCompatBase$UnreadConversation.getReadPendingIntent());
        bundle.putStringArray(NotificationCompatApi21.z[5], notificationCompatBase$UnreadConversation.getParticipants());
        bundle.putLong(NotificationCompatApi21.z[2], notificationCompatBase$UnreadConversation.getLatestTimestamp());
        return bundle;
    }
}
