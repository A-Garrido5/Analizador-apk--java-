// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum RequestInfo$_Fields implements d
{
    a("IDS", 0, (short)1, "ids"), 
    b("CLIENT_IP_ADDRESS", 1, (short)2, "clientIpAddress"), 
    c("OAUTH_APP_ID", 2, (short)4, "oauthAppId"), 
    d("USER_AGENT", 3, (short)5, "userAgent"), 
    e("LANGUAGE_CODE", 4, (short)6, "languageCode"), 
    f("COUNTRY_CODE", 5, (short)7, "countryCode");
    
    private static final Map g;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        g = new HashMap();
        for (final RequestInfo$_Fields requestInfo$_Fields : EnumSet.allOf(RequestInfo$_Fields.class)) {
            RequestInfo$_Fields.g.put(requestInfo$_Fields.b(), requestInfo$_Fields);
        }
    }
    
    private RequestInfo$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
