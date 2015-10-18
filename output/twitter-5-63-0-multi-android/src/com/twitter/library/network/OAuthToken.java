// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class OAuthToken implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new y();
    }
    
    public OAuthToken(final Parcel parcel) {
        this.b = parcel.readString();
        this.a = parcel.readString();
    }
    
    public OAuthToken(final String b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.a);
    }
}
