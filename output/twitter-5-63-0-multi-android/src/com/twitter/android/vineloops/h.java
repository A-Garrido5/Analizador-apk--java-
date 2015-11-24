// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public VineLoopAggregator$Record a(final Parcel parcel) {
        return new VineLoopAggregator$Record(parcel, null);
    }
    
    public VineLoopAggregator$Record[] a(final int n) {
        return new VineLoopAggregator$Record[n];
    }
}
