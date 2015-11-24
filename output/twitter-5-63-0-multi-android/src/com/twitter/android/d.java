// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class d implements Parcelable$Creator
{
    public AbsPagesAdapter$PageSavedState a(final Parcel parcel) {
        return new AbsPagesAdapter$PageSavedState(parcel);
    }
    
    public AbsPagesAdapter$PageSavedState[] a(final int n) {
        return new AbsPagesAdapter$PageSavedState[n];
    }
}
