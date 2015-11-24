// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class b implements Parcelable$Creator
{
    public ClientNetworkRequest a(final Parcel parcel) {
        return new ClientNetworkRequest(parcel);
    }
    
    public ClientNetworkRequest[] a(final int n) {
        return new ClientNetworkRequest[n];
    }
}
