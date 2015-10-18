// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcelable;
import android.os.Parcel;
import android.util.SparseArray;
import android.os.Parcelable$Creator;

public class StaggeredGridView$GridListSavedState extends ExtendableListView$ListSavedState
{
    public final Parcelable$Creator g;
    public int h;
    public int[] i;
    public SparseArray j;
    
    public StaggeredGridView$GridListSavedState(final Parcel parcel) {
        super(parcel);
        this.g = (Parcelable$Creator)new o(this);
        this.h = parcel.readInt();
        int h;
        if (this.h >= 0) {
            h = this.h;
        }
        else {
            h = 0;
        }
        parcel.readIntArray(this.i = new int[h]);
        this.j = parcel.readSparseArray(StaggeredGridView$GridItemRecord.class.getClassLoader());
    }
    
    public StaggeredGridView$GridListSavedState(final Parcelable parcelable) {
        super(parcelable);
        this.g = (Parcelable$Creator)new o(this);
    }
    
    @Override
    public String toString() {
        return "StaggeredGridView.GridListSavedState{" + Integer.toHexString(System.identityHashCode(this)) + "}";
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeSparseArray(this.j);
    }
}
