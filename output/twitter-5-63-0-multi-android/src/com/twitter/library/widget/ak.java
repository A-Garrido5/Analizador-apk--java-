// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ak implements Parcelable$Creator
{
    public SlidingUpPanelLayout$SavedState a(final Parcel parcel) {
        return new SlidingUpPanelLayout$SavedState(parcel, null);
    }
    
    public SlidingUpPanelLayout$SavedState[] a(final int n) {
        return new SlidingUpPanelLayout$SavedState[n];
    }
}
