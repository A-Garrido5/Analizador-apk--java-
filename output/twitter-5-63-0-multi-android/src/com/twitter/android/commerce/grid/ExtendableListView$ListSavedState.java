// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.widget.AbsListView;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class ExtendableListView$ListSavedState extends ClassLoaderSavedState
{
    public static final Parcelable$Creator CREATOR;
    protected long b;
    protected long c;
    protected int d;
    protected int e;
    protected int f;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public ExtendableListView$ListSavedState(final Parcel parcel) {
        super(parcel);
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }
    
    public ExtendableListView$ListSavedState(final Parcelable parcelable) {
        super(parcelable, AbsListView.class.getClassLoader());
    }
    
    @Override
    public String toString() {
        return "ExtendableListView.ListSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.b + " firstId=" + this.c + " viewTop=" + this.d + " mPosition=" + this.e + " height=" + this.f + "}";
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
