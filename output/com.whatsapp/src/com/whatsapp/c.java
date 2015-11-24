// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class c extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    int a;
    
    static {
        CREATOR = (Parcelable$Creator)new r();
    }
    
    private c(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }
    
    c(final Parcel parcel, final q_ q_) {
        this(parcel);
    }
    
    public c(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
    }
}
