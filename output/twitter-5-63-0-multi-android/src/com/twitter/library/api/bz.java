// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bz implements Parcelable$Creator
{
    public UrlConfiguration a(final Parcel parcel) {
        return new UrlConfiguration(parcel);
    }
    
    public UrlConfiguration[] a(final int n) {
        return new UrlConfiguration[n];
    }
}
