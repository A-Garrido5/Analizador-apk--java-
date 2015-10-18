// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.Notification;

class NotificationCompat$NotificationCompatImplKitKat extends NotificationCompat$NotificationCompatImplJellybean
{
    @Override
    public Notification build(final NotificationCompat$Builder notificationCompat$Builder) {
        final NotificationCompatKitKat$Builder notificationCompatKitKat$Builder = new NotificationCompatKitKat$Builder(notificationCompat$Builder.mContext, notificationCompat$Builder.mNotification, notificationCompat$Builder.mContentTitle, notificationCompat$Builder.mContentText, notificationCompat$Builder.mContentInfo, notificationCompat$Builder.mTickerView, notificationCompat$Builder.mNumber, notificationCompat$Builder.mContentIntent, notificationCompat$Builder.mFullScreenIntent, notificationCompat$Builder.mLargeIcon, notificationCompat$Builder.mProgressMax, notificationCompat$Builder.mProgress, notificationCompat$Builder.mProgressIndeterminate, notificationCompat$Builder.mShowWhen, notificationCompat$Builder.mUseChronometer, notificationCompat$Builder.mPriority, notificationCompat$Builder.mSubText, notificationCompat$Builder.mLocalOnly, notificationCompat$Builder.mPeople, notificationCompat$Builder.mExtras, notificationCompat$Builder.mGroupKey, notificationCompat$Builder.mGroupSummary, notificationCompat$Builder.mSortKey);
        NotificationCompat.access$000(notificationCompatKitKat$Builder, notificationCompat$Builder.mActions);
        NotificationCompat.access$100(notificationCompatKitKat$Builder, notificationCompat$Builder.mStyle);
        return notificationCompatKitKat$Builder.build();
    }
    
    @Override
    public Bundle getExtras(final Notification notification) {
        return NotificationCompatKitKat.getExtras(notification);
    }
}
