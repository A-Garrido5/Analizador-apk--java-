// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public Video a(final Parcel parcel) {
        return new Video(parcel);
    }
    
    public Video[] a(final int n) {
        return new Video[n];
    }
}
