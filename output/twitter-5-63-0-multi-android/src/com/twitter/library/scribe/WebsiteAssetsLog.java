// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class WebsiteAssetsLog implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final String b;
    final String c;
    final String d;
    final long e;
    final String f;
    final ArrayList g;
    
    static {
        CREATOR = (Parcelable$Creator)new y();
    }
    
    public WebsiteAssetsLog(final Parcel parcel) {
        this.g = new ArrayList();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        this.f = parcel.readString();
        parcel.readTypedList((List)this.g, WebsiteAssetsLog$WebsiteAsset.CREATOR);
    }
    
    public WebsiteAssetsLog(final String a, final String b, final String c, final String d, final long e, final String f) {
        this.g = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        if (this.a != null) {
            jsonGenerator.a("website_url", this.a);
        }
        if (this.b != null) {
            jsonGenerator.a("website_dest_url", this.b);
        }
        if (this.c != null) {
            jsonGenerator.a("website_assets", this.c);
        }
        if (this.f != null) {
            jsonGenerator.a("promoted_id", this.f);
        }
        if (this.d != null) {
            jsonGenerator.a("card_url", this.d);
        }
        if (this.e != 0L) {
            jsonGenerator.a("card_id", this.e);
        }
        if (this.f != null) {
            jsonGenerator.a("promoted_id", this.f);
        }
        if (this.g != null && this.g.size() > 0) {
            jsonGenerator.d("items");
            final Iterator<WebsiteAssetsLog$WebsiteAsset> iterator = this.g.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(jsonGenerator);
            }
            jsonGenerator.b();
        }
    }
    
    public void a(final String s, final long n, final long n2, final String s2, final boolean b) {
        this.g.add(new WebsiteAssetsLog$WebsiteAsset(s, n, n2, s2, b));
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeTypedList((List)this.g);
    }
}
