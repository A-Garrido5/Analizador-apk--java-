// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.Iterator;
import android.os.Bundle;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.app.PendingIntent;
import android.widget.RemoteViews;
import android.app.Notification;
import android.content.Context;
import android.app.Notification$Builder;

public class NotificationCompatApi21$Builder implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{
    public static int a;
    private Notification$Builder b;
    
    public NotificationCompatApi21$Builder(final Context context, final Notification notification, final CharSequence contentTitle, final CharSequence contentText, final CharSequence contentInfo, final RemoteViews remoteViews, final int number, final PendingIntent contentIntent, final PendingIntent pendingIntent, final Bitmap largeIcon, final int n, final int n2, final boolean b, final boolean showWhen, final boolean usesChronometer, final int priority, final CharSequence subText, final boolean localOnly, final String category, final ArrayList list, final Bundle extras, final int color, final int visibility, final Notification publicVersion, final String group, final boolean groupSummary, final String sortKey) {
        final int a = NotificationCompatBase$Action.a;
        this.b = new Notification$Builder(context).setWhen(notification.when).setShowWhen(showWhen).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((0x2 & notification.flags) != 0x0).setOnlyAlertOnce((0x8 & notification.flags) != 0x0).setAutoCancel((0x10 & notification.flags) != 0x0).setDefaults(notification.defaults).setContentTitle(contentTitle).setContentText(contentText).setSubText(subText).setContentInfo(contentInfo).setContentIntent(contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent, (0x80 & notification.flags) != 0x0).setLargeIcon(largeIcon).setNumber(number).setUsesChronometer(usesChronometer).setPriority(priority).setProgress(n, n2, b).setLocalOnly(localOnly).setExtras(extras).setGroup(group).setGroupSummary(groupSummary).setSortKey(sortKey).setCategory(category).setColor(color).setVisibility(visibility).setPublicVersion(publicVersion);
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b.addPerson((String)iterator.next());
            if (a != 0) {
                break;
            }
        }
        if (RemoteInputCompatBase$RemoteInput.a != 0) {
            NotificationCompatBase$Action.a = a + 1;
        }
    }
    
    @Override
    public void addAction(final NotificationCompatBase$Action notificationCompatBase$Action) {
        NotificationCompatApi20.addAction(this.b, notificationCompatBase$Action);
    }
    
    public Notification build() {
        return this.b.build();
    }
    
    @Override
    public Notification$Builder getBuilder() {
        return this.b;
    }
}
