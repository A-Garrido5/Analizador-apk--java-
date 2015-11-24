// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.metrics;

public class c extends ix
{
    public c(final String s, final in in) {
        super("dm:send_", c.m, ig.a("DMSendMetric", s), in);
    }
    
    public static c a(final String s, final ir ir) {
        ig ig = ir.a(ig.a("DMSendMetric", s));
        if (ig == null) {
            ig = ir.d(new c(s, ir));
        }
        return (c)ig;
    }
    
    public void a(final boolean b) {
        String o;
        if (b) {
            o = "dm:send_success";
        }
        else {
            o = "dm:send_failure";
        }
        this.o = o;
        super.j();
    }
}
