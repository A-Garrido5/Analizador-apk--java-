// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class v implements Parcelable$Creator
{
    public FilterFilmstripView$SavedState a(final Parcel parcel) {
        return new FilterFilmstripView$SavedState(parcel);
    }
    
    public FilterFilmstripView$SavedState[] a(final int n) {
        return new FilterFilmstripView$SavedState[n];
    }
}
