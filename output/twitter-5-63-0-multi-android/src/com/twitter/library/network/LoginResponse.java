// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class LoginResponse implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final OAuthToken a;
    public final LoginVerificationRequiredResponse b;
    public final String c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new j();
    }
    
    public LoginResponse(final int d, final long n, final String s, final int n2, final String s2, final int n3) {
        this.d = d;
        this.a = null;
        this.b = new LoginVerificationRequiredResponse(n, s, n2, s2, n3);
        this.c = null;
    }
    
    public LoginResponse(final int n, final String s, final String s2) {
        this(n, s, s2, null);
    }
    
    public LoginResponse(final int d, final String s, final String s2, final String c) {
        this.d = d;
        this.a = new OAuthToken(s, s2);
        this.b = null;
        this.c = c;
    }
    
    public LoginResponse(final Parcel parcel) {
        this.d = parcel.readInt();
        this.a = (OAuthToken)parcel.readParcelable(OAuthToken.class.getClassLoader());
        this.b = (LoginVerificationRequiredResponse)parcel.readParcelable(LoginVerificationRequiredResponse.class.getClassLoader());
        this.c = null;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.d);
        parcel.writeParcelable((Parcelable)this.a, 0);
        parcel.writeParcelable((Parcelable)this.b, 0);
    }
}
