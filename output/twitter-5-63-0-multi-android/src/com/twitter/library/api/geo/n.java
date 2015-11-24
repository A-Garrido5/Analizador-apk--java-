// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class n implements Parcelable$Creator
{
    public TwitterPlace$PlaceInfo a(final Parcel parcel) {
        return new TwitterPlace$PlaceInfo(parcel);
    }
    
    public TwitterPlace$PlaceInfo[] a(final int n) {
        return new TwitterPlace$PlaceInfo[n];
    }
}
