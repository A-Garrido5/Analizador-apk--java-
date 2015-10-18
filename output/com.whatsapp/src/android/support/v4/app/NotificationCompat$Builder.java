// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.net.Uri;
import android.widget.RemoteViews;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.content.Context;
import android.app.PendingIntent;
import java.util.ArrayList;

public class NotificationCompat$Builder
{
    ArrayList mActions;
    String mCategory;
    int mColor;
    CharSequence mContentInfo;
    PendingIntent mContentIntent;
    CharSequence mContentText;
    CharSequence mContentTitle;
    Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    String mGroupKey;
    boolean mGroupSummary;
    Bitmap mLargeIcon;
    boolean mLocalOnly;
    Notification mNotification;
    int mNumber;
    public ArrayList mPeople;
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    boolean mShowWhen;
    String mSortKey;
    NotificationCompat$Style mStyle;
    CharSequence mSubText;
    RemoteViews mTickerView;
    boolean mUseChronometer;
    int mVisibility;
    
    public NotificationCompat$Builder(final Context mContext) {
        this.mShowWhen = true;
        this.mActions = new ArrayList();
        this.mLocalOnly = false;
        this.mColor = 0;
        this.mVisibility = 0;
        this.mNotification = new Notification();
        this.mContext = mContext;
        this.mNotification.when = System.currentTimeMillis();
        this.mNotification.audioStreamType = -1;
        this.mPriority = 0;
        this.mPeople = new ArrayList();
    }
    
    protected static CharSequence limitCharSequenceLength(final CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
    
    private void setFlag(final int n, final boolean b) {
        if (b) {
            final Notification mNotification = this.mNotification;
            mNotification.flags |= n;
            if (Fragment.a == 0) {
                return;
            }
        }
        final Notification mNotification2 = this.mNotification;
        mNotification2.flags &= ~n;
    }
    
    public NotificationCompat$Builder addAction(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
        this.mActions.add(new NotificationCompat$Action(n, charSequence, pendingIntent));
        return this;
    }
    
    public NotificationCompat$Builder addAction(final NotificationCompat$Action notificationCompat$Action) {
        this.mActions.add(notificationCompat$Action);
        return this;
    }
    
    public NotificationCompat$Builder addPerson(final String s) {
        this.mPeople.add(s);
        return this;
    }
    
    public Notification build() {
        return NotificationCompat.access$200().build(this);
    }
    
    public NotificationCompat$Builder extend(final NotificationCompat$Extender notificationCompat$Extender) {
        notificationCompat$Extender.extend(this);
        return this;
    }
    
    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }
    
    @Deprecated
    public Notification getNotification() {
        return NotificationCompat.access$200().build(this);
    }
    
    public NotificationCompat$Builder setAutoCancel(final boolean b) {
        this.setFlag(16, b);
        return this;
    }
    
    public NotificationCompat$Builder setCategory(final String mCategory) {
        this.mCategory = mCategory;
        return this;
    }
    
    public NotificationCompat$Builder setColor(final int mColor) {
        this.mColor = mColor;
        return this;
    }
    
    public NotificationCompat$Builder setContentIntent(final PendingIntent mContentIntent) {
        this.mContentIntent = mContentIntent;
        return this;
    }
    
    public NotificationCompat$Builder setContentText(final CharSequence charSequence) {
        this.mContentText = limitCharSequenceLength(charSequence);
        return this;
    }
    
    public NotificationCompat$Builder setContentTitle(final CharSequence charSequence) {
        this.mContentTitle = limitCharSequenceLength(charSequence);
        return this;
    }
    
    public NotificationCompat$Builder setDefaults(final int defaults) {
        this.mNotification.defaults = defaults;
        if ((defaults & 0x4) != 0x0) {
            final Notification mNotification = this.mNotification;
            mNotification.flags |= 0x1;
        }
        return this;
    }
    
    public NotificationCompat$Builder setDeleteIntent(final PendingIntent deleteIntent) {
        this.mNotification.deleteIntent = deleteIntent;
        return this;
    }
    
    public NotificationCompat$Builder setGroup(final String mGroupKey) {
        this.mGroupKey = mGroupKey;
        return this;
    }
    
    public NotificationCompat$Builder setGroupSummary(final boolean mGroupSummary) {
        this.mGroupSummary = mGroupSummary;
        return this;
    }
    
    public NotificationCompat$Builder setLargeIcon(final Bitmap mLargeIcon) {
        this.mLargeIcon = mLargeIcon;
        return this;
    }
    
    public NotificationCompat$Builder setLights(final int ledARGB, final int ledOnMS, final int ledOffMS) {
        int n = 1;
        this.mNotification.ledARGB = ledARGB;
        this.mNotification.ledOnMS = ledOnMS;
        this.mNotification.ledOffMS = ledOffMS;
        int n2;
        if (this.mNotification.ledOnMS != 0 && this.mNotification.ledOffMS != 0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final Notification mNotification = this.mNotification;
        final int n3 = 0xFFFFFFFE & this.mNotification.flags;
        if (n2 == 0) {
            n = 0;
        }
        mNotification.flags = (n3 | n);
        return this;
    }
    
    public NotificationCompat$Builder setOngoing(final boolean b) {
        this.setFlag(2, b);
        return this;
    }
    
    public NotificationCompat$Builder setOnlyAlertOnce(final boolean b) {
        this.setFlag(8, b);
        return this;
    }
    
    public NotificationCompat$Builder setPriority(final int mPriority) {
        this.mPriority = mPriority;
        return this;
    }
    
    public NotificationCompat$Builder setProgress(final int mProgressMax, final int mProgress, final boolean mProgressIndeterminate) {
        this.mProgressMax = mProgressMax;
        this.mProgress = mProgress;
        this.mProgressIndeterminate = mProgressIndeterminate;
        return this;
    }
    
    public NotificationCompat$Builder setSmallIcon(final int icon) {
        this.mNotification.icon = icon;
        return this;
    }
    
    public NotificationCompat$Builder setSound(final Uri sound) {
        this.mNotification.sound = sound;
        this.mNotification.audioStreamType = -1;
        return this;
    }
    
    public NotificationCompat$Builder setStyle(final NotificationCompat$Style mStyle) {
        if (this.mStyle != mStyle) {
            this.mStyle = mStyle;
            if (this.mStyle != null) {
                this.mStyle.setBuilder(this);
            }
        }
        return this;
    }
    
    public NotificationCompat$Builder setTicker(final CharSequence charSequence) {
        this.mNotification.tickerText = limitCharSequenceLength(charSequence);
        return this;
    }
    
    public NotificationCompat$Builder setUsesChronometer(final boolean mUseChronometer) {
        this.mUseChronometer = mUseChronometer;
        return this;
    }
    
    public NotificationCompat$Builder setVibrate(final long[] vibrate) {
        this.mNotification.vibrate = vibrate;
        return this;
    }
    
    public NotificationCompat$Builder setWhen(final long when) {
        this.mNotification.when = when;
        return this;
    }
}
