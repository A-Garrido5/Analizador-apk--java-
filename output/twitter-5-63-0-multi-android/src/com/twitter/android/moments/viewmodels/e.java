// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public MomentTweetPhotoPage a(final Parcel parcel) {
        return new MomentTweetPhotoPage(parcel);
    }
    
    public MomentTweetPhotoPage[] a(final int n) {
        return new MomentTweetPhotoPage[n];
    }
}
