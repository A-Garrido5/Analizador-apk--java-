// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public Audio a(final Parcel parcel) {
        return new Audio(parcel);
    }
    
    public Audio[] a(final int n) {
        return new Audio[n];
    }
}
