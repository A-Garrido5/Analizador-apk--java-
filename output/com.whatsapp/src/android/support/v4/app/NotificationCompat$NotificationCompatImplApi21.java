// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.Notification;

class NotificationCompat$NotificationCompatImplApi21 extends NotificationCompat$NotificationCompatImplApi20
{
    @Override
    public Notification build(final NotificationCompat$Builder notificationCompat$Builder) {
        final NotificationCompatApi21$Builder notificationCompatApi21$Builder = new NotificationCompatApi21$Builder(notificationCompat$Builder.mContext, notificationCompat$Builder.mNotification, notificationCompat$Builder.mContentTitle, notificationCompat$Builder.mContentText, notificationCompat$Builder.mContentInfo, notificationCompat$Builder.mTickerView, notificationCompat$Builder.mNumber, notificationCompat$Builder.mContentIntent, notificationCompat$Builder.mFullScreenIntent, notificationCompat$Builder.mLargeIcon, notificationCompat$Builder.mProgressMax, notificationCompat$Builder.mProgress, notificationCompat$Builder.mProgressIndeterminate, notificationCompat$Builder.mShowWhen, notificationCompat$Builder.mUseChronometer, notificationCompat$Builder.mPriority, notificationCompat$Builder.mSubText, notificationCompat$Builder.mLocalOnly, notificationCompat$Builder.mCategory, notificationCompat$Builder.mPeople, notificationCompat$Builder.mExtras, notificationCompat$Builder.mColor, notificationCompat$Builder.mVisibility, notificationCompat$Builder.mPublicVersion, notificationCompat$Builder.mGroupKey, notificationCompat$Builder.mGroupSummary, notificationCompat$Builder.mSortKey);
        NotificationCompat.access$000(notificationCompatApi21$Builder, notificationCompat$Builder.mActions);
        NotificationCompat.access$100(notificationCompatApi21$Builder, notificationCompat$Builder.mStyle);
        return notificationCompatApi21$Builder.build();
    }
    
    @Override
    public Bundle getBundleForUnreadConversation(final NotificationCompatBase$UnreadConversation notificationCompatBase$UnreadConversation) {
        return NotificationCompatApi21.getBundleForUnreadConversation(notificationCompatBase$UnreadConversation);
    }
}
