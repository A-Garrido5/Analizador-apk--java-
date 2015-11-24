// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.performance;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public PerformanceScribeLog a(final Parcel parcel) {
        return new PerformanceScribeLog(parcel);
    }
    
    public PerformanceScribeLog[] a(final int n) {
        return new PerformanceScribeLog[n];
    }
}
