// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public MobileDetails a(final Parcel parcel) {
        return new MobileDetails(parcel);
    }
    
    public MobileDetails[] a(final int n) {
        return new MobileDetails[n];
    }
}
