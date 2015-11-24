// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class y implements Parcelable$Creator
{
    public OAuthToken a(final Parcel parcel) {
        return new OAuthToken(parcel);
    }
    
    public OAuthToken[] a(final int n) {
        return new OAuthToken[n];
    }
}
