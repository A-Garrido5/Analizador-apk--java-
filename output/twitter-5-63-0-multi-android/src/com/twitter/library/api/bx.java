// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bx implements Parcelable$Creator
{
    public TwitterUserMetadata a(final Parcel parcel) {
        return new TwitterUserMetadata(parcel);
    }
    
    public TwitterUserMetadata[] a(final int n) {
        return new TwitterUserMetadata[n];
    }
}
