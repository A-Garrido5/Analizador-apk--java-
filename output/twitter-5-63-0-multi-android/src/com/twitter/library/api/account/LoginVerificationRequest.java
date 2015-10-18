// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LoginVerificationRequest implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final LoginVerificationRequest a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public String g;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
        a = new LoginVerificationRequest("", "", "", "", "", 0L);
    }
    
    public LoginVerificationRequest(final Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.g = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
    }
    
    public LoginVerificationRequest(final String b, final String c, final String d, final String e, final long f) {
        this.b = b;
        this.c = c;
        this.g = "";
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public LoginVerificationRequest(final String b, final String c, final String g, final String d, final String e, final long f) {
        this.b = b;
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void a(final String g) {
        this.g = g;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.g);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }
}
