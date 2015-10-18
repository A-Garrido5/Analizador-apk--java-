// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum RadioStatus
{
    a("UNKNOWN", 0, 0), 
    b("GPRS", 1, 1), 
    c("EDGE", 2, 2), 
    d("UMTS", 3, 3), 
    e("HSDPA", 4, 4), 
    f("HSUPA", 5, 5), 
    g("HSPA", 6, 6), 
    h("CDMA", 7, 7), 
    i("EVDO_0", 8, 8), 
    j("EVDO_A", 9, 9), 
    k("EVDO_B", 10, 10), 
    l("ONExRTT", 11, 11), 
    m("IDEN", 12, 12), 
    n("LTE", 13, 13), 
    o("EHRPD", 14, 14), 
    p("HSPAP", 15, 15);
    
    private static final SparseArray q;
    private final int mValue;
    
    static {
        int n2 = 0;
        q = new SparseArray();
        for (RadioStatus[] values = values(); n2 < values.length; ++n2) {
            final RadioStatus radioStatus = values[n2];
            RadioStatus.q.put(radioStatus.a(), (Object)radioStatus);
        }
    }
    
    private RadioStatus(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static RadioStatus a(final int n) {
        return (RadioStatus)RadioStatus.q.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
