// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterLocation implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    
    static {
        CREATOR = (Parcelable$Creator)new bf();
    }
    
    public TwitterLocation(final Parcel parcel) {
        this.a = parcel.readString();
        this.d = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
    
    public TwitterLocation(final String a, final long d) {
        this.a = a;
        this.d = d;
        this.b = null;
        this.c = null;
    }
    
    public TwitterLocation(final String a, final long d, final String b, final String c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public String c() {
        return this.c;
    }
    
    public long d() {
        return this.d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeLong(this.d);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
