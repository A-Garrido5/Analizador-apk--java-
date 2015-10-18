// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class bf implements Parcelable$Creator
{
    public FloatingActionButtonLayout$SavedState a(final Parcel parcel) {
        return new FloatingActionButtonLayout$SavedState(parcel);
    }
    
    public FloatingActionButtonLayout$SavedState[] a(final int n) {
        return new FloatingActionButtonLayout$SavedState[n];
    }
}
