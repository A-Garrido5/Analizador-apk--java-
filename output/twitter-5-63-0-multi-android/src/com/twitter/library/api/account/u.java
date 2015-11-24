// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class u implements Parcelable$Creator
{
    public LvEligibilityResponse a(final Parcel parcel) {
        return new LvEligibilityResponse(parcel);
    }
    
    public LvEligibilityResponse[] a(final int n) {
        return new LvEligibilityResponse[n];
    }
}
