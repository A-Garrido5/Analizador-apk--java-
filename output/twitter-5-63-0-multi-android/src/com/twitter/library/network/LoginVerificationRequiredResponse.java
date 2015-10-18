// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LoginVerificationRequiredResponse implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    public LoginVerificationRequiredResponse(final long a, final String b, final int c, final String d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public LoginVerificationRequiredResponse(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
    }
}
