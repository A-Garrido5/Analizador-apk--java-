// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class e implements Parcelable$Creator
{
    public ServerError a(final Parcel parcel) {
        return new ServerError(parcel, null);
    }
    
    public ServerError[] a(final int n) {
        return new ServerError[n];
    }
}
