// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ClientConfiguration implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final UrlConfiguration a;
    public final ay b;
    
    static {
        CREATOR = (Parcelable$Creator)new n();
    }
    
    public ClientConfiguration(final Parcel parcel) {
        this.a = new UrlConfiguration(parcel);
        this.b = new ay(parcel.readString());
    }
    
    public ClientConfiguration(final UrlConfiguration a, final ay b) {
        this.a = a;
        this.b = b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        this.a.writeToParcel(parcel, n);
        parcel.writeString(this.b.toString());
    }
}
