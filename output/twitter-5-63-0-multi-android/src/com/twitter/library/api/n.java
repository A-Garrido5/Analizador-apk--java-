// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class n implements Parcelable$Creator
{
    public ClientConfiguration a(final Parcel parcel) {
        return new ClientConfiguration(parcel);
    }
    
    public ClientConfiguration[] a(final int n) {
        return new ClientConfiguration[n];
    }
}
