// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class v implements Parcelable$Creator
{
    public ParcelableMatrixCursor a(final Parcel parcel) {
        return new ParcelableMatrixCursor(parcel);
    }
    
    public ParcelableMatrixCursor[] a(final int n) {
        return new ParcelableMatrixCursor[n];
    }
}
