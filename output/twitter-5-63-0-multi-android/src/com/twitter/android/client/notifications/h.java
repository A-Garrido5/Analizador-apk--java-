// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public FollowNotif a(final Parcel parcel) {
        return new FollowNotif(parcel);
    }
    
    public FollowNotif[] a(final int n) {
        return new FollowNotif[n];
    }
}
