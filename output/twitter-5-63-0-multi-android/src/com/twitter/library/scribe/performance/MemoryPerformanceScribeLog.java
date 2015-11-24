// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.performance;

import java.util.Map;
import java.util.Iterator;
import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import java.util.HashMap;
import android.os.Parcelable$Creator;

public class MemoryPerformanceScribeLog extends PerformanceScribeLog
{
    public static final Parcelable$Creator CREATOR;
    private HashMap f;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public MemoryPerformanceScribeLog(final Parcel parcel) {
        super(parcel);
        this.f = parcel.readHashMap(HashMap.class.getClassLoader());
    }
    
    public MemoryPerformanceScribeLog(final String s, final long n, final HashMap f) {
        super(s, n);
        this.f = f;
        this.e = 4;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        super.a(jsonGenerator);
        jsonGenerator.e("mem_metrics");
        for (final String s : this.f.keySet()) {
            jsonGenerator.a(s, new BigDecimal(((Number)this.f.get(s)).toString()));
        }
        jsonGenerator.d();
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeMap((Map)this.f);
    }
}
