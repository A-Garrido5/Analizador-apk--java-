// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class o implements Parcelable$Creator
{
    public CategoryListItem a(final Parcel parcel) {
        return new CategoryListItem(parcel);
    }
    
    public CategoryListItem[] a(final int n) {
        return new CategoryListItem[n];
    }
}
