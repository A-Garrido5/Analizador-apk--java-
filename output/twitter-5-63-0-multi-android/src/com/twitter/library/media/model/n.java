// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class n implements Parcelable$Creator
{
    public SegmentedVideoFile a(final Parcel parcel) {
        return new SegmentedVideoFile(parcel);
    }
    
    public SegmentedVideoFile[] a(final int n) {
        return new SegmentedVideoFile[n];
    }
}
