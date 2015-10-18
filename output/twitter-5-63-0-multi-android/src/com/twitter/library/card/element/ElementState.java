// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ElementState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public ElementState(final int n) {
        this.a = new int[n];
    }
    
    public ElementState(final Parcel parcel) {
        this.a = parcel.createIntArray();
    }
    
    public boolean a() {
        return this.a.length != 0;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
    }
}
