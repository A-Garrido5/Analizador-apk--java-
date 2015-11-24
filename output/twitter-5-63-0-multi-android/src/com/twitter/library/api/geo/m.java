// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class m implements Parcelable$Creator
{
    public TwitterPlace a(final Parcel parcel) {
        return new TwitterPlace(parcel);
    }
    
    public TwitterPlace[] a(final int n) {
        return new TwitterPlace[n];
    }
}
