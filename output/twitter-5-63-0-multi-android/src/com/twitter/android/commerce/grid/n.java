// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;

final class n implements Parcelable$Creator
{
    public StaggeredGridView$GridItemRecord a(final Parcel parcel) {
        return new StaggeredGridView$GridItemRecord(parcel, null);
    }
    
    public StaggeredGridView$GridItemRecord[] a(final int n) {
        return new StaggeredGridView$GridItemRecord[n];
    }
}
