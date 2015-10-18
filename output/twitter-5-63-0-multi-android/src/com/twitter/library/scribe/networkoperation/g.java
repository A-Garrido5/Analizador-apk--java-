// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class g implements Parcelable$Creator
{
    public SegmentedMediaUploadDetails a(final Parcel parcel) {
        return new SegmentedMediaUploadDetails(parcel);
    }
    
    public SegmentedMediaUploadDetails[] a(final int n) {
        return new SegmentedMediaUploadDetails[n];
    }
}
