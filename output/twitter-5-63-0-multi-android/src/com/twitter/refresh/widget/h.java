// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.refresh.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class h implements Parcelable$Creator
{
    public RefreshableListView$SavedState a(final Parcel parcel) {
        return new RefreshableListView$SavedState(parcel);
    }
    
    public RefreshableListView$SavedState[] a(final int n) {
        return new RefreshableListView$SavedState[n];
    }
}
