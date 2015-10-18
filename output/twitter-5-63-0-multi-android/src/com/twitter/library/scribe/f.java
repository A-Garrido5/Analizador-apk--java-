// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class f implements Parcelable$Creator
{
    public ScribeLog$SearchDetails a(final Parcel parcel) {
        return new ScribeLog$SearchDetails(parcel);
    }
    
    public ScribeLog$SearchDetails[] a(final int n) {
        return new ScribeLog$SearchDetails[n];
    }
}
