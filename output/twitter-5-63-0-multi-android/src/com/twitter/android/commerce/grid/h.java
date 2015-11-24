// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public ExtendableListView$ListSavedState a(final Parcel parcel) {
        return new ExtendableListView$ListSavedState(parcel);
    }
    
    public ExtendableListView$ListSavedState[] a(final int n) {
        return new ExtendableListView$ListSavedState[n];
    }
}
