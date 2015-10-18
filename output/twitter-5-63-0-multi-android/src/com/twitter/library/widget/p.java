// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class p implements Parcelable$Creator
{
    public BottomSheetItem a(final Parcel parcel) {
        return new BottomSheetItem(parcel);
    }
    
    public BottomSheetItem[] a(final int n) {
        return new BottomSheetItem[n];
    }
}
