// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.performance;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeLog;

public class PerformanceScribeLog extends ScribeLog
{
    public static final Parcelable$Creator CREATOR;
    int e;
    private final String f;
    private String g;
    private long h;
    private long i;
    
    static {
        CREATOR = (Parcelable$Creator)new com.twitter.library.scribe.performance.b();
    }
    
    public PerformanceScribeLog(final Parcel parcel) {
        super(parcel);
        this.f("perftown");
        this.f = parcel.readString();
        this.e = parcel.readInt();
        this.h = parcel.readLong();
        this.g = parcel.readString();
        this.i = parcel.readLong();
    }
    
    public PerformanceScribeLog(final String f, final long n) {
        super(n);
        this.f("perftown");
        this.f = f;
    }
    
    private void b(final JsonGenerator jsonGenerator) {
        final id d = ir.b().d();
        jsonGenerator.e("device_info");
        if (d.a != 0) {
            jsonGenerator.a("cpu_cores", d.a);
        }
        jsonGenerator.a("available_heap", d.b);
        jsonGenerator.a("display_info", d.c);
        jsonGenerator.d();
    }
    
    public PerformanceScribeLog a(final long h, final long i) {
        this.e = 2;
        this.h = h;
        this.i = i;
        return this;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        this.b(jsonGenerator);
        jsonGenerator.a("product", ScribeLog.d());
        jsonGenerator.a("duration_ms", this.h);
        jsonGenerator.a("description", this.f);
        if (this.g != null) {
            jsonGenerator.a("metadata", this.g);
        }
        jsonGenerator.a("profiler_type", this.e);
        if (this.e == 2 || this.e == 3) {
            jsonGenerator.a("event_value", this.i);
        }
    }
    
    public PerformanceScribeLog b(final long h, final long i) {
        this.e = 3;
        this.h = h;
        this.i = i;
        return this;
    }
    
    public PerformanceScribeLog c(final long h) {
        this.e = 0;
        this.h = h;
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public PerformanceScribeLog k(final String g) {
        this.g = g;
        return this;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.f);
        parcel.writeInt(this.e);
        parcel.writeLong(this.h);
        parcel.writeString(this.g);
        parcel.writeLong(this.i);
    }
}
