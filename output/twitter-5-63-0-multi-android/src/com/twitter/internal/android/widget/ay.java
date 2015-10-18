// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class ay implements Parcelable$Creator
{
    public ViewPagerScrollBar$SavedState a(final Parcel parcel) {
        return new ViewPagerScrollBar$SavedState(parcel);
    }
    
    public ViewPagerScrollBar$SavedState[] a(final int n) {
        return new ViewPagerScrollBar$SavedState[n];
    }
}
