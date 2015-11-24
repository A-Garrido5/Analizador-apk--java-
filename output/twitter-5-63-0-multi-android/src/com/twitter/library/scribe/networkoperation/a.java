// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public ClientNetworkOperation a(final Parcel parcel) {
        return new ClientNetworkOperation(parcel);
    }
    
    public ClientNetworkOperation[] a(final int n) {
        return new ClientNetworkOperation[n];
    }
}
