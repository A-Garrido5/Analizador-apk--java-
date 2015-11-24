// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public ListMomentModule a(final Parcel parcel) {
        return new ListMomentModule(parcel);
    }
    
    public ListMomentModule[] a(final int n) {
        return new ListMomentModule[n];
    }
}
