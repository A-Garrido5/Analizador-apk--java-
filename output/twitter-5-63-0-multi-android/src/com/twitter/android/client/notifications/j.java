// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class j implements Parcelable$Creator
{
    public FollowRequestNotif a(final Parcel parcel) {
        return new FollowRequestNotif(parcel);
    }
    
    public FollowRequestNotif[] a(final int n) {
        return new FollowRequestNotif[n];
    }
}
