// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bf implements Parcelable$Creator
{
    public TwitterLocation a(final Parcel parcel) {
        return new TwitterLocation(parcel);
    }
    
    public TwitterLocation[] a(final int n) {
        return new TwitterLocation[n];
    }
}
