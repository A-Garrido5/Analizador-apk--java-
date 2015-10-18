// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class c implements Parcelable$Creator
{
    public ElementState a(final Parcel parcel) {
        return new ElementState(parcel);
    }
    
    public ElementState[] a(final int n) {
        return new ElementState[n];
    }
}
