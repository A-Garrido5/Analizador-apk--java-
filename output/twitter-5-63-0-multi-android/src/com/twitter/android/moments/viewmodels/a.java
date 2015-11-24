// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class a implements Parcelable$Creator
{
    public Capsule a(final Parcel parcel) {
        return new Capsule(parcel);
    }
    
    public Capsule[] a(final int n) {
        return new Capsule[n];
    }
}
