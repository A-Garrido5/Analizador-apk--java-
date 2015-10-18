// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public VideoCardData a(final Parcel parcel) {
        return new VideoCardData(parcel);
    }
    
    public VideoCardData[] a(final int n) {
        return new VideoCardData[n];
    }
}
