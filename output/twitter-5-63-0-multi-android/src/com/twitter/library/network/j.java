// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class j implements Parcelable$Creator
{
    public LoginResponse a(final Parcel parcel) {
        return new LoginResponse(parcel);
    }
    
    public LoginResponse[] a(final int n) {
        return new LoginResponse[n];
    }
}
