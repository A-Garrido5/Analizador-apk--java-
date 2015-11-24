// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.refresh.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class RefreshableListView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    public boolean b;
    public int c;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public RefreshableListView$SavedState(final Parcel parcel) {
        boolean b = true;
        super(parcel);
        this.a = (parcel.readInt() == (b ? 1 : 0) && b);
        if (parcel.readInt() != (b ? 1 : 0)) {
            b = false;
        }
        this.b = b;
        this.c = parcel.readInt();
    }
    
    public RefreshableListView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        super.writeToParcel(parcel, n);
        int n3;
        if (this.a) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.b) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeInt(this.c);
    }
}
