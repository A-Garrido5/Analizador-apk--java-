// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class BottomSheetDrawerLayout$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    private BottomSheetDrawerLayout$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readInt() != 0);
    }
    
    BottomSheetDrawerLayout$SavedState(final Parcelable parcelable) {
        super(parcelable);
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
