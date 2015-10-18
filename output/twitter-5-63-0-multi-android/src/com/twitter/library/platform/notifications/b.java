// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public NotificationContextUser a(final Parcel parcel) {
        return new NotificationContextUser(parcel);
    }
    
    public NotificationContextUser[] a(final int n) {
        return new NotificationContextUser[n];
    }
}
