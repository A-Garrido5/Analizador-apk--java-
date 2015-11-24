// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class i implements Parcelable$Creator
{
    public VideoCta a(final Parcel parcel) {
        return new VideoCta(parcel);
    }
    
    public VideoCta[] a(final int n) {
        return new VideoCta[n];
    }
}
