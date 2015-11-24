// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VideoCardData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public VideoCardData(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
    
    private VideoCardData(final g g) {
        this.a = g.a;
        this.b = g.b;
        this.c = g.c;
        this.d = g.d;
        this.e = g.e;
        this.f = g.f;
        this.g = g.g;
        this.h = g.h;
        this.i = g.i;
    }
    
    public static g a() {
        return new g(null);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
