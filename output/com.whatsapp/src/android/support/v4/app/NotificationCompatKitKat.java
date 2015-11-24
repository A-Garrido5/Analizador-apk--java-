// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.Notification;

class NotificationCompatKitKat
{
    public static Bundle getExtras(final Notification notification) {
        return notification.extras;
    }
}
