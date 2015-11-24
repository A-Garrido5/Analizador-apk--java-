// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public ScribeGeoDetails a(final Parcel parcel) {
        return new ScribeGeoDetails(parcel);
    }
    
    public ScribeGeoDetails[] a(final int n) {
        return new ScribeGeoDetails[n];
    }
}
