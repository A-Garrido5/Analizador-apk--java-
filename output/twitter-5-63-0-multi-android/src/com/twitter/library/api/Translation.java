// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Translation implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final TweetEntities e;
    
    static {
        CREATOR = (Parcelable$Creator)new aw();
    }
    
    public Translation(final long a, final String b, final String c, final String d, final TweetEntities e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public Translation(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (TweetEntities)parcel.readSerializable();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeSerializable((Serializable)this.e);
    }
}
