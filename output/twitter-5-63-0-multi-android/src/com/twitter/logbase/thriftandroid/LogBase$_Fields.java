// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.logbase.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum LogBase$_Fields implements d
{
    a("TRANSACTION_ID", 0, (short)1, "transaction_id"), 
    b("IP_ADDRESS", 1, (short)2, "ip_address"), 
    c("USER_ID", 2, (short)3, "user_id"), 
    d("GUEST_ID", 3, (short)4, "guest_id"), 
    e("TIMESTAMP", 4, (short)5, "timestamp"), 
    f("USER_AGENT", 5, (short)6, "user_agent"), 
    g("REFERER", 6, (short)7, "referer"), 
    h("LANGUAGE", 7, (short)8, "language"), 
    i("PAGE", 8, (short)9, "page"), 
    j("SESSION_ID", 9, (short)10, "session_id"), 
    k("SESSION_CREATED_AT", 10, (short)11, "session_created_at"), 
    l("CLIENT_APP_ID", 11, (short)12, "client_app_id"), 
    m("DEVICE_ID", 12, (short)13, "device_id"), 
    n("IS_SSL", 13, (short)14, "is_ssl"), 
    o("COUNTRY", 14, (short)15, "country"), 
    p("PID", 15, (short)16, "pid"), 
    q("DO_NOT_TRACK", 16, (short)17, "do_not_track");
    
    private static final Map r;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        r = new HashMap();
        for (final LogBase$_Fields logBase$_Fields : EnumSet.allOf(LogBase$_Fields.class)) {
            LogBase$_Fields.r.put(logBase$_Fields.b(), logBase$_Fields);
        }
    }
    
    private LogBase$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
        this._thriftId = thriftId;
        this._fieldName = fieldName;
    }
    
    @Override
    public short a() {
        return this._thriftId;
    }
    
    public String b() {
        return this._fieldName;
    }
}
