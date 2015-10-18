// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public ClientNetworkStatus a(final Parcel parcel) {
        return new ClientNetworkStatus(parcel);
    }
    
    public ClientNetworkStatus[] a(final int n) {
        return new ClientNetworkStatus[n];
    }
}
