// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class StaggeredGridView$GridItemRecord implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public double b;
    public boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    StaggeredGridView$GridItemRecord() {
    }
    
    private StaggeredGridView$GridItemRecord(final Parcel parcel) {
        boolean c = true;
        this.a = parcel.readInt();
        this.b = parcel.readDouble();
        if (parcel.readByte() != (c ? 1 : 0)) {
            c = false;
        }
        this.c = c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return "GridItemRecord.ListSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " column:" + this.a + " heightRatio:" + this.b + " isHeaderFooter:" + this.c + "}";
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.b);
        boolean b;
        if (this.c) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
    }
}
