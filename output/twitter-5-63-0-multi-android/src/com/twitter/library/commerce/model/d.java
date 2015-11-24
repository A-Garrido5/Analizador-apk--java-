// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public ProductVariant a(final Parcel parcel) {
        return new ProductVariant(parcel, null);
    }
    
    public ProductVariant[] a(final int n) {
        return new ProductVariant[n];
    }
}
