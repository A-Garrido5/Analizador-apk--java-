// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public ClientNetworkRequestDetails a(final Parcel parcel) {
        return new ClientNetworkRequestDetails(parcel);
    }
    
    public ClientNetworkRequestDetails[] a(final int n) {
        return new ClientNetworkRequestDetails[n];
    }
}
