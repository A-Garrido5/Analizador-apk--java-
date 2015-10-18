// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public GeoTagState a(final Parcel parcel) {
        return new GeoTagState(parcel, null);
    }
    
    public GeoTagState[] a(final int n) {
        return new GeoTagState[n];
    }
}
