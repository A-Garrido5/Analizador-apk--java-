// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

public enum TwRadioType
{
    a("NONE", 0), 
    b("UNKNOWN", 1), 
    c("GPRS", 2), 
    d("EDGE", 3), 
    e("UMTS", 4), 
    f("CDMA", 5), 
    g("EVDO_0", 6), 
    h("EVDO_A", 7), 
    i("X1RTT", 8), 
    j("HSDPA", 9), 
    k("HSUPA", 10), 
    l("HSPA", 11), 
    m("IDEN", 12), 
    n("EVDO_B", 13), 
    o("LTE", 14), 
    p("EHRPD", 15), 
    q("HSPAP", 16), 
    r("GSM", 17), 
    s("WIFI", 18);
    
    private TwRadioType(final String s, final int n) {
    }
}
