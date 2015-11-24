// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ScribeLog$SearchDetails implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public ScribeLog$SearchDetails(final Parcel parcel) {
        boolean e = true;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (parcel.readInt() == (e ? 1 : 0) && e);
        if (parcel.readInt() != (e ? 1 : 0)) {
            e = false;
        }
        this.e = e;
    }
    
    public ScribeLog$SearchDetails(final String a, final String b, final String c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.e("search_details");
        jsonGenerator.a("query", this.a);
        jsonGenerator.a("result_filter", this.b);
        String s;
        if (this.d) {
            s = "following";
        }
        else {
            s = "all";
        }
        jsonGenerator.a("social_filter", s);
        if (this.c != null) {
            jsonGenerator.a("module_type", this.c);
        }
        if (this.e) {
            jsonGenerator.a("near", "me");
        }
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int n3;
        if (this.d) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.e) {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
