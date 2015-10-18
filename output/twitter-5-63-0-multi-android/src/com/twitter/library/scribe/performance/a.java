// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.performance;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public MemoryPerformanceScribeLog a(final Parcel parcel) {
        return new MemoryPerformanceScribeLog(parcel);
    }
    
    public MemoryPerformanceScribeLog[] a(final int n) {
        return new MemoryPerformanceScribeLog[n];
    }
}
