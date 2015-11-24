// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class AbsPagesAdapter$PageSavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public AbsPagesAdapter$PageSavedState(final Parcel parcel) {
        this.a = parcel.createStringArray();
    }
    
    public AbsPagesAdapter$PageSavedState(final List list) {
        final int size = list.size();
        final String[] a = new String[size];
        for (int i = 0; i < size; ++i) {
            a[i] = list.get(i).a();
        }
        this.a = a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringArray(this.a);
    }
}
