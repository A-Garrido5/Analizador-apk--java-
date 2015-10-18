// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ScribeGeoDetails$ScribeGeoPlace implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public String b;
    public double c;
    public double d;
    public String e;
    public int f;
    public int g;
    public int h;
    public String i;
    public String j;
    public long k;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    public ScribeGeoDetails$ScribeGeoPlace() {
        this.c = Double.NaN;
        this.d = Double.NaN;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.k = -1L;
    }
    
    public ScribeGeoDetails$ScribeGeoPlace(final Parcel parcel) {
        this.c = Double.NaN;
        this.d = Double.NaN;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.k = -1L;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readLong();
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        if (this.a != null) {
            jsonGenerator.a("place_id", this.a);
        }
        if (this.b != null) {
            jsonGenerator.a("place_type", this.b);
        }
        if (!Double.isNaN(this.c)) {
            jsonGenerator.a("place_lat", this.c);
        }
        if (!Double.isNaN(this.d)) {
            jsonGenerator.a("place_lon", this.d);
        }
        if (this.e != null) {
            jsonGenerator.a("source", this.e);
        }
        if (this.f != -1) {
            jsonGenerator.a("is_autotag", this.f > 0);
        }
        if (this.g != -1) {
            jsonGenerator.a("offset", this.g);
        }
        if (this.h != -1) {
            jsonGenerator.a("rank", this.h);
        }
        if (this.i != null) {
            jsonGenerator.a("query", this.i);
        }
        if (this.j != null) {
            jsonGenerator.a("state", this.j);
        }
        if (this.k != -1L) {
            jsonGenerator.a("last_interaction_time", this.k);
        }
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeLong(this.k);
    }
}
