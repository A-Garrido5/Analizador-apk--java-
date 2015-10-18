// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ReferralCampaign implements Parcelable, ab
{
    public static final Parcelable$Creator CREATOR;
    private String a;
    private long b;
    private String c;
    private long d;
    private String e;
    
    static {
        CREATOR = (Parcelable$Creator)new aq();
    }
    
    public ReferralCampaign() {
    }
    
    public ReferralCampaign(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readString();
    }
    
    public long a() {
        return 0L;
    }
    
    public void a(final long b) {
        this.b = b;
    }
    
    public void a(final String a) {
        this.a = a;
    }
    
    public String b() {
        return this.a;
    }
    
    public void b(final long d) {
        this.d = d;
    }
    
    public void b(final String c) {
        this.c = c;
    }
    
    public String c() {
        return this.a;
    }
    
    public void c(final String e) {
        this.e = e;
    }
    
    public long d() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.c;
    }
    
    public long f() {
        return this.d;
    }
    
    public String g() {
        return this.e;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
    }
}
