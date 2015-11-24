// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.ArrayList;
import android.app.Notification;

class NotificationCompat$NotificationCompatImplApi20 extends NotificationCompat$NotificationCompatImplKitKat
{
    @Override
    public Notification build(final NotificationCompat$Builder notificationCompat$Builder) {
        final NotificationCompatApi20$Builder notificationCompatApi20$Builder = new NotificationCompatApi20$Builder(notificationCompat$Builder.mContext, notificationCompat$Builder.mNotification, notificationCompat$Builder.mContentTitle, notificationCompat$Builder.mContentText, notificationCompat$Builder.mContentInfo, notificationCompat$Builder.mTickerView, notificationCompat$Builder.mNumber, notificationCompat$Builder.mContentIntent, notificationCompat$Builder.mFullScreenIntent, notificationCompat$Builder.mLargeIcon, notificationCompat$Builder.mProgressMax, notificationCompat$Builder.mProgress, notificationCompat$Builder.mProgressIndeterminate, notificationCompat$Builder.mShowWhen, notificationCompat$Builder.mUseChronometer, notificationCompat$Builder.mPriority, notificationCompat$Builder.mSubText, notificationCompat$Builder.mLocalOnly, notificationCompat$Builder.mPeople, notificationCompat$Builder.mExtras, notificationCompat$Builder.mGroupKey, notificationCompat$Builder.mGroupSummary, notificationCompat$Builder.mSortKey);
        NotificationCompat.access$000(notificationCompatApi20$Builder, notificationCompat$Builder.mActions);
        NotificationCompat.access$100(notificationCompatApi20$Builder, notificationCompat$Builder.mStyle);
        return notificationCompatApi20$Builder.build();
    }
    
    @Override
    public ArrayList getParcelableArrayListForActions(final NotificationCompat$Action[] array) {
        return NotificationCompatApi20.getParcelableArrayListForActions(array);
    }
}
