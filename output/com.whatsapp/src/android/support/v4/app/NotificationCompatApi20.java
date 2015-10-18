// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.ArrayList;
import android.app.Notification$Action;
import android.app.RemoteInput;
import android.app.Notification$Action$Builder;
import android.app.Notification$Builder;

class NotificationCompatApi20
{
    public static void addAction(final Notification$Builder notification$Builder, final NotificationCompatBase$Action notificationCompatBase$Action) {
        final int a = NotificationCompatBase$Action.a;
        final Notification$Action$Builder notification$Action$Builder = new Notification$Action$Builder(notificationCompatBase$Action.getIcon(), notificationCompatBase$Action.getTitle(), notificationCompatBase$Action.getActionIntent());
        if (notificationCompatBase$Action.getRemoteInputs() != null) {
            final RemoteInput[] fromCompat = RemoteInputCompatApi20.fromCompat(notificationCompatBase$Action.getRemoteInputs());
            final int length = fromCompat.length;
            int i = 0;
            while (i < length) {
                notification$Action$Builder.addRemoteInput(fromCompat[i]);
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
        if (notificationCompatBase$Action.getExtras() != null) {
            notification$Action$Builder.addExtras(notificationCompatBase$Action.getExtras());
        }
        notification$Builder.addAction(notification$Action$Builder.build());
    }
    
    private static Notification$Action getActionFromActionCompat(final NotificationCompatBase$Action notificationCompatBase$Action) {
        final int a = NotificationCompatBase$Action.a;
        final Notification$Action$Builder addExtras = new Notification$Action$Builder(notificationCompatBase$Action.getIcon(), notificationCompatBase$Action.getTitle(), notificationCompatBase$Action.getActionIntent()).addExtras(notificationCompatBase$Action.getExtras());
        final RemoteInputCompatBase$RemoteInput[] remoteInputs = notificationCompatBase$Action.getRemoteInputs();
        if (remoteInputs != null) {
            final RemoteInput[] fromCompat = RemoteInputCompatApi20.fromCompat(remoteInputs);
            final int length = fromCompat.length;
            int i = 0;
            while (i < length) {
                addExtras.addRemoteInput(fromCompat[i]);
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
        return addExtras.build();
    }
    
    public static ArrayList getParcelableArrayListForActions(final NotificationCompatBase$Action[] array) {
        final int a = NotificationCompatBase$Action.a;
        ArrayList<Notification$Action> list;
        if (array == null) {
            list = null;
        }
        else {
            list = new ArrayList<Notification$Action>(array.length);
            final int length = array.length;
            int i = 0;
            while (i < length) {
                list.add(getActionFromActionCompat(array[i]));
                ++i;
                if (a != 0) {
                    return list;
                }
            }
        }
        return list;
    }
}
