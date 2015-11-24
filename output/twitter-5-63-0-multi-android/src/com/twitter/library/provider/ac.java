// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ac implements Parcelable$Creator
{
    public Tweet a(final Parcel parcel) {
        return new Tweet(parcel);
    }
    
    public Tweet[] a(final int n) {
        return new Tweet[n];
    }
}
