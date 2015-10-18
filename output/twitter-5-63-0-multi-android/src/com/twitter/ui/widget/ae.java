// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ae implements Parcelable$Creator
{
    public TwitterEditText$SavedState a(final Parcel parcel) {
        return new TwitterEditText$SavedState(parcel, null);
    }
    
    public TwitterEditText$SavedState[] a(final int n) {
        return new TwitterEditText$SavedState[n];
    }
}
