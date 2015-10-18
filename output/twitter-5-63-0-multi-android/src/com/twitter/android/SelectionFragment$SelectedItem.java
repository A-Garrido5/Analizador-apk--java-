// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SelectionFragment$SelectedItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public long a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new sg();
    }
    
    public SelectionFragment$SelectedItem(final long a, final String s) {
        this.a = a;
        this.b = s.trim();
    }
    
    public SelectionFragment$SelectedItem(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof SelectionFragment$SelectedItem && ((SelectionFragment$SelectedItem)o).a == this.a;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.a ^ this.a >>> 32);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.a);
        parcel.writeString(this.b);
    }
}
