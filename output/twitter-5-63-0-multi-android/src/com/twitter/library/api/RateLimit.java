// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RateLimit implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final long b;
    private int c;
    
    static {
        CREATOR = (Parcelable$Creator)new ap();
    }
    
    public RateLimit(final int c, final int a, final long b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public RateLimit(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }
    
    public int a() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }
}
