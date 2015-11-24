// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class hs implements Parcelable$Creator
{
    public FlowData a(final Parcel parcel) {
        return new FlowData(parcel);
    }
    
    public FlowData[] a(final int n) {
        return new FlowData[n];
    }
}
