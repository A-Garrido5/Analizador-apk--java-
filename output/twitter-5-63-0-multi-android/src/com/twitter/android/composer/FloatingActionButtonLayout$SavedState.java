// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class FloatingActionButtonLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new bf();
    }
    
    public FloatingActionButtonLayout$SavedState(final Parcel parcel) {
        boolean a = true;
        super(parcel);
        if (parcel.readInt() != (a ? 1 : 0)) {
            a = false;
        }
        this.a = a;
    }
    
    public FloatingActionButtonLayout$SavedState(final Parcelable parcelable, final boolean a) {
        super(parcelable);
        this.a = a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        int n2;
        if (this.a) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
