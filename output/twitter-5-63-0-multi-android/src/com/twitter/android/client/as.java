// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class as implements Parcelable$Creator
{
    public PendingRequest a(final Parcel parcel) {
        return new PendingRequest(parcel);
    }
    
    public PendingRequest[] a(final int n) {
        return new PendingRequest[n];
    }
}
