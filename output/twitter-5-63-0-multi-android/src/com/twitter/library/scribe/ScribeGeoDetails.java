// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ScribeGeoDetails implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public List c;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public ScribeGeoDetails() {
        this.a = -1;
        this.b = -1;
        this.c = new ArrayList();
    }
    
    public ScribeGeoDetails(final Parcel parcel) {
        this.a = -1;
        this.b = -1;
        this.c = new ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readArrayList(ScribeGeoDetails$ScribeGeoPlace.class.getClassLoader());
    }
    
    public ScribeGeoDetails$ScribeGeoPlace a(final String a, final TwitterPlace$PlaceType twitterPlace$PlaceType, final double c, final double d, final String e, final int f, final int g, final int h, final String i, final String j, final long k) {
        final ScribeGeoDetails$ScribeGeoPlace scribeGeoDetails$ScribeGeoPlace = new ScribeGeoDetails$ScribeGeoPlace();
        scribeGeoDetails$ScribeGeoPlace.a = a;
        scribeGeoDetails$ScribeGeoPlace.b = twitterPlace$PlaceType.toString();
        scribeGeoDetails$ScribeGeoPlace.c = c;
        scribeGeoDetails$ScribeGeoPlace.d = d;
        scribeGeoDetails$ScribeGeoPlace.e = e;
        scribeGeoDetails$ScribeGeoPlace.f = f;
        scribeGeoDetails$ScribeGeoPlace.g = g;
        scribeGeoDetails$ScribeGeoPlace.h = h;
        scribeGeoDetails$ScribeGeoPlace.i = i;
        scribeGeoDetails$ScribeGeoPlace.j = j;
        scribeGeoDetails$ScribeGeoPlace.k = k;
        this.c.add(scribeGeoDetails$ScribeGeoPlace);
        return scribeGeoDetails$ScribeGeoPlace;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        boolean b = true;
        jsonGenerator.c();
        if (this.a != -1) {
            jsonGenerator.a("interacted_poi_list", this.a > 0 && b);
        }
        if (this.b != -1) {
            if (this.b <= 0) {
                b = false;
            }
            jsonGenerator.a("interacted_server_search", b);
        }
        if (!this.c.isEmpty()) {
            jsonGenerator.d("geo_place_details");
            final Iterator<ScribeGeoDetails$ScribeGeoPlace> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(jsonGenerator);
            }
            jsonGenerator.b();
        }
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeList(this.c);
    }
}
