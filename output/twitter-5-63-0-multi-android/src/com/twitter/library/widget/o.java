// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class o implements Parcelable$Creator
{
    public BottomSheetDrawerLayout$SavedState a(final Parcel parcel) {
        return new BottomSheetDrawerLayout$SavedState(parcel, null);
    }
    
    public BottomSheetDrawerLayout$SavedState[] a(final int n) {
        return new BottomSheetDrawerLayout$SavedState[n];
    }
}
