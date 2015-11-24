// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public ScribeGeoDetails$ScribeGeoPlace a(final Parcel parcel) {
        return new ScribeGeoDetails$ScribeGeoPlace(parcel);
    }
    
    public ScribeGeoDetails$ScribeGeoPlace[] a(final int n) {
        return new ScribeGeoDetails$ScribeGeoPlace[n];
    }
}
