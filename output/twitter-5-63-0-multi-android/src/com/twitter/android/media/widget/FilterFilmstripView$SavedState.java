// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class FilterFilmstripView$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final float[] b;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public FilterFilmstripView$SavedState(final Parcel parcel) {
        super(parcel);
        this.b = parcel.createFloatArray();
        this.a = parcel.readInt();
    }
    
    public FilterFilmstripView$SavedState(final Parcelable parcelable, final float[] b, final int a) {
        super(parcelable);
        this.b = b;
        this.a = a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeFloatArray(this.b);
        parcel.writeInt(this.a);
    }
}
