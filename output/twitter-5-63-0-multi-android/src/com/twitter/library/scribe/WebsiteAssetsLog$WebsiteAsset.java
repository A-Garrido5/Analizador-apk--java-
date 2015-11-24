// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class WebsiteAssetsLog$WebsiteAsset implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final long b;
    final long c;
    final String d;
    final boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new z();
    }
    
    public WebsiteAssetsLog$WebsiteAsset(final Parcel parcel) {
        boolean e = true;
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readString();
        if (parcel.readInt() != (e ? 1 : 0)) {
            e = false;
        }
        this.e = e;
    }
    
    public WebsiteAssetsLog$WebsiteAsset(final String a, final long b, final long c, final String d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.a("asset_type", this.d);
        jsonGenerator.a("time_to_load", this.b);
        jsonGenerator.a("asset_size", this.c);
        jsonGenerator.a("asset_url", this.a);
        jsonGenerator.a("asset_prefetched", this.e);
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        int n2;
        if (this.e) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
