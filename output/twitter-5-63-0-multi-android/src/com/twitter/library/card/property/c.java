// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public ImageSpec a(final Parcel parcel) {
        return new ImageSpec(parcel);
    }
    
    public ImageSpec[] a(final int n) {
        return new ImageSpec[n];
    }
}
