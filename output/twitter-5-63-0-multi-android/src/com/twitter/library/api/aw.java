// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class aw implements Parcelable$Creator
{
    public Translation a(final Parcel parcel) {
        return new Translation(parcel);
    }
    
    public Translation[] a(final int n) {
        return new Translation[n];
    }
}
