// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public FavoriteNotif a(final Parcel parcel) {
        return new FavoriteNotif(parcel);
    }
    
    public FavoriteNotif[] a(final int n) {
        return new FavoriteNotif[n];
    }
}
