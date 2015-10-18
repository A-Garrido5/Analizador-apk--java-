// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ScribeAssociation implements Parcelable
{
    private int a;
    private String b;
    private int c;
    private String d;
    private String e;
    private String f;
    
    protected ScribeAssociation() {
    }
    
    protected ScribeAssociation(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
    
    public ScribeAssociation a(final int a) {
        this.a = a;
        return this;
    }
    
    public ScribeAssociation a(final long n) {
        this.b = String.valueOf(n);
        return this;
    }
    
    public ScribeAssociation a(final String b) {
        this.b = b;
        return this;
    }
    
    public String a() {
        return this.d;
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.e(String.valueOf(this.a));
        if (this.b != null) {
            jsonGenerator.a("association_id", this.b);
        }
        if (this.c != -1) {
            jsonGenerator.a("association_type", this.c);
        }
        if (this.d != null) {
            jsonGenerator.e("association_namespace");
            jsonGenerator.a("page", this.d);
            if (this.e != null) {
                jsonGenerator.a("section", this.e);
            }
            if (this.f != null) {
                jsonGenerator.a("component", this.f);
            }
            jsonGenerator.d();
        }
        jsonGenerator.d();
    }
    
    public ScribeAssociation b(final int c) {
        this.c = c;
        return this;
    }
    
    public ScribeAssociation b(final String d) {
        this.d = d;
        return this;
    }
    
    public String b() {
        return this.e;
    }
    
    public ScribeAssociation c(final String e) {
        this.e = e;
        return this;
    }
    
    public String c() {
        return this.f;
    }
    
    public int d() {
        return this.a;
    }
    
    public ScribeAssociation d(final String f) {
        this.f = f;
        return this;
    }
    
    public String e() {
        return this.b;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
