// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class ScrollingMarqueeTextView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    private ScrollingMarqueeTextView$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readInt() != 0);
    }
    
    ScrollingMarqueeTextView$SavedState(final Parcelable parcelable, final boolean a) {
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
