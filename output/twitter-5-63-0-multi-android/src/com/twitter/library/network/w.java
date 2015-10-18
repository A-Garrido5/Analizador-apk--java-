// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class w implements Parcelable$Creator
{
    public OAuth2Token a(final Parcel parcel) {
        return new OAuth2Token(parcel);
    }
    
    public OAuth2Token[] a(final int n) {
        return new OAuth2Token[n];
    }
}
