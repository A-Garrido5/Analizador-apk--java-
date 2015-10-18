// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class ViewPagerScrollBar$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    
    static {
        CREATOR = (Parcelable$Creator)new ay();
    }
    
    public ViewPagerScrollBar$SavedState(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
    
    public ViewPagerScrollBar$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
