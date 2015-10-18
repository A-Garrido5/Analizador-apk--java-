// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.ArrayList;
import android.os.Bundle;
import android.app.Notification;

interface NotificationCompat$NotificationCompatImpl
{
    Notification build(final NotificationCompat$Builder p0);
    
    Bundle getBundleForUnreadConversation(final NotificationCompatBase$UnreadConversation p0);
    
    Bundle getExtras(final Notification p0);
    
    ArrayList getParcelableArrayListForActions(final NotificationCompat$Action[] p0);
}
