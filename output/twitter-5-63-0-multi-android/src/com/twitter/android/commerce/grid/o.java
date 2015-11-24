// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;

class o implements Parcelable$Creator
{
    final /* synthetic */ StaggeredGridView$GridListSavedState a;
    
    o(final StaggeredGridView$GridListSavedState a) {
        this.a = a;
    }
    
    public StaggeredGridView$GridListSavedState a(final Parcel parcel) {
        return new StaggeredGridView$GridListSavedState(parcel);
    }
    
    public StaggeredGridView$GridListSavedState[] a(final int n) {
        return new StaggeredGridView$GridListSavedState[n];
    }
}
