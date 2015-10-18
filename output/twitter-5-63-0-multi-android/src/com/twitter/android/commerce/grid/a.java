// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public ClassLoaderSavedState a(final Parcel parcel) {
        if (parcel.readParcelable((ClassLoader)null) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return ClassLoaderSavedState.a;
    }
    
    public ClassLoaderSavedState[] a(final int n) {
        return new ClassLoaderSavedState[n];
    }
}
