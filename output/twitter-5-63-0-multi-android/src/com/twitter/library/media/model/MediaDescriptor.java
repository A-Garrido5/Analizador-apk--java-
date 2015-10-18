// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class MediaDescriptor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final boolean b;
    public final String c;
    public final long d;
    public final String e;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public MediaDescriptor(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = (parcel.readByte() != 0);
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readString();
    }
    
    public MediaDescriptor(final String s, final boolean b) {
        this(s, b, "", -1L, "");
    }
    
    public MediaDescriptor(final String a, final boolean b, final String c, final long d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        boolean b;
        if (this.b) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
    }
}
