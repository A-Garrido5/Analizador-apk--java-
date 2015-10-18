// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class fg implements Parcelable$Creator
{
    public ToggleImageButton$SavedState a(final Parcel parcel) {
        return new ToggleImageButton$SavedState(parcel);
    }
    
    public ToggleImageButton$SavedState[] a(final int n) {
        return new ToggleImageButton$SavedState[n];
    }
}
