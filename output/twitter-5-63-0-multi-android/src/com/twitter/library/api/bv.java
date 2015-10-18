// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bv implements Parcelable$Creator
{
    public TwitterUser a(final Parcel parcel) {
        return new TwitterUser(parcel);
    }
    
    public TwitterUser[] a(final int n) {
        return new TwitterUser[n];
    }
}
