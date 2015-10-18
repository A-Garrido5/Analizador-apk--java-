// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import java.io.Serializable;
import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.api.geo.TwitterPlace;
import android.os.Parcel;
import com.twitter.library.api.geo.GeoTag;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class GeoTagState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final GeoTagState a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final GeoTag e;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
        a = new GeoTagState();
    }
    
    private GeoTagState() {
        this.e = null;
        this.b = false;
        this.d = false;
        this.c = false;
    }
    
    private GeoTagState(final Parcel parcel) {
        boolean c = true;
        this.e = (GeoTag)parcel.readSerializable();
        this.b = (parcel.readByte() == (c ? 1 : 0) && c);
        this.d = (parcel.readByte() == (c ? 1 : 0) && c);
        if (parcel.readByte() != (c ? 1 : 0)) {
            c = false;
        }
        this.c = c;
    }
    
    public GeoTagState(final GeoTag e, final boolean b, final boolean d, final boolean c) {
        if (e == null) {
            throw new IllegalArgumentException("Cannot geotag state with null geo tag");
        }
        if (d && !b) {
            throw new IllegalArgumentException("All geotags from draft must be explicit");
        }
        this.e = e;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public GeoTagState(final TwitterPlace twitterPlace, final Coordinate coordinate, final String s, final boolean b, final boolean b2, final boolean b3) {
        this(new GeoTag(twitterPlace, coordinate, s), b, b2, b3);
    }
    
    public static GeoTagState a() {
        return GeoTagState.a;
    }
    
    public GeoTagState a(final boolean b) {
        if (this.e == null) {
            throw new IllegalStateException("Cannot change a null geotag's precision");
        }
        if (this.c == b) {
            return this;
        }
        return new GeoTagState(this.e.a(), this.e.b(), this.e.c(), this.b, this.d, b);
    }
    
    public GeoTagState b() {
        if (this.e == null) {
            throw new IllegalStateException("Cannot make a null geotag explicit");
        }
        if (this.b) {
            return this;
        }
        return new GeoTagState(this.e.a(), this.e.b(), this.e.c(), true, this.d, this.c);
    }
    
    public boolean c() {
        return this.e != null;
    }
    
    public boolean d() {
        return this.c() && this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public TwitterPlace e() {
        if (this.e == null) {
            throw new IllegalStateException("Cannot getPlace when there is no geotag");
        }
        return this.e.a();
    }
    
    public GeoTag f() {
        if (this.e == null || this.d) {
            return null;
        }
        if (this.c) {
            return new GeoTag(this.e.a(), this.e.b(), this.e.c());
        }
        return new GeoTag(this.e.a(), null, this.e.c());
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeSerializable((Serializable)this.e);
        int n3;
        if (this.b) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeByte((byte)n3);
        int n4;
        if (this.d) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeByte((byte)n4);
        if (!this.c) {
            n2 = 0;
        }
        parcel.writeByte((byte)n2);
    }
}
