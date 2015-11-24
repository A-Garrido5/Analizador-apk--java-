// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public ActivitySummary a(final Parcel parcel) {
        return new ActivitySummary(parcel);
    }
    
    public ActivitySummary[] a(final int n) {
        return new ActivitySummary[n];
    }
}
