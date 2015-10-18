// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class q implements Parcelable$Creator
{
    public MagicRecFollowNotif a(final Parcel parcel) {
        return new MagicRecFollowNotif(parcel);
    }
    
    public MagicRecFollowNotif[] a(final int n) {
        return new MagicRecFollowNotif[n];
    }
}
