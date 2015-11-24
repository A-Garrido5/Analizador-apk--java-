// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class s implements Parcelable$Creator
{
    public ScrollingMarqueeTextView$SavedState a(final Parcel parcel) {
        return new ScrollingMarqueeTextView$SavedState(parcel, null);
    }
    
    public ScrollingMarqueeTextView$SavedState[] a(final int n) {
        return new ScrollingMarqueeTextView$SavedState[n];
    }
}
